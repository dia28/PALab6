package bonus.antlr4;// Generated from Shape.g4 by ANTLR 4.9

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShapeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DRAW=2, FILL=3, ShapeList=4, CIRCLE=5, TRIANGLE=6, SQUARE=7, COLOR=8, 
		NUMBER=9, WS=10, NL=11, ERROR=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "DRAW", "FILL", "ShapeList", "CIRCLE", "TRIANGLE", "SQUARE", 
			"COLOR", "NUMBER", "WS", "NL", "ERROR"
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


	public ShapeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Shape.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("error");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5\60\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t]\n\t\3\n\6\n`\n\n\r\n\16\na\3\13\3\13\3\13\3\13\3\f\5\fi\n\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\3\2\3\4\2\13\13\"\"\2w\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2"+
		"\2\5\"\3\2\2\2\7\'\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r8\3\2\2\2\17A\3\2"+
		"\2\2\21\\\3\2\2\2\23_\3\2\2\2\25c\3\2\2\2\27h\3\2\2\2\31n\3\2\2\2\33\34"+
		"\7f\2\2\34\35\7g\2\2\35\36\7n\2\2\36\37\7g\2\2\37 \7v\2\2 !\7g\2\2!\4"+
		"\3\2\2\2\"#\7f\2\2#$\7t\2\2$%\7c\2\2%&\7y\2\2&\6\3\2\2\2\'(\7h\2\2()\7"+
		"k\2\2)*\7n\2\2*+\7n\2\2+\b\3\2\2\2,\60\5\13\6\2-\60\5\r\7\2.\60\5\17\b"+
		"\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\n\3\2\2\2\61\62\7e\2\2\62\63\7k\2"+
		"\2\63\64\7t\2\2\64\65\7e\2\2\65\66\7n\2\2\66\67\7g\2\2\67\f\3\2\2\289"+
		"\7v\2\29:\7t\2\2:;\7k\2\2;<\7c\2\2<=\7p\2\2=>\7i\2\2>?\7n\2\2?@\7g\2\2"+
		"@\16\3\2\2\2AB\7u\2\2BC\7s\2\2CD\7w\2\2DE\7c\2\2EF\7t\2\2FG\7g\2\2G\20"+
		"\3\2\2\2HI\7t\2\2IJ\7g\2\2J]\7f\2\2KL\7i\2\2LM\7t\2\2MN\7g\2\2NO\7g\2"+
		"\2O]\7p\2\2PQ\7{\2\2QR\7g\2\2RS\7n\2\2ST\7n\2\2TU\7q\2\2U]\7y\2\2VW\7"+
		"t\2\2WX\7c\2\2XY\7p\2\2YZ\7f\2\2Z[\7q\2\2[]\7o\2\2\\H\3\2\2\2\\K\3\2\2"+
		"\2\\P\3\2\2\2\\V\3\2\2\2]\22\3\2\2\2^`\4\62;\2_^\3\2\2\2`a\3\2\2\2a_\3"+
		"\2\2\2ab\3\2\2\2b\24\3\2\2\2cd\t\2\2\2de\3\2\2\2ef\b\13\2\2f\26\3\2\2"+
		"\2gi\7\17\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\f\2\2kl\3\2\2\2lm\b\f"+
		"\2\2m\30\3\2\2\2no\13\2\2\2op\b\r\3\2p\32\3\2\2\2\7\2/\\ah\4\b\2\2\3\r"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}