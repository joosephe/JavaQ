grammar gram;

program
	:function+
	;
function
    : 'circuit' type functionInit '{' statements '}'
    ;
functionInit
	:Name '(' initParameters? ')'
	;
functionCall
	:Name '(' parameters?  ')'
	;
statements
	:(statement ';')+
	;
statement
	:functionCall
	|parameter
	|paramInits '=' paramValues
	|loops
	|conditionals
	|expression
	;
paramInits
	:parameter
	|functionCall
	|Name
	;
paramValues
	:functionCall
	|paramValue
	|Name
	;
initParameters
	:parameter (',' parameter)*
	;
parameters
	:functionCallParameter (',' functionCallParameter)*
	;
parameter
	:type Name
	;
functionCallParameter
	:functionCall
	|paramInits '=' paramValues
	|Name
	|paramValue
	;
expression
	:expression0
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
	|'while' '(' conditions ')' '{' statements '}'
	;
forConditions
	:
	|
	;
conditionals
	:'if' '(' conditions ')' '{' statements '}'
	;
conditions
	:
	;
paramValue
	: String
	| Number
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
Name
	:[a-zA-Z][a-zA-Z0-9]*
	;
String
	: '"' ~["\n\r] '"'
	;
Number
	:[0-9]+
	|[0-9]+ '.' [0-9]+
	;
WS  : [ \t\n] -> skip;