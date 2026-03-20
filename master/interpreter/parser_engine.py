from __future__ import annotations

from antlr4 import CommonTokenStream, FileStream, InputStream
from antlr4.error.ErrorListener import ErrorListener

from master.interpreter.ast_builder import ASTBuilder
from master.interpreter.generated.ClusterDSLLexer import ClusterDSLLexer
from master.interpreter.generated.ClusterDSLParser import ClusterDSLParser


class RaisingErrorListener(ErrorListener):
    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        raise SyntaxError(f"Error sintactico en linea {line}, columna {column}: {msg}")


def parse_file(file_path: str):
    input_stream = FileStream(file_path, encoding="utf-8")
    return parse_stream(input_stream)


def parse_text(content: str):
    input_stream = InputStream(content)
    return parse_stream(input_stream)


def parse_stream(input_stream):
    lexer = ClusterDSLLexer(input_stream)
    lexer.removeErrorListeners()
    lexer.addErrorListener(RaisingErrorListener())

    stream = CommonTokenStream(lexer)
    parser = ClusterDSLParser(stream)
    parser.removeErrorListeners()
    parser.addErrorListener(RaisingErrorListener())

    tree = parser.program()
    return ASTBuilder().visit(tree)
