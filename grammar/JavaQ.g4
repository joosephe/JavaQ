grammar JavaQ;

@header {
package javaQ;
}


/*
Siin tuleb defineerida grammatika, mis tunneb Ć¤ra sĆµnede hulkasid.

Def 1. SĆµne on kas tĆ¼hi sĆµne Īµ vĆµi jutumĆ¤rkidega Ć¼mbritsetud vĆ¤hemalt Ć¼hest vĆ¤ikesest ladina
tĆ¤hest koosnev jada. NĆ¤iteks "kala" ja "a" on sĆµned, aga "" ei ole.

Def 2. SĆµnede hulgad on parajasti need, mida saab koostada jĆ¤rgmiste reeglite abil:
  1) TĆ¼hi hulk 'Ć�' on sĆµnede hulk.
  2) Iga hulgamuutuja on sĆµnede hulk. (Hulgamuutujateks sobivad Ć¼kskikud suured tĆ¤hed,
     nĆ¤iteks "A" vĆµi "Z").
  3) Loogelistes sulgudes, komaga eraldatud ja vĆ¤hemalt Ć¼hest sĆµnest koosnevad sĆµnede jĆ¤rjendid
     on ka sĆµnede hulgad. NĆ¤iteks { "kala", "koer", "karu" } ja {Īµ} on sĆµnede hulgad,
     aga {} jĆ¤llegi ei ole.
  4) Kui X on sĆµnede hulk, siis ka X* (sĆµnede hulga kleene-i sulund) on sĆµnede hulk.
  5) Kui X ja Y on sĆµnede hulgad, siis ka nende konkatenatsioon XY on sĆµnede hulk.
  6) Kui X ja Y on sĆµnede hulgad, siis ka nende Ć¼hend Xā�ŖY on sĆµnede hulk.
  6) Kui X on sĆµnede hulk, siis vĆµib ta Ć¼mber sulud panna ja (X) on samuti sĆµnede hulk.

  Kuna meid hetkel huvitab ainult kĆ¼simus, kas etteantud sĆµne kuulub keelde vĆµi mitte,
  siis tehete prioriteedid ei ole siin olulised.
*/

function
    : 'circuit' type functionCall '{' statements '}'
    ;
functionCall
	:nameBegin '(' parameters ')'
	|nameBegin '()'
	;
statements
	:statement ';' statements
	|statement ';'
	;
statement
	:functionCall
	|parameter
	|paramInits '=' paramValues
	|loops
	|conditionals
	;
paramInits
	:parameter
	|functionCall
	|nameBegin
	;
paramValues
	:functionCall
	|paramValue
	|nameBegin
	;
parameters
	:parameter ',' parameters
	|parameter
	;
parameter
	:type name
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
	: string
	| number
	;
type
	:Sym type
	|Sym
	;
nameBegin
	:Sym name
	;
name
	:charSeq name
	|number name
	|charSeq
	|number
	;
string
	: '"' 'anything' '"'
	;
charSeq
	:Sym2 charSeq
	|Sym charSeq
	|Sym2
	|Sym
	;
number
	:Num number
	|Num
	;
tahed
	:tahed Sym
	|Sym
	;
Num : [0-1];
Sym2 : [A-Z];
Sym : [a-z];
WS  : [ \t\n] -> skip;