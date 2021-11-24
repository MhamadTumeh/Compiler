// Generated from E:/???????/???? ????? ???????/????????/????? 2022/src\HTMLLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_CONDITIONAL_COMMENT=2, XML=3, CDATA=4, DTD=5, SCRIPTLET=6, 
		SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, HTML_TEXT=11, NG_OPEN=12, 
		NG_CLOSE=13, NGFOR=14, IN=15, SINGLE_QOUTE=16, NG_ATTRBIUTE=17, SEMICOLON=18, 
		ARRAY_OPEN=19, ARRAY_CLOSE=20, ID=21, Equals=22, INDEX=23, TAG_CLOSE=24, 
		TAG_SLASH_CLOSE=25, TAG_SLASH=26, TAG_EQUALS=27, TAG_NAME=28, TAG_WHITESPACE=29, 
		SCRIPT_BODY=30, SCRIPT_SHORT_BODY=31, STYLE_BODY=32, STYLE_SHORT_BODY=33, 
		ATTVALUE_VALUE=34, ATTRIBUTE=35;
	public static final int
		NG=1, TAG=2, SCRIPT=3, STYLE=4, ATTVALUE=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "NG", "TAG", "SCRIPT", "STYLE", "ATTVALUE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", "SCRIPTLET", 
			"SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", "NG_OPEN", 
			"NG_CLOSE", "NGFOR", "IN", "SINGLE_QOUTE", "NG_ATTRBIUTE", "SEMICOLON", 
			"ARRAY_OPEN", "ARRAY_CLOSE", "ID", "Equals", "INDEX", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", "HEXDIGIT", 
			"DIGIT", "TAG_NameChar", "TAG_NameStartChar", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", 
			"STYLE_BODY", "STYLE_SHORT_BODY", "ATTVALUE_VALUE", "ATTRIBUTE", "ATTCHARS", 
			"ATTCHAR", "HEXCHARS", "DECCHARS", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING", 
			"LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'<'", null, 
			null, "'\"'", "'ng-for'", "'in'", "'''", "'!'", "';'", "'['", "']'", 
			null, null, "'index'", "'>'", "'/>'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", 
			"SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", 
			"NG_OPEN", "NG_CLOSE", "NGFOR", "IN", "SINGLE_QOUTE", "NG_ATTRBIUTE", 
			"SEMICOLON", "ARRAY_OPEN", "ARRAY_CLOSE", "ID", "Equals", "INDEX", "TAG_CLOSE", 
			"TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", 
			"SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", 
			"ATTVALUE_VALUE", "ATTRIBUTE"
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


	public HTMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u01c5\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t"+
		"(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\7"+
		"\2k\n\2\f\2\16\2n\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3y\n\3\f"+
		"\3\16\3|\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0088\n\4\f"+
		"\4\16\4\u008b\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5\u009a\n\5\f\5\16\5\u009d\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6"+
		"\u00a7\n\6\f\6\16\6\u00aa\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00b2\n\7\f"+
		"\7\16\7\u00b5\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00bd\n\7\f\7\16\7\u00c0"+
		"\13\7\3\7\3\7\5\7\u00c4\n\7\3\b\3\b\5\b\u00c8\n\b\3\b\6\b\u00cb\n\b\r"+
		"\b\16\b\u00cc\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d8\n\t\f\t\16"+
		"\t\u00db\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e9"+
		"\n\n\f\n\16\n\u00ec\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\f\u00f7"+
		"\n\f\r\f\16\f\u00f8\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\6\26\u011a\n\26\r\26\16\26\u011b\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\7\35\u0137\n\35\f\35\16"+
		"\35\u013a\13\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\5!\u0148"+
		"\n!\3\"\5\"\u014b\n\"\3#\7#\u014e\n#\f#\16#\u0151\13#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\7$\u0160\n$\f$\16$\u0163\13$\3$\3$\3$\3$\3$\3$"+
		"\3%\7%\u016c\n%\f%\16%\u016f\13%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\7"+
		"&\u017d\n&\f&\16&\u0180\13&\3&\3&\3&\3&\3&\3&\3\'\7\'\u0189\n\'\f\'\16"+
		"\'\u018c\13\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u0197\n(\3)\6)\u019a\n"+
		")\r)\16)\u019b\3)\5)\u019f\n)\3*\5*\u01a2\n*\3+\3+\6+\u01a6\n+\r+\16+"+
		"\u01a7\3,\6,\u01ab\n,\r,\16,\u01ac\3,\5,\u01b0\n,\3-\3-\7-\u01b4\n-\f"+
		"-\16-\u01b7\13-\3-\3-\3.\3.\7.\u01bd\n.\f.\16.\u01c0\13.\3.\3.\3/\3/\17"+
		"lz\u0089\u009b\u00a8\u00b3\u00be\u00d9\u00ea\u014f\u0161\u016d\u017e\2"+
		"\60\b\3\n\4\f\5\16\6\20\7\22\b\24\t\26\n\30\13\32\f\34\r\36\16 \17\"\20"+
		"$\21&\22(\23*\24,\25.\26\60\27\62\30\64\31\66\328\33:\34<\35>\36@\37B"+
		"\2D\2F\2H\2J L!N\"P#R$T%V\2X\2Z\2\\\2^\2`\2b\2\b\2\3\4\5\6\7\17\4\2\13"+
		"\13\"\"\3\2>>\3\2c|\5\2\13\f\17\17\"\"\5\2\62;CHch\3\2\62;\4\2/\60aa\5"+
		"\2\u00b9\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1"+
		"\u3003\ud801\uf902\ufdd1\ufdf2\uffff\t\2%%-=??AAC\\aac|\4\2$$>>\4\2))"+
		">>\4\2C\\c|\2\u01d7\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2"+
		"\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3"+
		"\2\2\2\2\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\4\"\3\2\2\2\4$\3\2\2\2\4&"+
		"\3\2\2\2\4(\3\2\2\2\4*\3\2\2\2\4,\3\2\2\2\4.\3\2\2\2\4\60\3\2\2\2\4\62"+
		"\3\2\2\2\4\64\3\2\2\2\4\66\3\2\2\2\48\3\2\2\2\4:\3\2\2\2\4<\3\2\2\2\4"+
		">\3\2\2\2\4@\3\2\2\2\5J\3\2\2\2\5L\3\2\2\2\6N\3\2\2\2\6P\3\2\2\2\7R\3"+
		"\2\2\2\7T\3\2\2\2\bd\3\2\2\2\ns\3\2\2\2\f\u0080\3\2\2\2\16\u008e\3\2\2"+
		"\2\20\u00a2\3\2\2\2\22\u00c3\3\2\2\2\24\u00ca\3\2\2\2\26\u00ce\3\2\2\2"+
		"\30\u00e0\3\2\2\2\32\u00f1\3\2\2\2\34\u00f6\3\2\2\2\36\u00fa\3\2\2\2 "+
		"\u0100\3\2\2\2\"\u0104\3\2\2\2$\u010b\3\2\2\2&\u010e\3\2\2\2(\u0110\3"+
		"\2\2\2*\u0112\3\2\2\2,\u0114\3\2\2\2.\u0116\3\2\2\2\60\u0119\3\2\2\2\62"+
		"\u011d\3\2\2\2\64\u011f\3\2\2\2\66\u0125\3\2\2\28\u0129\3\2\2\2:\u012e"+
		"\3\2\2\2<\u0130\3\2\2\2>\u0134\3\2\2\2@\u013b\3\2\2\2B\u013f\3\2\2\2D"+
		"\u0141\3\2\2\2F\u0147\3\2\2\2H\u014a\3\2\2\2J\u014f\3\2\2\2L\u0161\3\2"+
		"\2\2N\u016d\3\2\2\2P\u017e\3\2\2\2R\u018a\3\2\2\2T\u0196\3\2\2\2V\u0199"+
		"\3\2\2\2X\u01a1\3\2\2\2Z\u01a3\3\2\2\2\\\u01aa\3\2\2\2^\u01b1\3\2\2\2"+
		"`\u01ba\3\2\2\2b\u01c3\3\2\2\2de\7>\2\2ef\7#\2\2fg\7/\2\2gh\7/\2\2hl\3"+
		"\2\2\2ik\13\2\2\2ji\3\2\2\2kn\3\2\2\2lm\3\2\2\2lj\3\2\2\2mo\3\2\2\2nl"+
		"\3\2\2\2op\7/\2\2pq\7/\2\2qr\7@\2\2r\t\3\2\2\2st\7>\2\2tu\7#\2\2uv\7]"+
		"\2\2vz\3\2\2\2wy\13\2\2\2xw\3\2\2\2y|\3\2\2\2z{\3\2\2\2zx\3\2\2\2{}\3"+
		"\2\2\2|z\3\2\2\2}~\7_\2\2~\177\7@\2\2\177\13\3\2\2\2\u0080\u0081\7>\2"+
		"\2\u0081\u0082\7A\2\2\u0082\u0083\7z\2\2\u0083\u0084\7o\2\2\u0084\u0085"+
		"\7n\2\2\u0085\u0089\3\2\2\2\u0086\u0088\13\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7@\2\2\u008d\r\3\2\2\2\u008e\u008f"+
		"\7>\2\2\u008f\u0090\7#\2\2\u0090\u0091\7]\2\2\u0091\u0092\7E\2\2\u0092"+
		"\u0093\7F\2\2\u0093\u0094\7C\2\2\u0094\u0095\7V\2\2\u0095\u0096\7C\2\2"+
		"\u0096\u0097\7]\2\2\u0097\u009b\3\2\2\2\u0098\u009a\13\2\2\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7_\2\2\u009f\u00a0\7_\2"+
		"\2\u00a0\u00a1\7@\2\2\u00a1\17\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4"+
		"\7#\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a7\13\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac\21\3\2\2\2\u00ad\u00ae"+
		"\7>\2\2\u00ae\u00af\7A\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\13\2\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7A\2\2\u00b7"+
		"\u00c4\7@\2\2\u00b8\u00b9\7>\2\2\u00b9\u00ba\7\'\2\2\u00ba\u00be\3\2\2"+
		"\2\u00bb\u00bd\13\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c1\u00c2\7\'\2\2\u00c2\u00c4\7@\2\2\u00c3\u00ad\3\2\2\2\u00c3"+
		"\u00b8\3\2\2\2\u00c4\23\3\2\2\2\u00c5\u00cb\t\2\2\2\u00c6\u00c8\7\17\2"+
		"\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb"+
		"\7\f\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\25\3\2\2\2\u00ce\u00cf\7>\2\2"+
		"\u00cf\u00d0\7u\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3"+
		"\7k\2\2\u00d3\u00d4\7r\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d9\3\2\2\2\u00d6"+
		"\u00d8\13\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00da\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00dd\7@\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b\t\2\2\u00df\27\3\2\2\2"+
		"\u00e0\u00e1\7>\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4"+
		"\7{\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7g\2\2\u00e6\u00ea\3\2\2\2\u00e7"+
		"\u00e9\13\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00eb\3"+
		"\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00ee\7@\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b\n\3\2\u00f0\31\3\2\2\2"+
		"\u00f1\u00f2\7>\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b\13\4\2\u00f4\33"+
		"\3\2\2\2\u00f5\u00f7\n\3\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\35\3\2\2\2\u00fa\u00fb\5(\22"+
		"\2\u00fb\u00fc\7$\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b\r\5\2\u00fe\u00ff"+
		"\b\r\6\2\u00ff\37\3\2\2\2\u0100\u0101\7$\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\b\16\5\2\u0103!\3\2\2\2\u0104\u0105\7p\2\2\u0105\u0106\7i\2\2\u0106"+
		"\u0107\7/\2\2\u0107\u0108\7h\2\2\u0108\u0109\7q\2\2\u0109\u010a\7t\2\2"+
		"\u010a#\3\2\2\2\u010b\u010c\7k\2\2\u010c\u010d\7p\2\2\u010d%\3\2\2\2\u010e"+
		"\u010f\7)\2\2\u010f\'\3\2\2\2\u0110\u0111\7#\2\2\u0111)\3\2\2\2\u0112"+
		"\u0113\7=\2\2\u0113+\3\2\2\2\u0114\u0115\7]\2\2\u0115-\3\2\2\2\u0116\u0117"+
		"\7_\2\2\u0117/\3\2\2\2\u0118\u011a\t\4\2\2\u0119\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\61\3\2\2\2\u011d"+
		"\u011e\7?\2\2\u011e\63\3\2\2\2\u011f\u0120\7k\2\2\u0120\u0121\7p\2\2\u0121"+
		"\u0122\7f\2\2\u0122\u0123\7g\2\2\u0123\u0124\7z\2\2\u0124\65\3\2\2\2\u0125"+
		"\u0126\7@\2\2\u0126\u0127\3\2\2\2\u0127\u0128\b\31\5\2\u0128\67\3\2\2"+
		"\2\u0129\u012a\7\61\2\2\u012a\u012b\7@\2\2\u012b\u012c\3\2\2\2\u012c\u012d"+
		"\b\32\5\2\u012d9\3\2\2\2\u012e\u012f\7\61\2\2\u012f;\3\2\2\2\u0130\u0131"+
		"\7?\2\2\u0131\u0132\3\2\2\2\u0132\u0133\b\34\7\2\u0133=\3\2\2\2\u0134"+
		"\u0138\5H\"\2\u0135\u0137\5F!\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2"+
		"\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139?\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013b\u013c\t\5\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b\36\b\2"+
		"\u013eA\3\2\2\2\u013f\u0140\t\6\2\2\u0140C\3\2\2\2\u0141\u0142\t\7\2\2"+
		"\u0142E\3\2\2\2\u0143\u0148\5H\"\2\u0144\u0148\t\b\2\2\u0145\u0148\5D"+
		" \2\u0146\u0148\t\t\2\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148G\3\2\2\2\u0149\u014b\t\n\2\2"+
		"\u014a\u0149\3\2\2\2\u014bI\3\2\2\2\u014c\u014e\13\2\2\2\u014d\u014c\3"+
		"\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7>\2\2\u0153\u0154\7\61"+
		"\2\2\u0154\u0155\7u\2\2\u0155\u0156\7e\2\2\u0156\u0157\7t\2\2\u0157\u0158"+
		"\7k\2\2\u0158\u0159\7r\2\2\u0159\u015a\7v\2\2\u015a\u015b\7@\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015d\b#\5\2\u015dK\3\2\2\2\u015e\u0160\13\2\2\2"+
		"\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u0162\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7>\2\2\u0165"+
		"\u0166\7\61\2\2\u0166\u0167\7@\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b$"+
		"\5\2\u0169M\3\2\2\2\u016a\u016c\13\2\2\2\u016b\u016a\3\2\2\2\u016c\u016f"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0171\7>\2\2\u0171\u0172\7\61\2\2\u0172\u0173\7u"+
		"\2\2\u0173\u0174\7v\2\2\u0174\u0175\7{\2\2\u0175\u0176\7n\2\2\u0176\u0177"+
		"\7g\2\2\u0177\u0178\7@\2\2\u0178\u0179\3\2\2\2\u0179\u017a\b%\5\2\u017a"+
		"O\3\2\2\2\u017b\u017d\13\2\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2"+
		"\u017e\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0181\u0182\7>\2\2\u0182\u0183\7\61\2\2\u0183\u0184\7@\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\b&\5\2\u0186Q\3\2\2\2\u0187\u0189\7\"\2\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\5T(\2\u018e\u018f"+
		"\3\2\2\2\u018f\u0190\b\'\5\2\u0190S\3\2\2\2\u0191\u0197\5^-\2\u0192\u0197"+
		"\5`.\2\u0193\u0197\5V)\2\u0194\u0197\5Z+\2\u0195\u0197\5\\,\2\u0196\u0191"+
		"\3\2\2\2\u0196\u0192\3\2\2\2\u0196\u0193\3\2\2\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0195\3\2\2\2\u0197U\3\2\2\2\u0198\u019a\5X*\2\u0199\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\3\2"+
		"\2\2\u019d\u019f\7\"\2\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"W\3\2\2\2\u01a0\u01a2\t\13\2\2\u01a1\u01a0\3\2\2\2\u01a2Y\3\2\2\2\u01a3"+
		"\u01a5\7%\2\2\u01a4\u01a6\t\6\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8[\3\2\2\2\u01a9\u01ab"+
		"\t\7\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01b0\7\'\2\2\u01af\u01ae\3\2"+
		"\2\2\u01af\u01b0\3\2\2\2\u01b0]\3\2\2\2\u01b1\u01b5\7$\2\2\u01b2\u01b4"+
		"\n\f\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7$"+
		"\2\2\u01b9_\3\2\2\2\u01ba\u01be\7)\2\2\u01bb\u01bd\n\r\2\2\u01bc\u01bb"+
		"\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7)\2\2\u01c2a\3\2\2\2\u01c3"+
		"\u01c4\t\16\2\2\u01c4c\3\2\2\2(\2\3\4\5\6\7lz\u0089\u009b\u00a8\u00b3"+
		"\u00be\u00c3\u00c7\u00ca\u00cc\u00d9\u00ea\u00f8\u011b\u0138\u0147\u014a"+
		"\u014f\u0161\u016d\u017e\u018a\u0196\u019b\u019e\u01a1\u01a7\u01ac\u01af"+
		"\u01b5\u01be\t\7\5\2\7\6\2\7\4\2\6\2\2\7\3\2\7\7\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}