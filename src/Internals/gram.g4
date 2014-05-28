grammar gram;

program
	:function+
	;
function
    : 'circuit' type Name '(' initParameters? ')' '{' statements '}'
    ;
statements
	:(statement ';')+
	;
statement
	:declaration
	|value
	|loop
	|conditionals
	|expression
	;
value
	:Name  '=' expression
	;
declaration
	:parameter ('=' expression )?
	;
initParameters
	:parameter (',' parameter)*
	;
parameter
	:type Name
	;
expression
	:expression  ( '|' | ' &') expression0  				# MultipleComparisons
	|expression0											# TrivialExpression
	;
expression0
    :   expression1 ('>'|'<'|'>='|'<='|'=='|'!=') expression1     # Comparison
    |   expression1                                       			# TrivialExpression0
    ;

expression1
    :   expression1 ('+'|'-') expression2                     # AddingSubstraction
    |   expression2                                       	# TrivialExpression1
    ;

expression2
    :  expression2 ('*'|'/') expression3                     # MultiplicationDivision
    |   expression3                                        # TrivialExpression2
    ;

expression3
    :   '-' expression3                                    # UnaryNegation
    |   expression4                                        # TrivialExpression3
    ;

expression4
    :   Name '(' (expression (',' expression)*)? ')'   # FunctionCall
    |   expression5                                        # TrivialExpression4
    ;

expression5
    :   Name    # NameR
    |   Number   # NumberR
    |   String   # StringR
    | '(' expression ')' # BraketExpression
    ;
loop
	:'while' '(' expression ')' '{' statements '}'
	;
conditionals
	:'if' '(' expression ')' '{' statements '}' ('elseif' '(' expression ')' '{' statements '}')* ('else' '{' statements '}')?
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
	:[a-zA-Z][a-zA-Z0-9_]*
	;
String
	: '"' ~["\n\r] '"'
	;
Number
	:([0] | ([1-9] [0-9]*)) ('.' [0-9]+)?
	;
WS  : [ \t\n] -> skip;