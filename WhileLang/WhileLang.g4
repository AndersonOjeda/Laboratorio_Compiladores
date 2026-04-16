grammar WhileLang;

// ============================================
// PROGRAMA
// ============================================
program: statement+ EOF;

// ============================================
// SENTENCIAS
// ============================================
statement
    : declaration SEMI             # declarationStmt
    | assignment SEMI              # assignmentStmt
    | whileStatement               # whileStmt
    | ifStatement                  # ifStmt
    | breakStatement               # breakStmt
    | continueStatement            # continueStmt
    | LBRACE statement* RBRACE     # blockStmt
    ;

// Declaración de variable con tipo
declaration
    : type ID (ASSIGN expr)?
    ;

type
    : INT      # intType
    | STRING   # stringType
    ;

// Asignación de variable
assignment
    : ID ASSIGN expr
    ;

// Bucle while
whileStatement
    : WHILE LPAREN expr RPAREN LBRACE statement* RBRACE
    ;

// Sentencia if-else
ifStatement
    : IF LPAREN expr RPAREN LBRACE statement* RBRACE (ELSE LBRACE statement* RBRACE)?
    ;

// Break
breakStatement
    : BREAK
    ;

// Continue
continueStatement
    : CONTINUE
    ;

// ============================================
// EXPRESIONES (con etiquetas para ANTLR)
// ============================================
expr
    : ID                                                    # idExpr
    | NUMBER                                                # numberExpr
    | STRING_LITERAL                                        # stringExpr
    | expr (MULT | DIV) expr                                # arithmeticExpr
    | expr (PLUS | MINUS) expr                              # arithmeticExpr
    | expr (LT | GT | GE | LE | EQ | NE) expr               # comparisonExpr
    | LPAREN expr RPAREN                                    # parenExpr
    ;

// ============================================
// PALABRAS CLAVE
// ============================================
WHILE: 'while';
IF: 'if';
ELSE: 'else';
BREAK: 'break';
CONTINUE: 'continue';
INT: 'int';
STRING: 'string';

// ============================================
// OPERADORES
// ============================================
ASSIGN: '=';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
EQ: '==';
NE: '!=';

// ============================================
// DELIMITADORES
// ============================================
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMI: ';';

// ============================================
// ELEMENTOS LÉXICOS
// ============================================
ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+;
STRING_LITERAL: '"' (~["\r\n\\] | '\\' .)* '"';

WS: [ \t\r\n]+ -> skip;