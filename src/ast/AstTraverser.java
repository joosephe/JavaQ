package ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import ast.ElseIfStatement;
import ast.Function;
import ast.IfStatement;
import ast.Parameter;
import ast.Parameters;
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
import gram.gramParser.StatementContext;
import gram.gramParser.StatementsContext;
import gram.gramParser.StringRContext;
import gram.gramParser.TypeContext;
import gram.gramParser.UnaryNegationContext;
import gram.gramParser.ValueContext;

public class AstTraverser {
	
	
	
	
	
	
	
	
	//private static void generateCode(AstNode node,MethodVisitor mv) {
	private static void generateCode(AstNode node) {
        if (node instanceof ElseIfStatement) {
        	//TODO: 
           
        }
        else if (node instanceof Function) {
        	//TODO: 

        }
        else if (node instanceof IfStatement) {
        	//TODO: 

        }
        else if (node instanceof Parameter) {
        	//TODO: 

        }
        else if (node instanceof Parameters) {
        	//TODO: 
        }
        else if (node instanceof Type) {
        	//TODO: 

        }
        else if (node instanceof VariableDeclaration) {
        	//TODO: 

        }
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
