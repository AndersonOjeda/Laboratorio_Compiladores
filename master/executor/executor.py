from __future__ import annotations

import os
import subprocess
import threading
from concurrent.futures import ThreadPoolExecutor, as_completed
from datetime import datetime
from pathlib import Path

from master.config.cluster_config import GROUPS, NODES


class ClusterExecutor:
    def __init__(self, project_root: Path) -> None:
        self.project_root = Path(project_root)
        self.cluster_root = self.project_root / "cluster"
        self._print_lock = threading.Lock()

    def run_script(self, node: str, script: str) -> str:
        self._ensure_node(node)
        script_path = self.cluster_root / node / "scripts" / script
        if not script_path.exists():
            raise FileNotFoundError(f"Script no encontrado: {script_path}")

        cmd = f"bash cluster/{node}/scripts/{script}"
        completed = subprocess.run(
            cmd,
            shell=True,
            cwd=self.project_root,
            capture_output=True,
            text=True,
            check=False,
        )

        output = completed.stdout.strip()
        if completed.stderr.strip():
            output = f"{output}\n{completed.stderr.strip()}".strip()

        formatted = self._format_output(node, cmd, output, completed.returncode)
        self._write_log(node, script, formatted)
        with self._print_lock:
            print(formatted)

        if completed.returncode != 0:
            raise RuntimeError(f"Fallo al ejecutar {script} en {node}")
        return formatted

    def update_node(self, node: str) -> str:
        return self.run_script(node, "update.sh")

    def info_node(self, node: str) -> str:
        return self.run_script(node, "info.sh")

    def deploy_app(self, app: str, group: str) -> list[str]:
        script = f"deploy_{app}.sh"
        return self.run_group(group, script)

    def run_group_update(self, group: str) -> list[str]:
        return self.run_group(group, "update.sh")

    def run_group(self, group: str, script: str) -> list[str]:
        nodes = self._ensure_group(group)
        results = []
        for node in nodes:
            results.append(self.run_script(node, script))
        return results

    def run_parallel(self, callables: list[tuple]) -> list[str]:
        results = []
        with ThreadPoolExecutor(max_workers=max(1, len(callables))) as pool:
            futures = [pool.submit(func, *args) for func, args in callables]
            for future in as_completed(futures):
                results.append(future.result())
        return results

    def read_temperature(self, node: str) -> int:
        self._ensure_node(node)
        return NODES[node]["temperature"]

    def _write_log(self, node: str, script: str, content: str) -> None:
        logs_dir = self.cluster_root / node / "logs"
        logs_dir.mkdir(parents=True, exist_ok=True)
        timestamp = datetime.utcnow().strftime("%Y%m%d_%H%M%S")
        log_file = logs_dir / f"{timestamp}_{script.replace('.sh', '')}.log"
        log_file.write_text(content + "\n", encoding="utf-8")

    def _ensure_node(self, node: str) -> None:
        if node not in NODES:
            raise ValueError(f"Nodo desconocido: {node}")

    def _ensure_group(self, group: str) -> list[str]:
        if group not in GROUPS:
            raise ValueError(f"Grupo desconocido: {group}")
        return GROUPS[group]

    def _format_output(self, node: str, cmd: str, output: str, returncode: int) -> str:
        lines = [
            f"[{node}] comando: {cmd}",
            f"[{node}] codigo_salida: {returncode}",
            output or f"[{node}] sin salida",
        ]
        return "\n".join(lines)
