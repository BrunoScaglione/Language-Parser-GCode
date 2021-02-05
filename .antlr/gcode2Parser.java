// Generated from c:\Users\bruno\Desktop\Parser_versaoatualizada\gcode2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gcode2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, INT=11, ID=12, WS=13;
	public static final int
		RULE_prg = 0, RULE_fimprograma = 1, RULE_statement = 2, RULE_numerolinha = 3, 
		RULE_mfim = 4, RULE_mfunc = 5, RULE_codfunc = 6, RULE_coordx = 7, RULE_coordy = 8, 
		RULE_fimdelinha = 9;
	public static final String[] ruleNames = {
		"prg", "fimprograma", "statement", "numerolinha", "mfim", "mfunc", "codfunc", 
		"coordx", "coordy", "fimdelinha"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'N'", "'M30'", "'M02'", "'M01'", "'G01'", "'G00'", "'X'", "'Y'", 
		"'\r'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "INT", 
		"ID", "WS"
	};
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
	public String getGrammarFileName() { return "gcode2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gcode2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrgContext extends ParserRuleContext {
		public FimprogramaContext fimprograma() {
			return getRuleContext(FimprogramaContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(20);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(23); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(25);
			fimprograma();
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

	public static class FimprogramaContext extends ParserRuleContext {
		public NumerolinhaContext numerolinha() {
			return getRuleContext(NumerolinhaContext.class,0);
		}
		public MfimContext mfim() {
			return getRuleContext(MfimContext.class,0);
		}
		public FimprogramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fimprograma; }
	}

	public final FimprogramaContext fimprograma() throws RecognitionException {
		FimprogramaContext _localctx = new FimprogramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fimprograma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			numerolinha();
			setState(28);
			mfim();
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

	public static class StatementContext extends ParserRuleContext {
		public NumerolinhaContext numerolinha() {
			return getRuleContext(NumerolinhaContext.class,0);
		}
		public CodfuncContext codfunc() {
			return getRuleContext(CodfuncContext.class,0);
		}
		public CoordxContext coordx() {
			return getRuleContext(CoordxContext.class,0);
		}
		public CoordyContext coordy() {
			return getRuleContext(CoordyContext.class,0);
		}
		public FimdelinhaContext fimdelinha() {
			return getRuleContext(FimdelinhaContext.class,0);
		}
		public MfuncContext mfunc() {
			return getRuleContext(MfuncContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				numerolinha();
				setState(31);
				codfunc();
				setState(32);
				coordx();
				setState(33);
				coordy();
				setState(34);
				fimdelinha();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				numerolinha();
				setState(37);
				mfunc();
				setState(38);
				fimdelinha();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				fimdelinha();
				}
				break;
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

	public static class NumerolinhaContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(gcode2Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(gcode2Parser.INT, i);
		}
		public NumerolinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerolinha; }
	}

	public final NumerolinhaContext numerolinha() throws RecognitionException {
		NumerolinhaContext _localctx = new NumerolinhaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numerolinha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(INT);
			setState(45);
			match(INT);
			setState(46);
			match(INT);
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

	public static class MfimContext extends ParserRuleContext {
		public MfimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mfim; }
	}

	public final MfimContext mfim() throws RecognitionException {
		MfimContext _localctx = new MfimContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mfim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
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

	public static class MfuncContext extends ParserRuleContext {
		public MfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mfunc; }
	}

	public final MfuncContext mfunc() throws RecognitionException {
		MfuncContext _localctx = new MfuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mfunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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

	public static class CodfuncContext extends ParserRuleContext {
		public CodfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codfunc; }
	}

	public final CodfuncContext codfunc() throws RecognitionException {
		CodfuncContext _localctx = new CodfuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_codfunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
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

	public static class CoordxContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(gcode2Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(gcode2Parser.INT, i);
		}
		public CoordxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordx; }
	}

	public final CoordxContext coordx() throws RecognitionException {
		CoordxContext _localctx = new CoordxContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_coordx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__6);
			setState(55);
			match(INT);
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(56);
				match(INT);
				}
				break;
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(59);
				match(INT);
				}
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

	public static class CoordyContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(gcode2Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(gcode2Parser.INT, i);
		}
		public CoordyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coordy; }
	}

	public final CoordyContext coordy() throws RecognitionException {
		CoordyContext _localctx = new CoordyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_coordy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__7);
			setState(63);
			match(INT);
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(64);
				match(INT);
				}
				break;
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(67);
				match(INT);
				}
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

	public static class FimdelinhaContext extends ParserRuleContext {
		public FimdelinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fimdelinha; }
	}

	public final FimdelinhaContext fimdelinha() throws RecognitionException {
		FimdelinhaContext _localctx = new FimdelinhaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fimdelinha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(70);
				match(T__8);
				}
			}

			setState(73);
			match(T__9);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\6\2\30\n\2\r\2\16\2\31\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\5\t<\n\t\3\t\5\t?\n\t\3\n\3\n\3\n\5\nD\n\n\3\n\5\nG\n"+
		"\n\3\13\5\13J\n\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\3"+
		"\2\5\6\3\2\7\b\2K\2\27\3\2\2\2\4\35\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n\62"+
		"\3\2\2\2\f\64\3\2\2\2\16\66\3\2\2\2\208\3\2\2\2\22@\3\2\2\2\24I\3\2\2"+
		"\2\26\30\5\6\4\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2"+
		"\2\32\33\3\2\2\2\33\34\5\4\3\2\34\3\3\2\2\2\35\36\5\b\5\2\36\37\5\n\6"+
		"\2\37\5\3\2\2\2 !\5\b\5\2!\"\5\16\b\2\"#\5\20\t\2#$\5\22\n\2$%\5\24\13"+
		"\2%,\3\2\2\2&\'\5\b\5\2\'(\5\f\7\2()\5\24\13\2),\3\2\2\2*,\5\24\13\2+"+
		" \3\2\2\2+&\3\2\2\2+*\3\2\2\2,\7\3\2\2\2-.\7\3\2\2./\7\r\2\2/\60\7\r\2"+
		"\2\60\61\7\r\2\2\61\t\3\2\2\2\62\63\7\4\2\2\63\13\3\2\2\2\64\65\t\2\2"+
		"\2\65\r\3\2\2\2\66\67\t\3\2\2\67\17\3\2\2\289\7\t\2\29;\7\r\2\2:<\7\r"+
		"\2\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\7\r\2\2>=\3\2\2\2>?\3\2\2\2?\21\3"+
		"\2\2\2@A\7\n\2\2AC\7\r\2\2BD\7\r\2\2CB\3\2\2\2CD\3\2\2\2DF\3\2\2\2EG\7"+
		"\r\2\2FE\3\2\2\2FG\3\2\2\2G\23\3\2\2\2HJ\7\13\2\2IH\3\2\2\2IJ\3\2\2\2"+
		"JK\3\2\2\2KL\7\f\2\2L\25\3\2\2\2\t\31+;>CFI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}