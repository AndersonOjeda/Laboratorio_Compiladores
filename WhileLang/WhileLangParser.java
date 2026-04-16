// Generated from WhileLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class WhileLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=1, IF=2, ELSE=3, BREAK=4, CONTINUE=5, INT=6, STRING=7, ASSIGN=8, 
		PLUS=9, MINUS=10, MULT=11, DIV=12, LT=13, GT=14, LE=15, GE=16, EQ=17, 
		NE=18, LPAREN=19, RPAREN=20, LBRACE=21, RBRACE=22, SEMI=23, ID=24, NUMBER=25, 
		STRING_LITERAL=26, WS=27;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_type = 3, 
		RULE_assignment = 4, RULE_whileStatement = 5, RULE_ifStatement = 6, RULE_breakStatement = 7, 
		RULE_continueStatement = 8, RULE_expr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "type", "assignment", "whileStatement", 
			"ifStatement", "breakStatement", "continueStatement", "expr"
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

	@Override
	public String getGrammarFileName() { return "WhileLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WhileLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(WhileLangParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				statement();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 18874614L) != 0) );
			setState(25);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStmtContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(WhileLangParser.SEMI, 0); }
		public DeclarationStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitDeclarationStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtContext extends StatementContext {
		public TerminalNode LBRACE() { return getToken(WhileLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(WhileLangParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends StatementContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends StatementContext {
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ContinueStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStmtContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(WhileLangParser.SEMI, 0); }
		public AssignmentStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
				_localctx = new DeclarationStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				declaration();
				setState(28);
				match(SEMI);
				}
				break;
			case ID:
				_localctx = new AssignmentStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				assignment();
				setState(31);
				match(SEMI);
				}
				break;
			case WHILE:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				whileStatement();
				}
				break;
			case IF:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				ifStatement();
				}
				break;
			case BREAK:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
				breakStatement();
				}
				break;
			case CONTINUE:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(36);
				continueStatement();
				}
				break;
			case LBRACE:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(37);
				match(LBRACE);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18874614L) != 0)) {
					{
					{
					setState(38);
					statement();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(WhileLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(WhileLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			type();
			setState(48);
			match(ID);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(49);
				match(ASSIGN);
				setState(50);
				expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INT() { return getToken(WhileLangParser.INT, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringTypeContext extends TypeContext {
		public TerminalNode STRING() { return getToken(WhileLangParser.STRING, 0); }
		public StringTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(INT);
				}
				break;
			case STRING:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(WhileLangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(WhileLangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(ID);
			setState(58);
			match(ASSIGN);
			setState(59);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(WhileLangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(WhileLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WhileLangParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(WhileLangParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(WhileLangParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(WHILE);
			setState(62);
			match(LPAREN);
			setState(63);
			expr(0);
			setState(64);
			match(RPAREN);
			setState(65);
			match(LBRACE);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18874614L) != 0)) {
				{
				{
				setState(66);
				statement();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(WhileLangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(WhileLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WhileLangParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(WhileLangParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(WhileLangParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(WhileLangParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(WhileLangParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(WhileLangParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IF);
			setState(75);
			match(LPAREN);
			setState(76);
			expr(0);
			setState(77);
			match(RPAREN);
			setState(78);
			match(LBRACE);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18874614L) != 0)) {
				{
				{
				setState(79);
				statement();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(RBRACE);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(86);
				match(ELSE);
				setState(87);
				match(LBRACE);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18874614L) != 0)) {
					{
					{
					setState(88);
					statement();
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(WhileLangParser.BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(BREAK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(WhileLangParser.CONTINUE, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(CONTINUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING_LITERAL() { return getToken(WhileLangParser.STRING_LITERAL, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExprContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(WhileLangParser.NUMBER, 0); }
		public NumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(WhileLangParser.LT, 0); }
		public TerminalNode GT() { return getToken(WhileLangParser.GT, 0); }
		public TerminalNode GE() { return getToken(WhileLangParser.GE, 0); }
		public TerminalNode LE() { return getToken(WhileLangParser.LE, 0); }
		public TerminalNode EQ() { return getToken(WhileLangParser.EQ, 0); }
		public TerminalNode NE() { return getToken(WhileLangParser.NE, 0); }
		public ComparisonExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(WhileLangParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(WhileLangParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(WhileLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(WhileLangParser.MINUS, 0); }
		public ArithmeticExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitArithmeticExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(WhileLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WhileLangParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(WhileLangParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WhileLangVisitor ) return ((WhileLangVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(102);
				match(ID);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(NUMBER);
				}
				break;
			case STRING_LITERAL:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(STRING_LITERAL);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(LPAREN);
				setState(106);
				expr(0);
				setState(107);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(112);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(115);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(118);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 516096L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(119);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001b~\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000\u000b"+
		"\u0000\f\u0000\u0017\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001(\b\u0001\n\u0001"+
		"\f\u0001+\t\u0001\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00024\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u00038\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005D\b\u0005\n\u0005\f\u0005G\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006Q\b\u0006\n\u0006\f\u0006T\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006Z\b\u0006\n\u0006\f\u0006]\t\u0006"+
		"\u0001\u0006\u0003\u0006`\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tn\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\ty\b\t\n\t\f\t|\t\t\u0001\t\u0000\u0001\u0012\n\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0003\u0001\u0000\u000b"+
		"\f\u0001\u0000\t\n\u0001\u0000\r\u0012\u0087\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0002-\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u0006"+
		"7\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000\n=\u0001\u0000\u0000"+
		"\u0000\fJ\u0001\u0000\u0000\u0000\u000ea\u0001\u0000\u0000\u0000\u0010"+
		"c\u0001\u0000\u0000\u0000\u0012m\u0001\u0000\u0000\u0000\u0014\u0016\u0003"+
		"\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"\u0000\u0000\u0001\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001c\u0003"+
		"\u0004\u0002\u0000\u001c\u001d\u0005\u0017\u0000\u0000\u001d.\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f \u0005\u0017\u0000"+
		"\u0000 .\u0001\u0000\u0000\u0000!.\u0003\n\u0005\u0000\".\u0003\f\u0006"+
		"\u0000#.\u0003\u000e\u0007\u0000$.\u0003\u0010\b\u0000%)\u0005\u0015\u0000"+
		"\u0000&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,.\u0005\u0016\u0000\u0000"+
		"-\u001b\u0001\u0000\u0000\u0000-\u001e\u0001\u0000\u0000\u0000-!\u0001"+
		"\u0000\u0000\u0000-\"\u0001\u0000\u0000\u0000-#\u0001\u0000\u0000\u0000"+
		"-$\u0001\u0000\u0000\u0000-%\u0001\u0000\u0000\u0000.\u0003\u0001\u0000"+
		"\u0000\u0000/0\u0003\u0006\u0003\u000003\u0005\u0018\u0000\u000012\u0005"+
		"\b\u0000\u000024\u0003\u0012\t\u000031\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u00004\u0005\u0001\u0000\u0000\u000058\u0005\u0006\u0000"+
		"\u000068\u0005\u0007\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000"+
		"\u0000\u00008\u0007\u0001\u0000\u0000\u00009:\u0005\u0018\u0000\u0000"+
		":;\u0005\b\u0000\u0000;<\u0003\u0012\t\u0000<\t\u0001\u0000\u0000\u0000"+
		"=>\u0005\u0001\u0000\u0000>?\u0005\u0013\u0000\u0000?@\u0003\u0012\t\u0000"+
		"@A\u0005\u0014\u0000\u0000AE\u0005\u0015\u0000\u0000BD\u0003\u0002\u0001"+
		"\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000HI\u0005\u0016\u0000\u0000I\u000b\u0001\u0000\u0000"+
		"\u0000JK\u0005\u0002\u0000\u0000KL\u0005\u0013\u0000\u0000LM\u0003\u0012"+
		"\t\u0000MN\u0005\u0014\u0000\u0000NR\u0005\u0015\u0000\u0000OQ\u0003\u0002"+
		"\u0001\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000U_\u0005\u0016\u0000\u0000VW\u0005\u0003\u0000"+
		"\u0000W[\u0005\u0015\u0000\u0000XZ\u0003\u0002\u0001\u0000YX\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^`\u0005\u0016\u0000\u0000_V\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`\r\u0001\u0000\u0000\u0000ab\u0005\u0004\u0000\u0000b\u000f\u0001"+
		"\u0000\u0000\u0000cd\u0005\u0005\u0000\u0000d\u0011\u0001\u0000\u0000"+
		"\u0000ef\u0006\t\uffff\uffff\u0000fn\u0005\u0018\u0000\u0000gn\u0005\u0019"+
		"\u0000\u0000hn\u0005\u001a\u0000\u0000ij\u0005\u0013\u0000\u0000jk\u0003"+
		"\u0012\t\u0000kl\u0005\u0014\u0000\u0000ln\u0001\u0000\u0000\u0000me\u0001"+
		"\u0000\u0000\u0000mg\u0001\u0000\u0000\u0000mh\u0001\u0000\u0000\u0000"+
		"mi\u0001\u0000\u0000\u0000nz\u0001\u0000\u0000\u0000op\n\u0004\u0000\u0000"+
		"pq\u0007\u0000\u0000\u0000qy\u0003\u0012\t\u0005rs\n\u0003\u0000\u0000"+
		"st\u0007\u0001\u0000\u0000ty\u0003\u0012\t\u0004uv\n\u0002\u0000\u0000"+
		"vw\u0007\u0002\u0000\u0000wy\u0003\u0012\t\u0003xo\u0001\u0000\u0000\u0000"+
		"xr\u0001\u0000\u0000\u0000xu\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0013\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000\f\u0017)-37ER[_mxz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}