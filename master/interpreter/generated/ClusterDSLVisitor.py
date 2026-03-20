# Generated from master/interpreter/grammar/ClusterDSL.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ClusterDSLParser import ClusterDSLParser
else:
    from ClusterDSLParser import ClusterDSLParser

# This class defines a complete generic visitor for a parse tree produced by ClusterDSLParser.

class ClusterDSLVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ClusterDSLParser#program.
    def visitProgram(self, ctx:ClusterDSLParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClusterDSLParser#statement.
    def visitStatement(self, ctx:ClusterDSLParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClusterDSLParser#nodeRunStmt.
    def visitNodeRunStmt(self, ctx:ClusterDSLParser.NodeRunStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClusterDSLParser#nodeUpdateStmt.
    def visitNodeUpdateStmt(self, ctx:ClusterDSLParser.NodeUpdateStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClusterDSLParser#nodeInfoStmt.
    def visitNodeInfoStmt(self, ctx:ClusterDSLParser.NodeInfoStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClusterDSLParser#deployStmt.
    def visitDeployStmt(self, ctx:ClusterDSLParser.DeployStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClusterDSLParser#sensorStmt.
    def visitSensorStmt(self, ctx:ClusterDSLParser.SensorStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ClusterDSLParser#parallelBlock.
    def visitParallelBlock(self, ctx:ClusterDSLParser.ParallelBlockContext):
        return self.visitChildren(ctx)



del ClusterDSLParser