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
	:declaration
	|value
	|loops
	|conditionals
	|expression
	;
value
	:Name ('[' Integer ']')*  '=' (expression | ('[' expression ']')+)
	;
declaration
	:parameter ('[' Integer ']')*  ('=' (expression | ('[' expression ']')+))?
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
	: forLoop
	| whileLoop
	;
forLoop
	:'for' '(' forConditions ')' '{' statements '}'
	;
whileLoop
	:'while' '(' expression ')' '{' statements '}'
	;
forConditions
	: ((value | declaration) (','(value | declaration))*)? ';' expression ';' (statement (',' statement)*)?
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
	:([0] | ([1-9] [0-9]*)) ('.' [0-9]+)?
	;
WS  : [ \t\n] -> skip;