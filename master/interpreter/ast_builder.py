from __future__ import annotations

from master.interpreter.ast_nodes import Deploy, NodeInfo, NodeRun, NodeUpdate, ParallelBlock, SensorRule
from master.interpreter.generated.ClusterDSLParser import ClusterDSLParser
from master.interpreter.generated.ClusterDSLVisitor import ClusterDSLVisitor


def _strip_quotes(text: str) -> str:
    return bytes(text[1:-1], "utf-8").decode("unicode_escape")


class ASTBuilder(ClusterDSLVisitor):
    def visitProgram(self, ctx: ClusterDSLParser.ProgramContext):
        statements = []
        for statement_ctx in ctx.statement():
            node = self.visit(statement_ctx)
            if node is not None:
                statements.append(node)
        return statements

    def visitStatement(self, ctx: ClusterDSLParser.StatementContext):
        for child_name in (
            "nodeRunStmt",
            "nodeUpdateStmt",
            "nodeInfoStmt",
            "deployStmt",
            "sensorStmt",
            "parallelBlock",
        ):
            child = getattr(ctx, child_name)()
            if child:
                return self.visit(child)
        return None

    def visitNodeRunStmt(self, ctx: ClusterDSLParser.NodeRunStmtContext):
        return NodeRun(node=ctx.IDENT().getText(), script=_strip_quotes(ctx.STRING().getText()))

    def visitNodeUpdateStmt(self, ctx: ClusterDSLParser.NodeUpdateStmtContext):
        return NodeUpdate(target=ctx.IDENT().getText())

    def visitGroupUpdateStmt(self, ctx: ClusterDSLParser.GroupUpdateStmtContext):
        return NodeUpdate(target=ctx.IDENT().getText())

    def visitNodeInfoStmt(self, ctx: ClusterDSLParser.NodeInfoStmtContext):
        return NodeInfo(node=ctx.IDENT().getText())

    def visitDeployStmt(self, ctx: ClusterDSLParser.DeployStmtContext):
        return Deploy(app=ctx.IDENT(0).getText(), group=ctx.IDENT(1).getText())

    def visitSensorStmt(self, ctx: ClusterDSLParser.SensorStmtContext):
        return SensorRule(
            source_node=ctx.IDENT(0).getText(),
            threshold=int(ctx.INT().getText()),
            action_node=ctx.IDENT(1).getText(),
            script=_strip_quotes(ctx.STRING().getText()),
        )

    def visitParallelBlock(self, ctx: ClusterDSLParser.ParallelBlockContext):
        statements = []
        for statement_ctx in ctx.statement():
            node = self.visit(statement_ctx)
            if node is not None:
                statements.append(node)
        return ParallelBlock(statements=statements)
