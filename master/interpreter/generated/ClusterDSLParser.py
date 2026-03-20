# Generated from master/interpreter/grammar/ClusterDSL.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,20,95,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,1,0,5,0,18,8,0,10,0,12,0,21,9,0,1,0,1,0,1,1,1,1,3,1,27,
        8,1,1,1,1,1,3,1,31,8,1,1,1,1,1,3,1,35,8,1,1,1,1,1,3,1,39,8,1,1,1,
        1,1,3,1,43,8,1,1,1,3,1,46,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,3,1,
        3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,
        6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,5,
        7,88,8,7,10,7,12,7,91,9,7,1,7,1,7,1,7,0,0,8,0,2,4,6,8,10,12,14,0,
        0,98,0,19,1,0,0,0,2,45,1,0,0,0,4,47,1,0,0,0,6,54,1,0,0,0,8,60,1,
        0,0,0,10,66,1,0,0,0,12,71,1,0,0,0,14,84,1,0,0,0,16,18,3,2,1,0,17,
        16,1,0,0,0,18,21,1,0,0,0,19,17,1,0,0,0,19,20,1,0,0,0,20,22,1,0,0,
        0,21,19,1,0,0,0,22,23,5,0,0,1,23,1,1,0,0,0,24,26,3,4,2,0,25,27,5,
        15,0,0,26,25,1,0,0,0,26,27,1,0,0,0,27,46,1,0,0,0,28,30,3,6,3,0,29,
        31,5,15,0,0,30,29,1,0,0,0,30,31,1,0,0,0,31,46,1,0,0,0,32,34,3,8,
        4,0,33,35,5,15,0,0,34,33,1,0,0,0,34,35,1,0,0,0,35,46,1,0,0,0,36,
        38,3,10,5,0,37,39,5,15,0,0,38,37,1,0,0,0,38,39,1,0,0,0,39,46,1,0,
        0,0,40,42,3,12,6,0,41,43,5,15,0,0,42,41,1,0,0,0,42,43,1,0,0,0,43,
        46,1,0,0,0,44,46,3,14,7,0,45,24,1,0,0,0,45,28,1,0,0,0,45,32,1,0,
        0,0,45,36,1,0,0,0,45,40,1,0,0,0,45,44,1,0,0,0,46,3,1,0,0,0,47,48,
        5,16,0,0,48,49,5,8,0,0,49,50,5,4,0,0,50,51,5,9,0,0,51,52,5,18,0,
        0,52,53,5,10,0,0,53,5,1,0,0,0,54,55,5,16,0,0,55,56,5,8,0,0,56,57,
        5,5,0,0,57,58,5,9,0,0,58,59,5,10,0,0,59,7,1,0,0,0,60,61,5,16,0,0,
        61,62,5,8,0,0,62,63,5,6,0,0,63,64,5,9,0,0,64,65,5,10,0,0,65,9,1,
        0,0,0,66,67,5,1,0,0,67,68,5,16,0,0,68,69,5,2,0,0,69,70,5,16,0,0,
        70,11,1,0,0,0,71,72,5,16,0,0,72,73,5,8,0,0,73,74,5,7,0,0,74,75,5,
        13,0,0,75,76,5,17,0,0,76,77,5,14,0,0,77,78,5,16,0,0,78,79,5,8,0,
        0,79,80,5,4,0,0,80,81,5,9,0,0,81,82,5,18,0,0,82,83,5,10,0,0,83,13,
        1,0,0,0,84,85,5,3,0,0,85,89,5,11,0,0,86,88,3,2,1,0,87,86,1,0,0,0,
        88,91,1,0,0,0,89,87,1,0,0,0,89,90,1,0,0,0,90,92,1,0,0,0,91,89,1,
        0,0,0,92,93,5,12,0,0,93,15,1,0,0,0,8,19,26,30,34,38,42,45,89
    ]

