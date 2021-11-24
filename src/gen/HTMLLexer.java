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
		SEA_WS=7, SCRIPT_OPEN=8, STYLE_OPEN=9, TAG_OPEN=10, HTML_TEXT=11, IN=12, 
		SINGLE_QOUTE=13, SPACE=14, NG_ATTRBIUTE=15, SEMICOLON=16, ARRAY_OPEN=17, 
		ARRAY_CLOSE=18, ID=19, Equals=20, TAG_CLOSE=21, TAG_SLASH_CLOSE=22, NGFOR=23, 
		OPEN=24, TAG_SLASH=25, TAG_EQUALS=26, TAG_NAME=27, TAG_WHITESPACE=28, 
		SCRIPT_BODY=29, SCRIPT_SHORT_BODY=30, STYLE_BODY=31, STYLE_SHORT_BODY=32, 
		ATTVALUE_VALUE=33, ATTRIBUTE=34;
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
			"SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", "IN", 
			"SINGLE_QOUTE", "SPACE", "NG_ATTRBIUTE", "SEMICOLON", "ARRAY_OPEN", "ARRAY_CLOSE", 
			"ID", "Equals", "TAG_CLOSE", "TAG_SLASH_CLOSE", "NGFOR", "OPEN", "TAG_SLASH", 
			"TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", "HEXDIGIT", "DIGIT", "TAG_NameChar", 
			"TAG_NameStartChar", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", 
			"STYLE_SHORT_BODY", "ATTVALUE_VALUE", "ATTRIBUTE", "ATTCHARS", "ATTCHAR", 
			"HEXCHARS", "DECCHARS", "DOUBLE_QUOTE_STRING", "SINGLE_QUOTE_STRING", 
			"LETTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'in'", "'''", "' '", "'!'", "';'", "'['", "']'", null, null, "'>'", 
			"'/>'", "'ng-for'", null, "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", 
			"SCRIPTLET", "SEA_WS", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", 
			"IN", "SINGLE_QOUTE", "SPACE", "NG_ATTRBIUTE", "SEMICOLON", "ARRAY_OPEN", 
			"ARRAY_CLOSE", "ID", "Equals", "TAG_CLOSE", "TAG_SLASH_CLOSE", "NGFOR", 
			"OPEN", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", "SCRIPT_BODY", 
			"SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", "ATTVALUE_VALUE", 
			"ATTRIBUTE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u01b8\b\1\b\1\b"+
		"\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
		"\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t"+
		"(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\7\2i\n\2"+
		"\f\2\16\2l\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3w\n\3\f\3\16\3"+
		"z\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0086\n\4\f\4\16\4"+
		"\u0089\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0098"+
		"\n\5\f\5\16\5\u009b\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u00a5\n\6"+
		"\f\6\16\6\u00a8\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00b0\n\7\f\7\16\7\u00b3"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00bb\n\7\f\7\16\7\u00be\13\7\3\7\3"+
		"\7\5\7\u00c2\n\7\3\b\3\b\5\b\u00c6\n\b\3\b\6\b\u00c9\n\b\r\b\16\b\u00ca"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d6\n\t\f\t\16\t\u00d9\13\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e7\n\n\f\n\16"+
		"\n\u00ea\13\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\6\f\u00f5\n\f\r"+
		"\f\16\f\u00f6\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u012a\n\34\f\34\16"+
		"\34\u012d\13\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \5"+
		" \u013b\n \3!\5!\u013e\n!\3\"\7\"\u0141\n\"\f\"\16\"\u0144\13\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\7#\u0153\n#\f#\16#\u0156"+
		"\13#\3#\3#\3#\3#\3#\3#\3$\7$\u015f\n$\f$\16$\u0162\13$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3%\7%\u0170\n%\f%\16%\u0173\13%\3%\3%\3%\3%\3%\3%\3"+
		"&\7&\u017c\n&\f&\16&\u017f\13&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u018a"+
		"\n\'\3(\6(\u018d\n(\r(\16(\u018e\3(\5(\u0192\n(\3)\5)\u0195\n)\3*\3*\6"+
		"*\u0199\n*\r*\16*\u019a\3+\6+\u019e\n+\r+\16+\u019f\3+\5+\u01a3\n+\3,"+
		"\3,\7,\u01a7\n,\f,\16,\u01aa\13,\3,\3,\3-\3-\7-\u01b0\n-\f-\16-\u01b3"+
		"\13-\3-\3-\3.\3.\17jx\u0087\u0099\u00a6\u00b1\u00bc\u00d7\u00e8\u0142"+
		"\u0154\u0160\u0171\2/\b\3\n\4\f\5\16\6\20\7\22\b\24\t\26\n\30\13\32\f"+
		"\34\r\36\16 \17\"\20$\21&\22(\23*\24,\25.\26\60\27\62\30\64\31\66\328"+
		"\33:\34<\35>\36@\2B\2D\2F\2H\37J L!N\"P#R$T\2V\2X\2Z\2\\\2^\2`\2\b\2\3"+
		"\4\5\6\7\16\4\2\13\13\"\"\3\2>>\5\2\13\f\17\17\"\"\5\2\62;CHch\3\2\62"+
		";\4\2/\60aa\5\2\u00b9\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191"+
		"\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\t\2%%-=??AAC\\aac|\4"+
		"\2$$>>\4\2))>>\4\2C\\c|\2\u01c9\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2"+
		"\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3"+
		"\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\3\36\3\2\2\2\3 \3\2\2\2\3\"\3\2\2\2\3"+
		"$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\3\60"+
		"\3\2\2\2\3\62\3\2\2\2\4\64\3\2\2\2\4\66\3\2\2\2\48\3\2\2\2\4:\3\2\2\2"+
		"\4<\3\2\2\2\4>\3\2\2\2\5H\3\2\2\2\5J\3\2\2\2\6L\3\2\2\2\6N\3\2\2\2\7P"+
		"\3\2\2\2\7R\3\2\2\2\bb\3\2\2\2\nq\3\2\2\2\f~\3\2\2\2\16\u008c\3\2\2\2"+
		"\20\u00a0\3\2\2\2\22\u00c1\3\2\2\2\24\u00c8\3\2\2\2\26\u00cc\3\2\2\2\30"+
		"\u00de\3\2\2\2\32\u00ef\3\2\2\2\34\u00f4\3\2\2\2\36\u00f8\3\2\2\2 \u00fb"+
		"\3\2\2\2\"\u00fd\3\2\2\2$\u00ff\3\2\2\2&\u0101\3\2\2\2(\u0103\3\2\2\2"+
		"*\u0105\3\2\2\2,\u0107\3\2\2\2.\u0109\3\2\2\2\60\u010b\3\2\2\2\62\u010f"+
		"\3\2\2\2\64\u0114\3\2\2\2\66\u011d\3\2\2\28\u0121\3\2\2\2:\u0123\3\2\2"+
		"\2<\u0127\3\2\2\2>\u012e\3\2\2\2@\u0132\3\2\2\2B\u0134\3\2\2\2D\u013a"+
		"\3\2\2\2F\u013d\3\2\2\2H\u0142\3\2\2\2J\u0154\3\2\2\2L\u0160\3\2\2\2N"+
		"\u0171\3\2\2\2P\u017d\3\2\2\2R\u0189\3\2\2\2T\u018c\3\2\2\2V\u0194\3\2"+
		"\2\2X\u0196\3\2\2\2Z\u019d\3\2\2\2\\\u01a4\3\2\2\2^\u01ad\3\2\2\2`\u01b6"+
		"\3\2\2\2bc\7>\2\2cd\7#\2\2de\7/\2\2ef\7/\2\2fj\3\2\2\2gi\13\2\2\2hg\3"+
		"\2\2\2il\3\2\2\2jk\3\2\2\2jh\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7/\2\2no\7"+
		"/\2\2op\7@\2\2p\t\3\2\2\2qr\7>\2\2rs\7#\2\2st\7]\2\2tx\3\2\2\2uw\13\2"+
		"\2\2vu\3\2\2\2wz\3\2\2\2xy\3\2\2\2xv\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7_"+
		"\2\2|}\7@\2\2}\13\3\2\2\2~\177\7>\2\2\177\u0080\7A\2\2\u0080\u0081\7z"+
		"\2\2\u0081\u0082\7o\2\2\u0082\u0083\7n\2\2\u0083\u0087\3\2\2\2\u0084\u0086"+
		"\13\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0088\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b"+
		"\7@\2\2\u008b\r\3\2\2\2\u008c\u008d\7>\2\2\u008d\u008e\7#\2\2\u008e\u008f"+
		"\7]\2\2\u008f\u0090\7E\2\2\u0090\u0091\7F\2\2\u0091\u0092\7C\2\2\u0092"+
		"\u0093\7V\2\2\u0093\u0094\7C\2\2\u0094\u0095\7]\2\2\u0095\u0099\3\2\2"+
		"\2\u0096\u0098\13\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009d\7_\2\2\u009d\u009e\7_\2\2\u009e\u009f\7@\2\2\u009f\17"+
		"\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1\u00a2\7#\2\2\u00a2\u00a6\3\2\2\2\u00a3"+
		"\u00a5\13\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3"+
		"\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\7@\2\2\u00aa\21\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad\7A\2\2\u00ad"+
		"\u00b1\3\2\2\2\u00ae\u00b0\13\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\7A\2\2\u00b5\u00c2\7@\2\2\u00b6\u00b7\7>\2"+
		"\2\u00b7\u00b8\7\'\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00bb\13\2\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\'\2\2\u00c0"+
		"\u00c2\7@\2\2\u00c1\u00ab\3\2\2\2\u00c1\u00b6\3\2\2\2\u00c2\23\3\2\2\2"+
		"\u00c3\u00c9\t\2\2\2\u00c4\u00c6\7\17\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\7\f\2\2\u00c8\u00c3\3\2\2\2\u00c8"+
		"\u00c5\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\25\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf"+
		"\7e\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7r\2\2\u00d2"+
		"\u00d3\7v\2\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\13\2\2\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7@\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\b\t\2\2\u00dd\27\3\2\2\2\u00de\u00df\7>\2\2\u00df\u00e0"+
		"\7u\2\2\u00e0\u00e1\7v\2\2\u00e1\u00e2\7{\2\2\u00e2\u00e3\7n\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\u00e8\3\2\2\2\u00e5\u00e7\13\2\2\2\u00e6\u00e5\3\2"+
		"\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7@\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\b\n\3\2\u00ee\31\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f2\b\13\4\2\u00f2\33\3\2\2\2\u00f3\u00f5\n\3\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\35\3\2\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7p\2\2\u00fa\37\3"+
		"\2\2\2\u00fb\u00fc\7)\2\2\u00fc!\3\2\2\2\u00fd\u00fe\7\"\2\2\u00fe#\3"+
		"\2\2\2\u00ff\u0100\7#\2\2\u0100%\3\2\2\2\u0101\u0102\7=\2\2\u0102\'\3"+
		"\2\2\2\u0103\u0104\7]\2\2\u0104)\3\2\2\2\u0105\u0106\7_\2\2\u0106+\3\2"+
		"\2\2\u0107\u0108\5<\34\2\u0108-\3\2\2\2\u0109\u010a\7?\2\2\u010a/\3\2"+
		"\2\2\u010b\u010c\7@\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b\26\5\2\u010e"+
		"\61\3\2\2\2\u010f\u0110\7\61\2\2\u0110\u0111\7@\2\2\u0111\u0112\3\2\2"+
		"\2\u0112\u0113\b\27\5\2\u0113\63\3\2\2\2\u0114\u0115\7p\2\2\u0115\u0116"+
		"\7i\2\2\u0116\u0117\7/\2\2\u0117\u0118\7h\2\2\u0118\u0119\7q\2\2\u0119"+
		"\u011a\7t\2\2\u011a\u011b\3\2\2\2\u011b\u011c\b\30\6\2\u011c\65\3\2\2"+
		"\2\u011d\u011e\7>\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b\31\5\2\u0120\67"+
		"\3\2\2\2\u0121\u0122\7\61\2\2\u01229\3\2\2\2\u0123\u0124\7?\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u0126\b\33\7\2\u0126;\3\2\2\2\u0127\u012b\5F!\2\u0128"+
		"\u012a\5D \2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2"+
		"\2\u012b\u012c\3\2\2\2\u012c=\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f"+
		"\t\4\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b\35\b\2\u0131?\3\2\2\2\u0132"+
		"\u0133\t\5\2\2\u0133A\3\2\2\2\u0134\u0135\t\6\2\2\u0135C\3\2\2\2\u0136"+
		"\u013b\5F!\2\u0137\u013b\t\7\2\2\u0138\u013b\5B\37\2\u0139\u013b\t\b\2"+
		"\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139"+
		"\3\2\2\2\u013bE\3\2\2\2\u013c\u013e\t\t\2\2\u013d\u013c\3\2\2\2\u013e"+
		"G\3\2\2\2\u013f\u0141\13\2\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2"+
		"\u0142\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0145\u0146\7>\2\2\u0146\u0147\7\61\2\2\u0147\u0148\7u\2\2\u0148"+
		"\u0149\7e\2\2\u0149\u014a\7t\2\2\u014a\u014b\7k\2\2\u014b\u014c\7r\2\2"+
		"\u014c\u014d\7v\2\2\u014d\u014e\7@\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\b\"\5\2\u0150I\3\2\2\2\u0151\u0153\13\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"\u0156\3\2\2\2\u0154\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\3\2"+
		"\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7>\2\2\u0158\u0159\7\61\2\2\u0159"+
		"\u015a\7@\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b#\5\2\u015cK\3\2\2\2\u015d"+
		"\u015f\13\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u0161\3"+
		"\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0164\7>\2\2\u0164\u0165\7\61\2\2\u0165\u0166\7u\2\2\u0166\u0167\7v\2"+
		"\2\u0167\u0168\7{\2\2\u0168\u0169\7n\2\2\u0169\u016a\7g\2\2\u016a\u016b"+
		"\7@\2\2\u016b\u016c\3\2\2\2\u016c\u016d\b$\5\2\u016dM\3\2\2\2\u016e\u0170"+
		"\13\2\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u0172\3\2\2\2"+
		"\u0171\u016f\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u0175"+
		"\7>\2\2\u0175\u0176\7\61\2\2\u0176\u0177\7@\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\b%\5\2\u0179O\3\2\2\2\u017a\u017c\7\"\2\2\u017b\u017a\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0181\5R\'\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\b&\5\2\u0183Q\3\2\2\2\u0184\u018a\5\\,\2\u0185\u018a\5^-\2\u0186"+
		"\u018a\5T(\2\u0187\u018a\5X*\2\u0188\u018a\5Z+\2\u0189\u0184\3\2\2\2\u0189"+
		"\u0185\3\2\2\2\u0189\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2"+
		"\2\2\u018aS\3\2\2\2\u018b\u018d\5V)\2\u018c\u018b\3\2\2\2\u018d\u018e"+
		"\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190"+
		"\u0192\7\"\2\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192U\3\2\2\2"+
		"\u0193\u0195\t\n\2\2\u0194\u0193\3\2\2\2\u0195W\3\2\2\2\u0196\u0198\7"+
		"%\2\2\u0197\u0199\t\5\2\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019bY\3\2\2\2\u019c\u019e\t\6\2\2"+
		"\u019d\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0"+
		"\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u01a3\7\'\2\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3[\3\2\2\2\u01a4\u01a8\7$\2\2\u01a5\u01a7\n\13\2\2"+
		"\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7$\2\2\u01ac"+
		"]\3\2\2\2\u01ad\u01b1\7)\2\2\u01ae\u01b0\n\f\2\2\u01af\u01ae\3\2\2\2\u01b0"+
		"\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2"+
		"\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\7)\2\2\u01b5_\3\2\2\2\u01b6\u01b7"+
		"\t\r\2\2\u01b7a\3\2\2\2\'\2\3\4\5\6\7jx\u0087\u0099\u00a6\u00b1\u00bc"+
		"\u00c1\u00c5\u00c8\u00ca\u00d7\u00e8\u00f6\u012b\u013a\u013d\u0142\u0154"+
		"\u0160\u0171\u017d\u0189\u018e\u0191\u0194\u019a\u019f\u01a2\u01a8\u01b1"+
		"\t\7\5\2\7\6\2\7\4\2\6\2\2\7\3\2\7\7\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}