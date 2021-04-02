package bonus.grammar;

import bonus.antlr4.ShapeBaseListener;
import bonus.antlr4.ShapeListener;
import bonus.antlr4.ShapeParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import static java.lang.System.exit;

public class MyListener extends ShapeBaseListener {

    @Override
    public void enterCommands(ShapeParser.CommandsContext ctx) {
        super.enterCommands(ctx);
    }

    @Override
    public void exitCommands(ShapeParser.CommandsContext ctx) {

    }

    @Override
    public void enterListOfCommands(ShapeParser.ListOfCommandsContext ctx) {
        super.enterListOfCommands(ctx);
    }

    @Override
    public void exitListOfCommands(ShapeParser.ListOfCommandsContext ctx) {
        super.exitListOfCommands(ctx);
        System.out.println(ctx.getText());
    }

    @Override
    public void enterCreateCommand(ShapeParser.CreateCommandContext ctx) {
        super.enterCreateCommand(ctx);
    }

    @Override
    public void exitCreateCommand(ShapeParser.CreateCommandContext ctx) {
        super.exitCreateCommand(ctx);
        System.out.println("create command");
    }

    @Override
    public void enterCommandShapeList(ShapeParser.CommandShapeListContext ctx) {
        super.enterCommandShapeList(ctx);
    }

    @Override
    public void exitCommandShapeList(ShapeParser.CommandShapeListContext ctx) {
        super.exitCommandShapeList(ctx);
    }

    @Override
    public void enterDeleteCommand(ShapeParser.DeleteCommandContext ctx) {
        super.enterDeleteCommand(ctx);
    }

    @Override
    public void exitDeleteCommand(ShapeParser.DeleteCommandContext ctx) {
        super.exitDeleteCommand(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}
