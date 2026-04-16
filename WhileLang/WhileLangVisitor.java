// Generated from WhileLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WhileLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WhileLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WhileLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(WhileLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationStmt}
	 * labeled alternative in {@link WhileLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStmt(WhileLangParser.DeclarationStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStmt}
	 * labeled alternative in {@link WhileLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(WhileLangParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link WhileLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(WhileLangParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link WhileLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(WhileLangParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link WhileLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(WhileLangParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link WhileLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(WhileLangParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link WhileLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(WhileLangParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(WhileLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link WhileLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(WhileLangParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link WhileLangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(WhileLangParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(WhileLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileLangParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(WhileLangParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileLangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(WhileLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileLangParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(WhileLangParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhileLangParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(WhileLangParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link WhileLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(WhileLangParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link WhileLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpr(WhileLangParser.NumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpr}
	 * labeled alternative in {@link WhileLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(WhileLangParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticExpr}
	 * labeled alternative in {@link WhileLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpr(WhileLangParser.ArithmeticExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link WhileLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(WhileLangParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link WhileLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(WhileLangParser.IdExprContext ctx);
}