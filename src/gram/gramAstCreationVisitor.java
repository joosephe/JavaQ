package gram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import ast.ElseIfStatement;
import ast.Function;
import ast.IfStatement;
import ast.Parameter;
import ast.Parameters;
import ast.Program;
import ast.Type;
import ast.VariableDeclaration;
import ee.ut.cs.akt.aktk.ast.Assignment;
import ee.ut.cs.akt.aktk.ast.AstNode;
import ee.ut.cs.akt.aktk.ast.Block;
import ee.ut.cs.akt.aktk.ast.Expression;
import ee.ut.cs.akt.aktk.ast.ExpressionStatement;
import ee.ut.cs.akt.aktk.ast.FloatingPointLiteral;
import ee.ut.cs.akt.aktk.ast.FunctionCall;
import ee.ut.cs.akt.aktk.ast.IntegerLiteral;
import ee.ut.cs.akt.aktk.ast.Statement;
import ee.ut.cs.akt.aktk.ast.Variable;
import ee.ut.cs.akt.aktk.ast.WhileStatement;
import gram.gramParser.AddingSubstractionContext;
import gram.gramParser.BraketExpressionContext;
import gram.gramParser.ComparisonContext;
import gram.gramParser.ConditionalsContext;
import gram.gramParser.DeclarationContext;
import gram.gramParser.FunctionCallContext;
import gram.gramParser.FunctionContext;
import gram.gramParser.InitParametersContext;
import gram.gramParser.LoopContext;
import gram.gramParser.MultipleComparisonsContext;
import gram.gramParser.MultiplicationDivisionContext;
import gram.gramParser.NameRContext;
import gram.gramParser.NumberRContext;
import gram.gramParser.ParameterContext;
import gram.gramParser.ProgramContext;
import gram.gramParser.StatementContext;
import gram.gramParser.StatementsContext;
import gram.gramParser.StringRContext;
import gram.gramParser.TypeContext;
import gram.gramParser.UnaryNegationContext;
import gram.gramParser.ValueContext;

public class gramAstCreationVisitor extends gramBaseVisitor<AstNode> {

	@Override
	public AstNode visitConditionals(ConditionalsContext ctx) {
		int children= ctx.getChildCount();
		Expression condition = (Expression) this.visit(ctx.getChild(2));
		Statement ifStatement = (Statement) this.visit(ctx.getChild(5));
		List<Statement> elseIfs = null;
		Statement elseStatement = null;
		children -= 7;
		int elseCount = ( (children - 4) != 0 ) ? (children-4)/7 : 0 ;
		if(elseCount!=0){
			elseIfs = new ArrayList<>();
			for ( int i = 0 ; i<elseCount ; i++){
				elseIfs.add(new ElseIfStatement((Expression)this.visit(ctx.getChild(6+i*7+3)),(Statement)this.visit(ctx.getChild(6+i*7+6))));
				children -= 7;
			}
		}
		if(children != 0 )
			elseStatement = (Statement) this.visit(ctx.getChild(ctx.getChildCount()-2));
		return new IfStatement(condition, ifStatement, elseIfs, elseStatement);
	}

	@Override
	public AstNode visitNameR(NameRContext ctx) {
		return new Variable(ctx.getText());
	}

	@Override
	public AstNode visitAddingSubstraction(AddingSubstractionContext ctx) {
		return visitBinaryOperation(ctx);
	}
	
	@Override
	public AstNode visitComparison(ComparisonContext ctx) {
		return visitBinaryOperation(ctx);
	}

	@Override
	public AstNode visitStringR(StringRContext ctx) {
		return new Variable (ctx.getText());
	}

	@Override
	public AstNode visitStatements(StatementsContext ctx) {
		List<Statement> statements = new ArrayList<>();
		for(int i = 0; i < ctx.getChildCount() ; i+=2){
			Statement statement = (Statement) this.visit(ctx.getChild(i));
			statements.add(statement);
		}
		return new Block(statements);
	}

	@Override
	public AstNode visitValue(ValueContext ctx) {
		String name = ctx.getChild(0).getText();
		Expression expression = (Expression) this.visit(ctx.getChild(2));
		return new Assignment(name, expression);
	}

