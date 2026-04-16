// Generated from WhileLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class WhileLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=1, IF=2, ELSE=3, BREAK=4, CONTINUE=5, INT=6, STRING=7, ASSIGN=8, 
		PLUS=9, MINUS=10, MULT=11, DIV=12, LT=13, GT=14, LE=15, GE=16, EQ=17, 
		NE=18, LPAREN=19, RPAREN=20, LBRACE=21, RBRACE=22, SEMI=23, ID=24, NUMBER=25, 
		STRING_LITERAL=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHILE", "IF", "ELSE", "BREAK", "CONTINUE", "INT", "STRING", "ASSIGN", 
			"PLUS", "MINUS", "MULT", "DIV", "LT", "GT", "LE", "GE", "EQ", "NE", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "SEMI", "ID", "NUMBER", "STRING_LITERAL", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'if'", "'else'", "'break'", "'continue'", "'int'", 
			"'string'", "'='", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHILE", "IF", "ELSE", "BREAK", "CONTINUE", "INT", "STRING", "ASSIGN", 
			"PLUS", "MINUS", "MULT", "DIV", "LT", "GT", "LE", "GE", "EQ", "NE", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "SEMI", "ID", "NUMBER", "STRING_LITERAL", 
			"WS"
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


	public WhileLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WhileLang.g4"; }

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

	public static final String _serializedATN =
		"\u0004\u0000\u001b\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u0086\b\u0017\n\u0017\f\u0017"+
		"\u0089\t\u0017\u0001\u0018\u0004\u0018\u008c\b\u0018\u000b\u0018\f\u0018"+
		"\u008d\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0094"+
		"\b\u0019\n\u0019\f\u0019\u0097\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0004\u001a\u009c\b\u001a\u000b\u001a\f\u001a\u009d\u0001\u001a\u0001"+
		"\u001a\u0000\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b\u0001\u0000\u0005"+
		"\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0004\u0000\n\n\r"+
		"\r\"\"\\\\\u0003\u0000\t\n\r\r  \u00a5\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00017\u0001\u0000\u0000\u0000\u0003=\u0001\u0000\u0000\u0000\u0005"+
		"@\u0001\u0000\u0000\u0000\u0007E\u0001\u0000\u0000\u0000\tK\u0001\u0000"+
		"\u0000\u0000\u000bT\u0001\u0000\u0000\u0000\rX\u0001\u0000\u0000\u0000"+
		"\u000f_\u0001\u0000\u0000\u0000\u0011a\u0001\u0000\u0000\u0000\u0013c"+
		"\u0001\u0000\u0000\u0000\u0015e\u0001\u0000\u0000\u0000\u0017g\u0001\u0000"+
		"\u0000\u0000\u0019i\u0001\u0000\u0000\u0000\u001bk\u0001\u0000\u0000\u0000"+
		"\u001dm\u0001\u0000\u0000\u0000\u001fp\u0001\u0000\u0000\u0000!s\u0001"+
		"\u0000\u0000\u0000#v\u0001\u0000\u0000\u0000%y\u0001\u0000\u0000\u0000"+
		"\'{\u0001\u0000\u0000\u0000)}\u0001\u0000\u0000\u0000+\u007f\u0001\u0000"+
		"\u0000\u0000-\u0081\u0001\u0000\u0000\u0000/\u0083\u0001\u0000\u0000\u0000"+
		"1\u008b\u0001\u0000\u0000\u00003\u008f\u0001\u0000\u0000\u00005\u009b"+
		"\u0001\u0000\u0000\u000078\u0005w\u0000\u000089\u0005h\u0000\u00009:\u0005"+
		"i\u0000\u0000:;\u0005l\u0000\u0000;<\u0005e\u0000\u0000<\u0002\u0001\u0000"+
		"\u0000\u0000=>\u0005i\u0000\u0000>?\u0005f\u0000\u0000?\u0004\u0001\u0000"+
		"\u0000\u0000@A\u0005e\u0000\u0000AB\u0005l\u0000\u0000BC\u0005s\u0000"+
		"\u0000CD\u0005e\u0000\u0000D\u0006\u0001\u0000\u0000\u0000EF\u0005b\u0000"+
		"\u0000FG\u0005r\u0000\u0000GH\u0005e\u0000\u0000HI\u0005a\u0000\u0000"+
		"IJ\u0005k\u0000\u0000J\b\u0001\u0000\u0000\u0000KL\u0005c\u0000\u0000"+
		"LM\u0005o\u0000\u0000MN\u0005n\u0000\u0000NO\u0005t\u0000\u0000OP\u0005"+
		"i\u0000\u0000PQ\u0005n\u0000\u0000QR\u0005u\u0000\u0000RS\u0005e\u0000"+
		"\u0000S\n\u0001\u0000\u0000\u0000TU\u0005i\u0000\u0000UV\u0005n\u0000"+
		"\u0000VW\u0005t\u0000\u0000W\f\u0001\u0000\u0000\u0000XY\u0005s\u0000"+
		"\u0000YZ\u0005t\u0000\u0000Z[\u0005r\u0000\u0000[\\\u0005i\u0000\u0000"+
		"\\]\u0005n\u0000\u0000]^\u0005g\u0000\u0000^\u000e\u0001\u0000\u0000\u0000"+
		"_`\u0005=\u0000\u0000`\u0010\u0001\u0000\u0000\u0000ab\u0005+\u0000\u0000"+
		"b\u0012\u0001\u0000\u0000\u0000cd\u0005-\u0000\u0000d\u0014\u0001\u0000"+
		"\u0000\u0000ef\u0005*\u0000\u0000f\u0016\u0001\u0000\u0000\u0000gh\u0005"+
		"/\u0000\u0000h\u0018\u0001\u0000\u0000\u0000ij\u0005<\u0000\u0000j\u001a"+
		"\u0001\u0000\u0000\u0000kl\u0005>\u0000\u0000l\u001c\u0001\u0000\u0000"+
		"\u0000mn\u0005<\u0000\u0000no\u0005=\u0000\u0000o\u001e\u0001\u0000\u0000"+
		"\u0000pq\u0005>\u0000\u0000qr\u0005=\u0000\u0000r \u0001\u0000\u0000\u0000"+
		"st\u0005=\u0000\u0000tu\u0005=\u0000\u0000u\"\u0001\u0000\u0000\u0000"+
		"vw\u0005!\u0000\u0000wx\u0005=\u0000\u0000x$\u0001\u0000\u0000\u0000y"+
		"z\u0005(\u0000\u0000z&\u0001\u0000\u0000\u0000{|\u0005)\u0000\u0000|("+
		"\u0001\u0000\u0000\u0000}~\u0005{\u0000\u0000~*\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005}\u0000\u0000\u0080,\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005;\u0000\u0000\u0082.\u0001\u0000\u0000\u0000\u0083\u0087\u0007\u0000"+
		"\u0000\u0000\u0084\u0086\u0007\u0001\u0000\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u00880\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008c\u0007\u0002\u0000"+
		"\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e2\u0001\u0000\u0000\u0000\u008f\u0095\u0005\"\u0000\u0000"+
		"\u0090\u0094\b\u0003\u0000\u0000\u0091\u0092\u0005\\\u0000\u0000\u0092"+
		"\u0094\t\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0005\"\u0000\u0000\u00994\u0001\u0000\u0000\u0000\u009a\u009c\u0007"+
		"\u0004\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0006"+
		"\u001a\u0000\u0000\u00a06\u0001\u0000\u0000\u0000\u0006\u0000\u0087\u008d"+
		"\u0093\u0095\u009d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}