grammar gram;

program
	:function+
	;
function
    : 'circuit' type('[]')* functionInit '{' statements '}'
    ;
functionInit
	:Name '(' initParameters? ')'
	;
statements
	:(statement ';')+
	;
statement
	:parameter ('[' Integer ']')*
	|value
	|loops
	|conditionals
	|expression
	;
value
	:paramInits ('[' Integer ']')*  '=' (expression | ('[' expression ']')+)
	;
paramInits
	:parameter 
	|Name
	;
initParameters
	:parameter (',' parameter)*
	;
parameter
	:type Name
	;
expression
	:expression0 ( ( '|' | ' &') expression0)*
	;
expression0
    :   expression1 ('>'|'<'|'>='|'<='|'=='|'!=') expression1     
    |   expression1                                       
    ;

expression1
    :   expression1 ('+'|'-') expression2                     
    |   expression2                                       
    ;

expression2
    :  expression2 ('*'|'/') expression3                     # KorrutamineJagamine
    |   expression3                                        # TriviaalneAvaldis3
    ;

expression3
    :   '-' expression3                                    # UnaarneMiinus
    |   expression4                                        # TriviaalneAvaldis2
    ;

expression4
    :   Name '(' (expression (',' expression)*)? ')'   # FunktsiooniValjakutse
    |   expression5                                        # TriviaalneAvaldis1
    ;

expression5
    :   Name    
    |   Number   
    |   String   
    ;
loops
	:'for' '(' forConditions ')' '{' statements '}'
	|'while' '(' expression ')' '{' statements '}'
	;
forConditions
	: (value (','value)*)? ';' expression ';' (statement (',' statement)*)?
	;
conditionals
	:'if' '(' expression ')' '{' statements '}'
	;
type
	:'int'
	|'float'
	|'bool'
	|'complex'
	|'qubit'
	|'transformation'
	|'gate'
	|'string'
	|'char'
	|'measurement'
	|'state'
	|'ensemble'
	;
Integer
	:([1-9][0-9]*)|[0]
	;
Name
	:[a-zA-Z][a-zA-Z0-9_]*
	;
String
	: '"' ~["\n\r] '"'
	;
Number
	:[1-9] [0-9]*
	|[1-9] [0-9]* '.' [0-9]+
	|[0]
	|[0] '.' [0-9]+
	;
WS  : [ \t\n] -> skip;