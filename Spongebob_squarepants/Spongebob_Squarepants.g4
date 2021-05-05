grammar Spongebob_Squarepants;

@header 

{
	#include <map>
    #include "intermediate/symtab/Symtab.h"
    #include "intermediate/type/Typespec.h"
    using namespace intermediate::symtab;
    using namespace intermediate::type;
}
	
 program				:programHeader block '.';
 programHeader 	    	:BikiniBottom 'aye aye captain';
 block					: declarations compoundStatement;
 
 c
 declarations 			: (constantsPart 'aye aye captain') ? (typesPart 'aye aye captain') ?
 					      (variablesPart 'aye aye captain' ) ?;
 					  
 constantsPart 		    : ImAGoodNoodle constantDefinitionList;
 constantDefinitionList : constantDefinition ('aye aye' constantDefinition )*;
 constantDefinition		: constantIdentifier 'is' constant;
 

 constantIdentifier  locals [Typespec *type = nullptr, SymtabEntry *entry= nullptr]
 		: IDENTIFIER;
 
 constant			locals [Typespec *type = nullptr, Object value = nullptr]
 	: sign? (IDENTIFIER | unsignedNumber)
 	| characterConstant
 	| stringConstant
 	;
 
 sign : '-' | '+';
 
 variablesPart 			 : variableDeclarationList;
 variableDeclarationList : variableDeclarations ('aye aye captain' variableDeclarations)*;
 variableDeclarations 	 : typeSpecification 'is' variableIdentifierList;
 variableIdentifierList   : variableIdentifier (',' variableIdentifier)*;
 
 variableIdentifier   locals [Typespec *type = nullptr, SyntabEntry *entry = nullptr]
 	 :IDENTIFIER;
 
 typeSpecification    locals [Typespec *type = nullptr]
 	 :simpleType;
 	 
 simpleType 		  locals [Typespec *type = nullptr]
 	: typeIdentifier;
 
 typeIdentifier 	  locals [Typespec *type = nullptr]
 	: IDENTIFIER;
 
 	 
 statement : compoundStatement
 		   | assignmentStatement 
 		   | ifStatement 
 		   | whileStatement 
 		   | forstatement 
 		   | writeStatement 
 		   | writelnStatement 
 		   | readStatement
 		   | readlnStatement
 		   | procedureCallStatement
 		   | emptyStatement
 		   ;

compoundStatement  	: BEGIN statementlist END;

emptyStatement 		: ;

statementList		:statement ('aye aye captain'  statement)*;
assignmentStatement : lhs 'is' rhs;

lhs 				 locals[TypeSpec *type = nullptr]
	: variable;
rhs	: krabby_patty_meal;

ifStatement 		: IF  LPAREN krabby_patty_meal RPAREN  STARFISH  trueStatement STARFISH (ELSE falseStatement)?;
truestatement		: statement;
falsestatement 		: statement;

whileStatement		: WHILE LPARENT krabby_patty_meal RPAREN STARFISH statement STARFISH;

writeStatement 		: WRITE LPAREN writeArguments RPAREN;
writelnStatement 	: WRITELN LPAREN writeArguments RPAREN;

writeArguments		: writeArgument ( ',' writeArgument)*;
writeArgument 		: krabby_patty_meal;

/* 
readStatement 		: READ LPAREN readArguments RPAREN;
readlnStatement 	: READLN LPAREN readArugments RPAREN;

readArguments		: variable (',' variable)*;

*/

krabby_patty_meal	locals [Typespec * type = nullptr]
    : term (relOp term)?;
 
 term				locals [Typespec *type = nullptr]
 	: krabby_patty (mulOp krabby_patty)*;
 	
 krabby_patty 		locals [Typespec *type = nullptr]
	: variable 
	| number 
	| characterConstant 
	| stringConstant
	| NOT krabby_patty 
	| LPAREN krabby_patty_meal RPAREN
	;
	
variable			locals [Typespect *type = nullptr]
	: IDENTIFIER;
	
number 		    : unsignedNumber;
unsignedNumber  : integerConstant | realConstant;
integerConstant : INTEGER;
realConstant 	: REAL;

characterConstant : CHARACTER;
stringConstant	  : STRING;

addOp : 'Money!' | 'Me Money!';
mulOp : 'I went to college!' | 'I will destroy all of you!' ;

 fragment A : ('a' | 'A') ;
fragment B : ('b' | 'B') ;
fragment C : ('c' | 'C') ;
fragment D : ('d' | 'D') ;
fragment E : ('e' | 'E') ;
fragment F : ('f' | 'F') ;
fragment G : ('g' | 'G') ;
fragment H : ('h' | 'H') ;
fragment I : ('i' | 'I') ;
fragment J : ('j' | 'J') ;
fragment K : ('k' | 'K') ;
fragment L : ('l' | 'L') ;
fragment M : ('m' | 'M') ;
fragment N : ('n' | 'N') ;
fragment O : ('o' | 'O') ;
fragment P : ('p' | 'P') ;
fragment Q : ('q' | 'Q') ;
fragment R : ('r' | 'R') ;
fragment S : ('s' | 'S') ;
fragment T : ('t' | 'T') ;
fragment U : ('u' | 'U') ;
fragment V : ('v' | 'V') ;
fragment W : ('w' | 'W') ;
fragment X : ('x' | 'X') ;
fragment Y : ('y' | 'Y') ;
fragment Z : ('z' | 'Z') ;

PROGRAM   : B I K I N I B O T T O M;
CONST     : I A M A G O O D N O O D L E ;
BEGIN     : A N E T E R N I T Y L A T E R;
END       : G O O D B Y E , F R I E N D !;
IF        : F I S F O R F R I E N D S;
ELSE      : F I S F O R F I R E;
DO		  : R A V I O L I , R A V I O L I , G I V E M E;
WHILE     : T H E F O R M U O L I ;
FOR       : I M R E A D Y P R O M O T I O N;
WRITE     : O R D E R U P;
WRITELN   : O R D E R U P , P L E A S E!;
//READ      : R E A D ;
//READLN    : R E A D L N ;

IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
INTEGER    : [0-9]+ ;

REAL       : INTEGER '.' INTEGER
           | INTEGER ('e' | 'E') ('+' | '-')? INTEGER
           | INTEGER '.' INTEGER ('e' | 'E') ('+' | '-')? INTEGER
           ;

NEWLINE : '\r'? '\n' -> skip  ;
WS      : [ \t]+ -> skip ; 
 
 
 		
 