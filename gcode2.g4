grammar gcode2;


// parser rules

prg :	statement + fimprograma;
	
fimprograma :	numerolinha mfim ;
		
statement :	numerolinha codfunc coordx coordy fimdelinha |	numerolinha mfunc fimdelinha |  fimdelinha ;

numerolinha :	'N' INT INT INT ;

mfim : 'M30' ;
	
mfunc :	'M02' |	'M01' ;
	
codfunc :	'G01' |	'G00' ;
	
coordx 	:	'X' INT INT? INT? ;

coordy 	:	'Y' INT INT? INT? ;
		
fimdelinha 	:	'\r'? '\n' ;

// lexer rules
			
INT :	'0'..'9' ;

ID  :   [a-z]+ ;

WS : [ \t]+ -> skip ;