	@Override
	public AstNode visitNumberR(NumberRContext ctx) {
		if (ctx.getText().contains(".")) {
			return new FloatingPointLiteral(Double.parseDouble(ctx.getText()));
		}
		else {
			return new IntegerLiteral(Integer.parseInt(ctx.getText()));
		}
	}

	@Override
	public AstNode visitUnaryNegation(UnaryNegationContext ctx) {
		Expression arg = (Expression) this.visit(ctx.getChild(1));
		return new FunctionCall("-", Arrays.asList(arg));
	}

	@Override
	public AstNode visitDeclaration(DeclarationContext ctx) {
		Expression params = (Expression) this.visit(ctx.getChild(0));
		Expression declarationExpression = null;
		if (ctx.getChildCount() == 3) {
			declarationExpression = (Expression) this.visit(ctx.getChild(2));
		}
		return new VariableDeclaration(params, declarationExpression);
	}

	@Override
	public AstNode visitFunctionCall(FunctionCallContext ctx) {
		String name = ctx.getChild(0).getText();
		List<Expression> params = new ArrayList<>();
		if(ctx.getChildCount()>3){
			for(int i = 2; i<ctx.getChildCount(); i+=2){
				params.add((Expression)this.visit(ctx.getChild(i)));
			}
		}
		return new FunctionCall(name, params);
	}

	@Override
	public AstNode visitMultiplicationDivision(MultiplicationDivisionContext ctx) {
		return visitBinaryOperation(ctx);
	}

	@Override
	public AstNode visitMultipleComparisons(MultipleComparisonsContext ctx) {
		return visitBinaryOperation(ctx);
	}

	@Override
	public AstNode visitLoop(LoopContext ctx) {
		Expression condition = (Expression) this.visit(ctx.getChild(2));
		Statement statements = (Statement) this.visit(ctx.getChild(5));
		return new WhileStatement(condition, statements);
	}

	@Override
	public AstNode visitBraketExpression(BraketExpressionContext ctx) {
		return this.visit(ctx.getChild(1));
	}

	@Override
	public AstNode visitFunction(FunctionContext ctx) {
		System.out.println("I am at function");
		String type = ctx.getChild(1).getChild(0).getText();
		String name = ctx.getChild(2).getText();
		Expression params = null;
		Statement statements;
		if(ctx.getChildCount()>8){
			params = (Expression) this.visit(ctx.getChild(4));
			statements = (Statement) this.visit(ctx.getChild(7));
		}
		else
			statements = (Statement) this.visit(ctx.getChild(6));
		return new Function(type, name, params, statements);
	}

	@Override
	public AstNode visitInitParameters(InitParametersContext ctx) {
		List<Expression> params = new ArrayList<>();
		for(int i = 0 ; i<ctx.getChildCount() ; i+=2){
			params.add((Expression)this.visit(ctx.getChild(i)));
		}
		return new Parameters(params);
	}
	
	private AstNode visitBinaryOperation(ParseTree ctx){
		String operator = ctx.getChild(1).getText();
		Expression left = (Expression)this.visit(ctx.getChild(0));
		Expression right = (Expression)this.visit(ctx.getChild(2));
		return new FunctionCall(operator , Arrays.asList(left, right));
	}

	@Override
	public AstNode visitStatement(StatementContext ctx) {
		AstNode child = this.visit(ctx.getChild(0)); 
		if (child instanceof Expression) {
			return new ExpressionStatement((Expression) child);
		} 
		else {
			return child;
		}
	}

	@Override
	public AstNode visitParameter(ParameterContext ctx) {
		Expression type = (Expression) this.visit(ctx.getChild(0));
		String name = ctx.getChild(1).getText();
		return new Parameter(type,name);
	}

	@Override
	public AstNode visitType(TypeContext ctx) {
		String name = ctx.getChild(0).getText();
		return new Type(name);
	}

	@Override
	public AstNode visitProgram(ProgramContext ctx) {
		List<Statement> functions = new ArrayList<>();
		for(int i = 0; i<ctx.getChildCount();i++){
			functions.add((Statement)this.visit(ctx.getChild(i)));
		}
		return new Program(functions);
	}

}
