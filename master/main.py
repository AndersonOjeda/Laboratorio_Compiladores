from __future__ import annotations

import sys
from pathlib import Path

PROJECT_ROOT = Path(__file__).resolve().parents[1]
if str(PROJECT_ROOT) not in sys.path:
    sys.path.insert(0, str(PROJECT_ROOT))

from master.interpreter.interpreter import DSLInterpreter


def main() -> int:
    if len(sys.argv) != 2:
        print("Uso: python3 master/main.py <archivo.dsl>")
        return 1

    project_root = PROJECT_ROOT
    dsl_path = Path(sys.argv[1]).resolve()
    interpreter = DSLInterpreter(project_root)
    interpreter.execute_file(str(dsl_path))
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
