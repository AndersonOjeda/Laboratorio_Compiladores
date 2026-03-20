grammar ClusterDSL;

program
    : statement* EOF
    ;

statement
    : nodeRunStmt TERMINATOR?
    | nodeUpdateStmt TERMINATOR?
    | nodeInfoStmt TERMINATOR?
    | deployStmt TERMINATOR?
    | sensorStmt TERMINATOR?
    | parallelBlock
    ;

nodeRunStmt
    : IDENT DOT RUN LPAREN STRING RPAREN
    ;

nodeUpdateStmt
    : IDENT DOT UPDATE LPAREN RPAREN
    ;

nodeInfoStmt
    : IDENT DOT INFO LPAREN RPAREN
    ;

deployStmt
    : DEPLOY IDENT TO IDENT
    ;

sensorStmt
    : IDENT DOT TEMP GT INT ARROW IDENT DOT RUN LPAREN STRING RPAREN
    ;

parallelBlock
    : PARALLEL LBRACE statement* RBRACE
    ;

DEPLOY: 'deploy';
TO: 'to';
PARALLEL: 'parallel';
RUN: 'run';
UPDATE: 'update';
INFO: 'info';
TEMP: 'temp';

DOT: '.';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
GT: '>';
ARROW: '->';
TERMINATOR: ';';

IDENT: [a-zA-Z_][a-zA-Z0-9_]*;
INT: [0-9]+;
STRING: '"' (~["\\] | '\\' .)* '"';

WS: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;
