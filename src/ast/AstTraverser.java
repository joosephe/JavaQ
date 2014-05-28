package ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;

import Internals.Complex;
import Internals.Measurement;
import Internals.QuantumState;
import Internals.Qubit;
import Internals.Transformation;
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
import ee.ut.cs.akt.aktk.ast.StringLiteral;
import ee.ut.cs.akt.aktk.ast.Statement;
import ee.ut.cs.akt.aktk.ast.Variable;
import ee.ut.cs.akt.aktk.ast.WhileStatement;
import gram.gramParsingUtils;

public class AstTraverser {
	
	private Map<String, String> variables= new HashMap<>();
	private Map<String, Statement> functions = new HashMap<>();
	private Map<String, Boolean> bools = new HashMap<String, Boolean>();
	private Map<String, Integer> ints = new HashMap<String, Integer>();
	private Map<String, Float> floats = new HashMap<String, Float>();
	private Map<String, Complex> complexes = new HashMap<String, Complex>();
	private Map<String, Qubit> qubits = new HashMap<String, Qubit>();
	private Map<String, Transformation> transformations = new HashMap<String, Transformation>();
	private Map<String, Measurement> measurements = new HashMap<String, Measurement>();
	private QuantumState state;
	
	
	
	//private static void generateCode(AstNode node,MethodVisitor mv) {
	private void generateCode(AstNode node) {
        if (node instanceof ElseIfStatement) {
        	//TODO: 
        	//kuidas ma saan expressionist kätte tema tõeväärtuse?
        	Expression cond = ((ElseIfStatement) node).getCondition();
        	
        }
        else if (node instanceof Program){
            List<Statement> functs = ((Program) node).getFunctions();
            for(Statement function : functs){
                functions.put(((Function) function).getName(),function);
            }
            generateCode(functions.get("main"));
        }
        else if (node instanceof Function) {
        	generateCode(((Function) node).getStatements());

        }
        else if (node instanceof Block){
        	List<Object> list = node.getChildren();
        	for(Object item : list){
        		((ElseIfStatement) item).getCondition();
        	}
        	
        }
        else if (node instanceof IfStatement) {
        	//TODO: 
        	//kuidas ma saan expressionist kätte tema tõeväärtuse?
        	Expression cond = ((ElseIfStatement) node).getCondition();
        	

        }
        else if ( node instanceof WhileStatement){
        	
        }
        else if (node instanceof Expression) {
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
        	//kas  ma saan nii kätte tüübi nime?
        	Expression param =  ( (VariableDeclaration) node).getParameter();
        	Expression type = ((Parameter) param).getType();
        	String name = ((Type) param).getName();
        	Expression init =  ( (VariableDeclaration) node).getInitializer();
        	switch (name){
        	case "int": 
        		// is name in ints?
        		if(ints.containsKey(name)){
        			//TODO: throw exception
        		}
        		else{
        			//TODO: initialize.
        			
        		}
        		//
        		
        		
        	case "float":
        	
        	
        	case "boolean":
        		
        	case "complex":
        		
        	
        	
        	
        	
        	}

        }
        else if ( node instanceof Assignment){
        	
        }
        else if ( node instanceof FunctionCall){
        	
        }
        else if ( node instanceof Variable){
        	
        }
        else if ( node instanceof ExpressionStatement){
        	
        }
        
        
    }
	
	public AstTraverser(AstNode tree, List<Expression> parameters, List<Object> value){
		for(int i = 0; i<parameters.size();i++){ 
			switch(((Type) ((Parameter) parameters.get(i)).getType()).getName()){
			//TODO: cases
			}
			generateCode(tree);
		}
	}
	public static void main(String[] args) {
		AstNode tree = gramParsingUtils.createAst("circuit bool tere(int a) { int a = 9;tere();a=3;}circuit int tere(){int x = 0;}");
		System.out.println(tree.toString());
		AstTraverser interpretator = new AstTraverser(tree, null, null);
	}

}
