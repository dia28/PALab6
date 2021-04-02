package bonus;

import bonus.antlr4.ShapeLexer;
import bonus.antlr4.ShapeParser;
import bonus.grammar.MyListener;
import bonus.grammar.ThrowingErrorListener;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Test {
    public static void main(String[] args) throws ParseCancellationException {


//        String source = "delete 1 2";
//        ShapeLexer lexer = new ShapeLexer(CharStreams.fromString(source));
//
//        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
//        ShapeParser parser = new ShapeParser(tokenStream);
//
//        parser.removeErrorListeners();
//        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
//
//        ShapeParser.CommandsContext shapeContext = parser.commands();
//
//        ParseTreeWalker walker = new ParseTreeWalker();
//        MyListener myListener = new MyListener();
//        walker.walk(myListener, shapeContext);



    }
}
