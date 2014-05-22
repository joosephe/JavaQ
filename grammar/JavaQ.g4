grammar JavaQ;

@header {
package javaQ;
}


/*
Siin tuleb defineerida grammatika, mis tunneb ära sõnede hulkasid.

Def 1. Sõne on kas tühi sõne ε või jutumärkidega ümbritsetud vähemalt ühest väikesest ladina
tähest koosnev jada. Näiteks "kala" ja "a" on sõned, aga "" ei ole.

Def 2. Sõnede hulgad on parajasti need, mida saab koostada järgmiste reeglite abil:
  1) Tühi hulk 'Ø' on sõnede hulk.
  2) Iga hulgamuutuja on sõnede hulk. (Hulgamuutujateks sobivad ükskikud suured tähed,
     näiteks "A" või "Z").
  3) Loogelistes sulgudes, komaga eraldatud ja vähemalt ühest sõnest koosnevad sõnede järjendid
     on ka sõnede hulgad. Näiteks { "kala", "koer", "karu" } ja {ε} on sõnede hulgad,
     aga {} jällegi ei ole.
  4) Kui X on sõnede hulk, siis ka X* (sõnede hulga kleene-i sulund) on sõnede hulk.
  5) Kui X ja Y on sõnede hulgad, siis ka nende konkatenatsioon XY on sõnede hulk.
  6) Kui X ja Y on sõnede hulgad, siis ka nende ühend X∪Y on sõnede hulk.
  6) Kui X on sõnede hulk, siis võib ta ümber sulud panna ja (X) on samuti sõnede hulk.

  Kuna meid hetkel huvitab ainult küsimus, kas etteantud sõne kuulub keelde või mitte,
  siis tehete prioriteedid ei ole siin olulised.
*/

function
    : 'circuit' type functionCall '{' statements '}'
    ;
functionCall
	:name '(' parameters ')'
	|name '()'
	;
statements
	:statement ';' statements
	|statement ';'
	;
statement
	:functionCall
	|parameter
	|paramInits '=' paramValues
	;
paramInits
	:parameter
	|functionCall
	|name
	;
paramValues
	:functionCall
	|paramValue
	|name
	;
parameters
	:parameter ',' parameters
	|parameter
	;
parameter
	:type name
	;
paramValue
	:
	;
type
	:
	;
name
	:
	;
tahed
	:tahed Sym
	|Sym
	;
Sym2 : [A-Z];
Sym : [a-z];
WS  : [ \t\n] -> skip;