class ClusterDSLParser ( Parser ):

    grammarFileName = "ClusterDSL.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'deploy'", "'to'", "'parallel'", "'run'", 
                     "'update'", "'info'", "'temp'", "'.'", "'('", "')'", 
                     "'{'", "'}'", "'>'", "'->'", "';'" ]

    symbolicNames = [ "<INVALID>", "DEPLOY", "TO", "PARALLEL", "RUN", "UPDATE", 
                      "INFO", "TEMP", "DOT", "LPAREN", "RPAREN", "LBRACE", 
                      "RBRACE", "GT", "ARROW", "TERMINATOR", "IDENT", "INT", 
                      "STRING", "WS", "COMMENT" ]

    RULE_program = 0
    RULE_statement = 1
    RULE_nodeRunStmt = 2
    RULE_nodeUpdateStmt = 3
    RULE_nodeInfoStmt = 4
    RULE_deployStmt = 5
    RULE_sensorStmt = 6
    RULE_parallelBlock = 7

    ruleNames =  [ "program", "statement", "nodeRunStmt", "nodeUpdateStmt", 
                   "nodeInfoStmt", "deployStmt", "sensorStmt", "parallelBlock" ]

    EOF = Token.EOF
    DEPLOY=1
    TO=2
    PARALLEL=3
    RUN=4
    UPDATE=5
    INFO=6
    TEMP=7
    DOT=8
    LPAREN=9
    RPAREN=10
    LBRACE=11
    RBRACE=12
    GT=13
    ARROW=14
    TERMINATOR=15
    IDENT=16
    INT=17
    STRING=18
    WS=19
    COMMENT=20

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ClusterDSLParser.EOF, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ClusterDSLParser.StatementContext)
            else:
                return self.getTypedRuleContext(ClusterDSLParser.StatementContext,i)


        def getRuleIndex(self):
            return ClusterDSLParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = ClusterDSLParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 19
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 65546) != 0):
                self.state = 16
                self.statement()
                self.state = 21
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 22
            self.match(ClusterDSLParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def nodeRunStmt(self):
            return self.getTypedRuleContext(ClusterDSLParser.NodeRunStmtContext,0)


        def TERMINATOR(self):
            return self.getToken(ClusterDSLParser.TERMINATOR, 0)

        def nodeUpdateStmt(self):
            return self.getTypedRuleContext(ClusterDSLParser.NodeUpdateStmtContext,0)


        def nodeInfoStmt(self):
            return self.getTypedRuleContext(ClusterDSLParser.NodeInfoStmtContext,0)


        def deployStmt(self):
            return self.getTypedRuleContext(ClusterDSLParser.DeployStmtContext,0)


        def sensorStmt(self):
            return self.getTypedRuleContext(ClusterDSLParser.SensorStmtContext,0)


        def parallelBlock(self):
            return self.getTypedRuleContext(ClusterDSLParser.ParallelBlockContext,0)


        def getRuleIndex(self):
            return ClusterDSLParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = ClusterDSLParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_statement)
        self._la = 0 # Token type
        try:
            self.state = 45
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 24
                self.nodeRunStmt()
                self.state = 26
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==15:
                    self.state = 25
                    self.match(ClusterDSLParser.TERMINATOR)


                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 28
                self.nodeUpdateStmt()
                self.state = 30
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==15:
                    self.state = 29
                    self.match(ClusterDSLParser.TERMINATOR)


                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 32
                self.nodeInfoStmt()
                self.state = 34
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==15:
                    self.state = 33
                    self.match(ClusterDSLParser.TERMINATOR)


                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 36
                self.deployStmt()
                self.state = 38
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==15:
                    self.state = 37
                    self.match(ClusterDSLParser.TERMINATOR)


                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 40
                self.sensorStmt()
                self.state = 42
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==15:
                    self.state = 41
                    self.match(ClusterDSLParser.TERMINATOR)


                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 44
                self.parallelBlock()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NodeRunStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENT(self):
            return self.getToken(ClusterDSLParser.IDENT, 0)

        def DOT(self):
            return self.getToken(ClusterDSLParser.DOT, 0)

        def RUN(self):
            return self.getToken(ClusterDSLParser.RUN, 0)

        def LPAREN(self):
            return self.getToken(ClusterDSLParser.LPAREN, 0)

        def STRING(self):
            return self.getToken(ClusterDSLParser.STRING, 0)

        def RPAREN(self):
            return self.getToken(ClusterDSLParser.RPAREN, 0)

        def getRuleIndex(self):
            return ClusterDSLParser.RULE_nodeRunStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNodeRunStmt" ):
                listener.enterNodeRunStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNodeRunStmt" ):
                listener.exitNodeRunStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNodeRunStmt" ):
                return visitor.visitNodeRunStmt(self)
            else:
                return visitor.visitChildren(self)




    def nodeRunStmt(self):

        localctx = ClusterDSLParser.NodeRunStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_nodeRunStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 47
            self.match(ClusterDSLParser.IDENT)
            self.state = 48
            self.match(ClusterDSLParser.DOT)
            self.state = 49
            self.match(ClusterDSLParser.RUN)
            self.state = 50
            self.match(ClusterDSLParser.LPAREN)
            self.state = 51
            self.match(ClusterDSLParser.STRING)
            self.state = 52
            self.match(ClusterDSLParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NodeUpdateStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENT(self):
            return self.getToken(ClusterDSLParser.IDENT, 0)

        def DOT(self):
            return self.getToken(ClusterDSLParser.DOT, 0)

        def UPDATE(self):
            return self.getToken(ClusterDSLParser.UPDATE, 0)

        def LPAREN(self):
            return self.getToken(ClusterDSLParser.LPAREN, 0)

        def RPAREN(self):
            return self.getToken(ClusterDSLParser.RPAREN, 0)

        def getRuleIndex(self):
            return ClusterDSLParser.RULE_nodeUpdateStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNodeUpdateStmt" ):
                listener.enterNodeUpdateStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNodeUpdateStmt" ):
                listener.exitNodeUpdateStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNodeUpdateStmt" ):
                return visitor.visitNodeUpdateStmt(self)
            else:
                return visitor.visitChildren(self)




    def nodeUpdateStmt(self):

        localctx = ClusterDSLParser.NodeUpdateStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_nodeUpdateStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 54
            self.match(ClusterDSLParser.IDENT)
            self.state = 55
            self.match(ClusterDSLParser.DOT)
            self.state = 56
            self.match(ClusterDSLParser.UPDATE)
            self.state = 57
            self.match(ClusterDSLParser.LPAREN)
            self.state = 58
            self.match(ClusterDSLParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NodeInfoStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENT(self):
            return self.getToken(ClusterDSLParser.IDENT, 0)

        def DOT(self):
            return self.getToken(ClusterDSLParser.DOT, 0)

        def INFO(self):
            return self.getToken(ClusterDSLParser.INFO, 0)

        def LPAREN(self):
            return self.getToken(ClusterDSLParser.LPAREN, 0)

        def RPAREN(self):
            return self.getToken(ClusterDSLParser.RPAREN, 0)

        def getRuleIndex(self):
            return ClusterDSLParser.RULE_nodeInfoStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNodeInfoStmt" ):
                listener.enterNodeInfoStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNodeInfoStmt" ):
                listener.exitNodeInfoStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNodeInfoStmt" ):
                return visitor.visitNodeInfoStmt(self)
            else:
                return visitor.visitChildren(self)




    def nodeInfoStmt(self):

        localctx = ClusterDSLParser.NodeInfoStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_nodeInfoStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 60
            self.match(ClusterDSLParser.IDENT)
            self.state = 61
            self.match(ClusterDSLParser.DOT)
            self.state = 62
            self.match(ClusterDSLParser.INFO)
            self.state = 63
            self.match(ClusterDSLParser.LPAREN)
            self.state = 64
            self.match(ClusterDSLParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeployStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DEPLOY(self):
            return self.getToken(ClusterDSLParser.DEPLOY, 0)

        def IDENT(self, i:int=None):
            if i is None:
                return self.getTokens(ClusterDSLParser.IDENT)
            else:
                return self.getToken(ClusterDSLParser.IDENT, i)

        def TO(self):
            return self.getToken(ClusterDSLParser.TO, 0)

        def getRuleIndex(self):
            return ClusterDSLParser.RULE_deployStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDeployStmt" ):
                listener.enterDeployStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDeployStmt" ):
                listener.exitDeployStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDeployStmt" ):
                return visitor.visitDeployStmt(self)
            else:
                return visitor.visitChildren(self)




    def deployStmt(self):

        localctx = ClusterDSLParser.DeployStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_deployStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(ClusterDSLParser.DEPLOY)
            self.state = 67
            self.match(ClusterDSLParser.IDENT)
            self.state = 68
            self.match(ClusterDSLParser.TO)
            self.state = 69
            self.match(ClusterDSLParser.IDENT)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SensorStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENT(self, i:int=None):
            if i is None:
                return self.getTokens(ClusterDSLParser.IDENT)
            else:
                return self.getToken(ClusterDSLParser.IDENT, i)

        def DOT(self, i:int=None):
            if i is None:
                return self.getTokens(ClusterDSLParser.DOT)
            else:
                return self.getToken(ClusterDSLParser.DOT, i)

        def TEMP(self):
            return self.getToken(ClusterDSLParser.TEMP, 0)

        def GT(self):
            return self.getToken(ClusterDSLParser.GT, 0)

        def INT(self):
            return self.getToken(ClusterDSLParser.INT, 0)

        def ARROW(self):
            return self.getToken(ClusterDSLParser.ARROW, 0)

        def RUN(self):
            return self.getToken(ClusterDSLParser.RUN, 0)

        def LPAREN(self):
            return self.getToken(ClusterDSLParser.LPAREN, 0)

        def STRING(self):
            return self.getToken(ClusterDSLParser.STRING, 0)

        def RPAREN(self):
            return self.getToken(ClusterDSLParser.RPAREN, 0)

        def getRuleIndex(self):
            return ClusterDSLParser.RULE_sensorStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSensorStmt" ):
                listener.enterSensorStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSensorStmt" ):
                listener.exitSensorStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSensorStmt" ):
                return visitor.visitSensorStmt(self)
            else:
                return visitor.visitChildren(self)




    def sensorStmt(self):

        localctx = ClusterDSLParser.SensorStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_sensorStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 71
            self.match(ClusterDSLParser.IDENT)
            self.state = 72
            self.match(ClusterDSLParser.DOT)
            self.state = 73
            self.match(ClusterDSLParser.TEMP)
            self.state = 74
            self.match(ClusterDSLParser.GT)
            self.state = 75
            self.match(ClusterDSLParser.INT)
            self.state = 76
            self.match(ClusterDSLParser.ARROW)
            self.state = 77
            self.match(ClusterDSLParser.IDENT)
            self.state = 78
            self.match(ClusterDSLParser.DOT)
            self.state = 79
            self.match(ClusterDSLParser.RUN)
            self.state = 80
            self.match(ClusterDSLParser.LPAREN)
            self.state = 81
            self.match(ClusterDSLParser.STRING)
            self.state = 82
            self.match(ClusterDSLParser.RPAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ParallelBlockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PARALLEL(self):
            return self.getToken(ClusterDSLParser.PARALLEL, 0)

        def LBRACE(self):
            return self.getToken(ClusterDSLParser.LBRACE, 0)

        def RBRACE(self):
            return self.getToken(ClusterDSLParser.RBRACE, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ClusterDSLParser.StatementContext)
            else:
                return self.getTypedRuleContext(ClusterDSLParser.StatementContext,i)


        def getRuleIndex(self):
            return ClusterDSLParser.RULE_parallelBlock

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParallelBlock" ):
                listener.enterParallelBlock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParallelBlock" ):
                listener.exitParallelBlock(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParallelBlock" ):
                return visitor.visitParallelBlock(self)
            else:
                return visitor.visitChildren(self)




    def parallelBlock(self):

        localctx = ClusterDSLParser.ParallelBlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_parallelBlock)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 84
            self.match(ClusterDSLParser.PARALLEL)
            self.state = 85
            self.match(ClusterDSLParser.LBRACE)
            self.state = 89
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 65546) != 0):
                self.state = 86
                self.statement()
                self.state = 91
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 92
            self.match(ClusterDSLParser.RBRACE)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





