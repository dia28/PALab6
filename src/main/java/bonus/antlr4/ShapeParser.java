package bonus.antlr4;// Generated from Shape.g4 by ANTLR 4.9

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShapeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DRAW=2, FILL=3, ShapeList=4, CIRCLE=5, TRIANGLE=6, SQUARE=7, COLOR=8, 
		NUMBER=9, WS=10, NL=11, ERROR=12;
	public static final int
		RULE_commands = 0, RULE_listOfCommands = 1, RULE_createCommand = 2, RULE_commandShapeList = 3, 
		RULE_deleteCommand = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"commands", "listOfCommands", "createCommand", "commandShapeList", "deleteCommand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'delete'", "'draw'", "'fill'", null, "'circle'", "'triangle'", 
			"'square'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "DRAW", "FILL", "ShapeList", "CIRCLE", "TRIANGLE", "SQUARE", 
			"COLOR", "NUMBER", "WS", "NL", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Shape.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShapeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CommandsContext extends ParserRuleContext {
		public ListOfCommandsContext listOfCommands() {
			return getRuleContext(ListOfCommandsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ShapeParser.EOF, 0); }
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeListener) ((ShapeListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeListener) ((ShapeListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeVisitor) return ((ShapeVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commands);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			listOfCommands();
			setState(11);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListOfCommandsContext extends ParserRuleContext {
		public CreateCommandContext createCommand() {
			return getRuleContext(CreateCommandContext.class,0);
		}
		public DeleteCommandContext deleteCommand() {
			return getRuleContext(DeleteCommandContext.class,0);
		}
		public ListOfCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listOfCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeListener) ((ShapeListener)listener).enterListOfCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeListener) ((ShapeListener)listener).exitListOfCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeVisitor) return ((ShapeVisitor<? extends T>)visitor).visitListOfCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListOfCommandsContext listOfCommands() throws RecognitionException {
		ListOfCommandsContext _localctx = new ListOfCommandsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listOfCommands);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DRAW:
			case FILL:
				{
				setState(13);
				createCommand();
				}
				break;
			case T__0:
				{
				setState(14);
				deleteCommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateCommandContext extends ParserRuleContext {
		public CommandShapeListContext command;
		public Token shape;
		public Token pointX;
		public Token pointY;
		public Token color;
		public CommandShapeListContext commandShapeList() {
			return getRuleContext(CommandShapeListContext.class,0);
		}
		public TerminalNode ShapeList() { return getToken(ShapeParser.ShapeList, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ShapeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ShapeParser.NUMBER, i);
		}
		public TerminalNode COLOR() { return getToken(ShapeParser.COLOR, 0); }
		public CreateCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeListener) ((ShapeListener)listener).enterCreateCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeListener) ((ShapeListener)listener).exitCreateCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeVisitor) return ((ShapeVisitor<? extends T>)visitor).visitCreateCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateCommandContext createCommand() throws RecognitionException {
		CreateCommandContext _localctx = new CreateCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			((CreateCommandContext)_localctx).command = commandShapeList();
			setState(18);
			((CreateCommandContext)_localctx).shape = match(ShapeList);
			setState(19);
			((CreateCommandContext)_localctx).pointX = match(NUMBER);
			setState(20);
			((CreateCommandContext)_localctx).pointY = match(NUMBER);
			setState(21);
			((CreateCommandContext)_localctx).color = match(COLOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandShapeListContext extends ParserRuleContext {
		public TerminalNode DRAW() { return getToken(ShapeParser.DRAW, 0); }
		public TerminalNode FILL() { return getToken(ShapeParser.FILL, 0); }
		public CommandShapeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandShapeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeListener) ((ShapeListener)listener).enterCommandShapeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeListener) ((ShapeListener)listener).exitCommandShapeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeVisitor) return ((ShapeVisitor<? extends T>)visitor).visitCommandShapeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandShapeListContext commandShapeList() throws RecognitionException {
		CommandShapeListContext _localctx = new CommandShapeListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_commandShapeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_la = _input.LA(1);
			if ( !(_la==DRAW || _la==FILL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteCommandContext extends ParserRuleContext {
		public Token command;
		public Token pointX;
		public Token pointY;
		public List<TerminalNode> NUMBER() { return getTokens(ShapeParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ShapeParser.NUMBER, i);
		}
		public DeleteCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeListener) ((ShapeListener)listener).enterDeleteCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShapeListener) ((ShapeListener)listener).exitDeleteCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShapeVisitor) return ((ShapeVisitor<? extends T>)visitor).visitDeleteCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteCommandContext deleteCommand() throws RecognitionException {
		DeleteCommandContext _localctx = new DeleteCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deleteCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			((DeleteCommandContext)_localctx).command = match(T__0);
			setState(26);
			((DeleteCommandContext)_localctx).pointX = match(NUMBER);
			setState(27);
			((DeleteCommandContext)_localctx).pointY = match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16 \4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\5\3\22\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\3\2\4\5\2"+
		"\33\2\f\3\2\2\2\4\21\3\2\2\2\6\23\3\2\2\2\b\31\3\2\2\2\n\33\3\2\2\2\f"+
		"\r\5\4\3\2\r\16\7\2\2\3\16\3\3\2\2\2\17\22\5\6\4\2\20\22\5\n\6\2\21\17"+
		"\3\2\2\2\21\20\3\2\2\2\22\5\3\2\2\2\23\24\5\b\5\2\24\25\7\6\2\2\25\26"+
		"\7\13\2\2\26\27\7\13\2\2\27\30\7\n\2\2\30\7\3\2\2\2\31\32\t\2\2\2\32\t"+
		"\3\2\2\2\33\34\7\3\2\2\34\35\7\13\2\2\35\36\7\13\2\2\36\13\3\2\2\2\3\21";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}