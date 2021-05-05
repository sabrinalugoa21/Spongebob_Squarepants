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
 programHeader 	    	:BIKINIBOTTOM 'aye aye captain';
 block					: declarations compoundStatement;
 
 
 declarations 			: (constantsPart 'aye aye captain')  ?
 					      (variablesPart 'aye aye captain' ) ?;
 					  
 constantsPart 		    : IMAGOODNOODLE constantDefinitionList;
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
 		 //  | forstatement 
 		   | writeStatement 
 		   | writelnStatement 
 		  // | readStatement
 		  // | readlnStatement
 		   | emptyStatement
 		   ;

compoundStatement  	: ANETERNITYLATER statementlist GOODBYEFRIEND;

emptyStatement 		: ;

statementlist		:statement ('aye aye captain'  statement)*;
assignmentStatement : lhs 'is' rhs;

lhs 				 locals[TypeSpec *type = nullptr]
	: variable;
rhs	: krabby_patty_meal;

ifStatement 		: FISFORFRIENDS  TBUN krabby_patty_meal BBUN STARFISH  truestatement STARFISH (FISFORFIRE falsestatement)?;
truestatement		: statement;
falsestatement 		: statement;

whileStatement		: THEFORMULOLI  TBUN krabby_patty_meal BBUN STARFISH statement STARFISH;

writeStatement 		: ORDERUP TBUN writeArguments BBUN;
writelnStatement 	: YOUFORGOTTHEPICKLES TBUN writeArguments BBUN;

writeArguments		: writeArgument ( ',' writeArgument)*;
writeArgument 		: krabby_patty_meal;

/* 
readStatement 		: READ LPAREN readArguments RPAREN;
readlnStatement 	: READLN LPAREN readArugments RPAREN;

readArguments		: variable (',' variable)*;

*/

krabby_patty_meal	locals [Typespec * type = nullptr]
    : term (addOp term)?;
 
 term				locals [Typespec *type = nullptr]
 	: krabby_patty (mulOp krabby_patty)*;
 	
 krabby_patty 		locals [Typespec *type = nullptr]
	: variable 
	| number 
	| characterConstant 
	| stringConstant
	| DOODLEBOB krabby_patty 
	| TBUN krabby_patty_meal BBUN
	;
	
variable			locals [Typespect *type = nullptr]
	: IDENTIFIER;
	
number 		    : unsignedNumber;
unsignedNumber  : integerConstant | realConstant;
integerConstant : BUBBLEBUDDY;						//INTEGER
realConstant 	: SPONGEBOB;						//REAL

characterConstant : PLANKTON;					//CHARACTER
stringConstant	  : SQUIDWARD;					//STRING

addOp : 'Money!' | 'Me Money!';
mulOp : 'I went to college!' | 'I will destroy all of you!' ;

fragment A :('a' | 'A');
fragment B :('b' | 'B');
fragment C :('c' | 'C');
fragment D :('d' | 'D');
fragment E :('e' | 'E');
fragment F :('f' | 'F');
fragment G :('g' | 'G');
fragment H :('h' | 'H');
fragment I :('i' | 'I');
fragment J :('j' | 'J');
fragment K :('k' | 'K');
fragment L :('l' | 'L');
fragment M :('m' | 'M');
fragment N :('n' | 'N');
fragment O :('o' | 'O');
fragment P :('p' | 'P');
fragment Q :('q' | 'Q');
fragment R :('r' | 'R');
fragment S :('s' | 'S');
fragment T :('t' | 'T');
fragment U :('u' | 'U');
fragment V :('v' | 'V');
fragment W :('w' | 'W');
fragment X :('x' | 'X');
fragment Y :('y' | 'Y');
fragment Z :('z' | 'Z');

BIKINIBOTTOM  		 : B I K I N I B O T T O M;						//PROGRAM
IMAGOODNOODLE    	 : I M A G O O D N O O D L E ;					//CONST
ANETERNITYLATER    	 : A N E T E R N I T Y L A T E R;				//BEGIN
GOODBYEFRIEND      	 : G O O D B Y E  F R I E N D ;					//END
FISFORFRIENDS        : F I S F O R F R I E N D S;					//IF
FISFORFIRE      	 : F I S F O R F I R E;							//ELSE
RAVOLIRAVIOLIGIVEME	 : R A V I O L I  R A V I O L I  G I V E M E;	//DO
THEFORMULOLI     	 : T H E F O R M U O L I ;						//WHILE
IMREADYPROMOTION     : I M R E A D Y P R O M O T I O N;				//FOR
ORDERUP    			 : O R D E R U P;								//WRITE
YOUFORGOTTHEPICKLES  : Y O U F O R G O T T H E P I C K L E S;		//WRTIELN
DOODLEBOB			 : D O O D L E B O B;

TBUN	   : '(';
BBUN 	   : ')';
STARFISH   : '*';
IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
BUBBLEBUDDY    : [0-9]+ ;											//INTEGER

SPONGEBOB  : BUBBLEBUDDY'.' BUBBLEBUDDY								//REAL
           | BUBBLEBUDDY ('e' | 'E') ('+' | '-')? BUBBLEBUDDY
           | BUBBLEBUDDY '.' BUBBLEBUDDY ('e' | 'E') ('+' | '-')? BUBBLEBUDDY
           ;
QUOTE     : '\'' ;
PLANKTON  : QUOTE PLANKTON_CHAR QUOTE ;
SQUIDWARD : QUOTE SQUIDWARD_CHAR* QUOTE ;

fragment PLANKTON_CHAR : ~('\'')   // any non-quote character
                        ;

fragment SQUIDWARD_CHAR : QUOTE QUOTE  // two consecutive quotes
                     | ~('\'')      // any non-quote character
                     ;
 

MAGICCONCH	   : '\r'? '\n' -> skip  ;						//NEWLINE		
IMAGINATION    : [ \t]+ -> skip ; 							//WHITESPACE
 
 
 		
 