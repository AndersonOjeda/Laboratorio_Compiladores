# Generated from master/interpreter/grammar/ClusterDSL.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ClusterDSLParser import ClusterDSLParser
else:
    from ClusterDSLParser import ClusterDSLParser

# This class defines a complete listener for a parse tree produced by ClusterDSLParser.
class ClusterDSLListener(ParseTreeListener):

    # Enter a parse tree produced by ClusterDSLParser#program.
    def enterProgram(self, ctx:ClusterDSLParser.ProgramContext):
        pass

    # Exit a parse tree produced by ClusterDSLParser#program.
    def exitProgram(self, ctx:ClusterDSLParser.ProgramContext):
        pass


    # Enter a parse tree produced by ClusterDSLParser#statement.
    def enterStatement(self, ctx:ClusterDSLParser.StatementContext):
        pass

    # Exit a parse tree produced by ClusterDSLParser#statement.
    def exitStatement(self, ctx:ClusterDSLParser.StatementContext):
        pass


    # Enter a parse tree produced by ClusterDSLParser#nodeRunStmt.
    def enterNodeRunStmt(self, ctx:ClusterDSLParser.NodeRunStmtContext):
        pass

    # Exit a parse tree produced by ClusterDSLParser#nodeRunStmt.
    def exitNodeRunStmt(self, ctx:ClusterDSLParser.NodeRunStmtContext):
        pass


    # Enter a parse tree produced by ClusterDSLParser#nodeUpdateStmt.
    def enterNodeUpdateStmt(self, ctx:ClusterDSLParser.NodeUpdateStmtContext):
        pass

    # Exit a parse tree produced by ClusterDSLParser#nodeUpdateStmt.
    def exitNodeUpdateStmt(self, ctx:ClusterDSLParser.NodeUpdateStmtContext):
        pass


    # Enter a parse tree produced by ClusterDSLParser#nodeInfoStmt.
    def enterNodeInfoStmt(self, ctx:ClusterDSLParser.NodeInfoStmtContext):
        pass

    # Exit a parse tree produced by ClusterDSLParser#nodeInfoStmt.
    def exitNodeInfoStmt(self, ctx:ClusterDSLParser.NodeInfoStmtContext):
        pass


    # Enter a parse tree produced by ClusterDSLParser#deployStmt.
    def enterDeployStmt(self, ctx:ClusterDSLParser.DeployStmtContext):
        pass

    # Exit a parse tree produced by ClusterDSLParser#deployStmt.
    def exitDeployStmt(self, ctx:ClusterDSLParser.DeployStmtContext):
        pass


    # Enter a parse tree produced by ClusterDSLParser#sensorStmt.
    def enterSensorStmt(self, ctx:ClusterDSLParser.SensorStmtContext):
        pass

    # Exit a parse tree produced by ClusterDSLParser#sensorStmt.
    def exitSensorStmt(self, ctx:ClusterDSLParser.SensorStmtContext):
        pass


    # Enter a parse tree produced by ClusterDSLParser#parallelBlock.
    def enterParallelBlock(self, ctx:ClusterDSLParser.ParallelBlockContext):
        pass

    # Exit a parse tree produced by ClusterDSLParser#parallelBlock.
    def exitParallelBlock(self, ctx:ClusterDSLParser.ParallelBlockContext):
        pass



del ClusterDSLParser