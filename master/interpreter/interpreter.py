from __future__ import annotations

from pathlib import Path

from master.config.cluster_config import GROUPS
from master.executor.executor import ClusterExecutor
from master.interpreter.ast_nodes import Deploy, NodeInfo, NodeRun, NodeUpdate, ParallelBlock, SensorRule
from master.interpreter.parser_engine import parse_file


class DSLInterpreter:
    def __init__(self, project_root: Path) -> None:
        self.executor = ClusterExecutor(project_root)

    def execute_file(self, file_path: str):
        ast = parse_file(file_path)
        results = []
        for node in ast:
            results.append(self.execute(node))
        return results

    def execute(self, node):
        if isinstance(node, NodeRun):
            return self.executor.run_script(node.node, node.script)

        if isinstance(node, NodeUpdate):
            if node.target in GROUPS:
                return self.executor.run_group_update(node.target)
            return self.executor.update_node(node.target)

        if isinstance(node, NodeInfo):
            return self.executor.info_node(node.node)

        if isinstance(node, Deploy):
            return self.executor.deploy_app(node.app, node.group)

        if isinstance(node, SensorRule):
            temperature = self.executor.read_temperature(node.source_node)
            print(
                f"[sensor] {node.source_node}.temp = {temperature} | umbral = {node.threshold}"
            )
            if temperature > node.threshold:
                return self.executor.run_script(node.action_node, node.script)
            print(f"[sensor] condicion no cumplida en {node.source_node}")
            return None

        if isinstance(node, ParallelBlock):
            callables = []
            for statement in node.statements:
                if isinstance(statement, NodeRun):
                    callables.append((self.executor.run_script, (statement.node, statement.script)))
                elif isinstance(statement, NodeUpdate):
                    if statement.target in GROUPS:
                        for group_node in GROUPS[statement.target]:
                            callables.append((self.executor.update_node, (group_node,)))
                    else:
                        callables.append((self.executor.update_node, (statement.target,)))
                elif isinstance(statement, NodeInfo):
                    callables.append((self.executor.info_node, (statement.node,)))
                else:
                    raise ValueError("Solo se admiten acciones ejecutables dentro de parallel")
            return self.executor.run_parallel(callables)

        raise TypeError(f"Tipo de AST no soportado: {type(node).__name__}")
