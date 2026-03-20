from dataclasses import dataclass


@dataclass
class NodeRun:
    node: str
    script: str


@dataclass
class NodeUpdate:
    target: str


@dataclass
class NodeInfo:
    node: str


@dataclass
class Deploy:
    app: str
    group: str


@dataclass
class SensorRule:
    source_node: str
    threshold: int
    action_node: str
    script: str


@dataclass
class ParallelBlock:
    statements: list
