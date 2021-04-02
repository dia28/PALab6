grammar Shape;

commands: listOfCommands EOF
        ;

listOfCommands: (createCommand | deleteCommand)
              ;

createCommand: command=commandShapeList shape=ShapeList pointX=NUMBER pointY=NUMBER size=NUMBER color=COLOR;

commandShapeList: (DRAW | FILL);

DRAW: 'draw';
FILL: 'fill';

deleteCommand: command='delete' pointX=NUMBER pointY=NUMBER;

ShapeList : (CIRCLE | TRIANGLE | SQUARE)
          ;

CIRCLE: 'circle';
TRIANGLE: 'triangle';
SQUARE: 'square';

COLOR: 'red'
     | 'green'
     | 'yellow'
     | 'random'
     ;

NUMBER: ('0'..'9')+
      ;

WS: (' ' | '\t') -> skip;
NL: '\r'? '\n' -> skip;

ERROR: . {System.out.println("error");}
     ;
