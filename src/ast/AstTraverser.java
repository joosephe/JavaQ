package ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.experimental.theories.ParametersSuppliedBy;

import Internals.BuiltIn;
import Internals.Complex;
import Internals.ComplexMatrix;
import Internals.Ensemble;
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
	
	private Map<String, String> variables= new HashMap<>(); //Usage: type name
	private static Map<String, Statement> functions = new HashMap<>();
	private static Map<String, BuiltIn> builtIns = new HashMap<>();
	private Map<String, Boolean> bools = new HashMap<String, Boolean>();
	private Map<String, Integer> ints = new HashMap<String, Integer>();
	private Map<String, Float> floats = new HashMap<String, Float>();
	private Map<String, String> strings = new HashMap<String, String>();
	private Map<String, Character> chars = new HashMap<String, Character>();
	private Map<String, Complex> complexes = new HashMap<String, Complex>();
	private Map<String, Qubit> qubits = new HashMap<String, Qubit>();
	private Map<String, Transformation> transformations = new HashMap<String, Transformation>();
	private Map<String, Measurement> measurements = new HashMap<String, Measurement>();
	private Map<String, Ensemble> ensembles = new HashMap<String, Ensemble>();
	//not sure whether usable?
	private Map<String, ComplexMatrix> cmatrices = new HashMap<String, ComplexMatrix>();

	//private Map<String, Qubit> qubits = new HashMap<String, Qubit>();

	private QuantumState state;
	private Object returnObject;

	
	public AstTraverser(AstNode tree, List<Expression> parameters, List<Object> value) throws Exception{
		if(parameters != null) {
			for(int i = 0; i<parameters.size();i++){ 
				Type type = (Type) ((Parameter) parameters.get(i)).getType();
				String name = ((Parameter) parameters.get(i)).getVariable();
				addToMemory(type, name, value.get(i));
			}
		}
		generateCode(tree);	
	}


	public static void main(String[] args) {
		AstNode tree = gramParsingUtils.createAst("circuit bool tere(int a) { a = 9;((tere()));a=3;}circuit int tere(){int x = 0;}");
		System.out.println(tree.toString());
		//AstTraverser interpretator = new AstTraverser(tree, null, null);
	}
	
	private Object getReturn(){
		return returnObject;
	}
	
	//private static void generateCode(AstNode node,MethodVisitor mv) {
	private void generateCode(AstNode node) throws Exception {
        if (node instanceof Program){
            List<Statement> functions = ((Program) node).getFunctions();
            for(Statement function : functions){
                AstTraverser.functions.put(((Function) function).getName(),function);
            }
            generateCode(AstTraverser.functions.get("main"));
        }
        else if (node instanceof Function) {
        	generateCode(((Function) node).getStatements());

        }
        else if (node instanceof Block){
        	List<Object> list = node.getChildren();
        	for(Object item : list){
                generateCode((AstNode)item);
        	}
        	
        }
        else if (node instanceof IfStatement) {
            Expression cond = ((IfStatement) node).getCondition();
            if(checkCondition(cond)){
                Statement statements = ((IfStatement) node).getThenBranch();
                generateCode(statements);
            }
            else if(((IfStatement) node).getElseIfs()!=null){
                List<Statement> elseIfs = ((IfStatement) node).getElseIfs();
                for(Statement elseIf :elseIfs){
                    if(checkCondition(((ElseIfStatement) elseIf).getCondition())){
                        Statement statements = ((ElseIfStatement) elseIf).getThenBranch();
                        generateCode(statements);
                    }
                }
            }
            else{
                Statement statements = ((IfStatement) node).getElseBranch();
                generateCode(statements);
            }
        }
        else if ( node instanceof WhileStatement){
            Expression conditions = ((WhileStatement) node).getCondition();
            Statement statements = ((WhileStatement) node).getBody();
            while(checkCondition(conditions)){
                generateCode(statements);
            }
        }
        else if (node instanceof VariableDeclaration) {
        	//kas  ma saan nii kätte tüübi nime?
            Expression param =  ( (VariableDeclaration) node).getParameter();
            String type = ((Type) ((Parameter) param).getType()).getName();
            String name = ((Parameter) param).getVariable();
        	Expression init =  ( (VariableDeclaration) node).getInitializer();
        	declareVariable(type,name,init);
        }
        else if ( node instanceof Assignment){
        	String name = ((Assignment) node).getVariableName();
        	Expression value = ((Assignment) node).getExpression();
        	declareVariable(null,name,value);
        }
        else if ( node instanceof ExpressionStatement){
        	getValue((Expression)node);
        }
        
        
    }

    private void declareVariable(String t, String name, Expression init) throws Exception{
    	String type=t;
    		if(type==null){
    			if(variables.containsKey(name)){
    				type=variables.get(name);
    		        switch (type){
    		        case "int":
    		                if(checkType(init)=="int"){
    		                	variables.put(name, type);
    		                    ints.put(name, (Integer)getValue(init));
    		                }
    		                else{
    		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
    		                }
    		            break;
    		        case "float":
    		                if(checkType(init)=="float"){
    		                    floats.put(name, (Float)getValue(init));
    		                }
    		                else{
    		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
    		                }
    		            break;
    		        case "bool": {
    		                if(checkType(init)=="bool"){
    		                	variables.put(name, type);
    		                    bools.put(name, (Boolean)getValue(init));
    		                }
    		                else{
    		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
    		                }
    		        	break;
    				}
    				case "complex": {
    		                if(checkType(init)=="complex"){
    		                	variables.put(name, type);
    		                    complexes.put(name, (Complex)getValue(init));
    		                }
    		                else{
    		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
    		                }
    					break;
    				}
    				case "qubit": {
    		                if(checkType(init)=="qubit"){
    		                	variables.put(name, type);
    		                    qubits.put(name, (Qubit)getValue(init));
    		                }
    		                else{
    		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
    		                }
    					break;
    				}
    				case "transformation": {
    		                if(checkType(init)=="transformation"){
    		                	variables.put(name, type);
    		                    transformations.put(name, (Transformation)getValue(init));
    		                }
    		                else{
    		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
    		                }
    					break;
    				}
    				case "string": {
    		                if(checkType(init)=="string"){
    		                	variables.put(name, type);
    		                    strings.put(name, (String)getValue(init));
    		                }
    		                else{
    		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
    		                }
    					break;
    				}
    				case "char": {
    		                if(checkType(init)=="char"){
    		                	variables.put(name, type);
    		                    chars.put(name, (Character)getValue(init));
    		                }
    		                else{
    		                    throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
    		                }
    					break;
    				}
    				case "measurement": {
    		                if(checkType(init)=="measurement"){
    		                	variables.put(name, type);
    		                    measurements.put(name, (Measurement)getValue(init));
    		                }
    		                else{
    		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
    		                }
    					break;
    				}
    				/*case "state": { // XXX - Is this needed?
    					state = (State) value;
    					break;
    				}*/
    				case "ensemble": {
    		                if(checkType(init)=="ensemble"){
    		                	variables.put(name, type);
    		                    ensembles.put(name, (Ensemble)getValue(init));
    		                }
    		                else{
    		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
    		                }
    					break;
    				}
    		        }
    			}
    			else{
    				throw new Exception("Variable "+name+" undefined!");
    			}
    		}
    		else{
		        switch (type){
		        case "int":
		            if(variables.containsKey(name)){
		            	throw new Exception("Variable "+name+" already declared!");
		            }
		            else{
		                if(checkType(init)=="int"){
		                	variables.put(name, type);
		                    ints.put(name, (Integer)getValue(init));
		                }
		                else{
		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
		                }
		            }
		            break;
		        case "float":
		            if(variables.containsKey("float")){
		            	throw new Exception("Variable "+name+" already declared!");
		            }
		            else{
		                if(checkType(init)=="float"){
		                    floats.put(name, (Float)getValue(init));
		                }
		                else{
		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
		                }
		            }
		            break;
		        case "bool": {
		        	if(variables.containsKey(name)){
		        		throw new Exception("Variable "+name+" already declared!");
		            }
		            else{
		                if(checkType(init)=="bool"){
		                	variables.put(name, type);
		                    bools.put(name, (Boolean)getValue(init));
		                }
		                else{
		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
		                }
		            }
		        	break;
				}
				case "complex": {
					if(variables.containsKey(name)){
						throw new Exception("Variable "+name+" already declared!");
		            }
		            else{
		                if(checkType(init)=="complex"){
		                	variables.put(name, type);
		                    complexes.put(name, (Complex)getValue(init));
		                }
		                else{
		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
		                }
		            }
					break;
				}
				case "qubit": {
					if(variables.containsKey(name)){
						throw new Exception("Variable "+name+" already declared!");
		            }
		            else{
		                if(checkType(init)=="qubit"){
		                	variables.put(name, type);
		                    qubits.put(name, (Qubit)getValue(init));
		                }
		                else{
		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
		                }
		            }
					break;
				}
				case "transformation": {
					if(variables.containsKey(name)){
						throw new Exception("Variable "+name+" already declared!");
		            }
		            else{
		                if(checkType(init)=="transformation"){
		                	variables.put(name, type);
		                    transformations.put(name, (Transformation)getValue(init));
		                }
		                else{
		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
		                }
		            }
					break;
				}
				case "string": {
					if(variables.containsKey(name)){
						throw new Exception("Variable "+name+" already declared!");
		            }
		            else{
		                if(checkType(init)=="string"){
		                	variables.put(name, type);
		                    strings.put(name, (String)getValue(init));
		                }
		                else{
		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
		                }
		            }
					break;
				}
				case "char": {
					if(variables.containsKey(name)){
		                throw new Exception("Variable "+name+" already declared!");
		            }
		            else{
		                if(checkType(init)=="char"){
		                	variables.put(name, type);
		                    chars.put(name, (Character)getValue(init));
		                }
		                else{
		                    throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
		                }
		            }
					break;
				}
				case "measurement": {
					if(variables.containsKey(name)){
						throw new Exception("Variable "+name+" already declared!");
		            }
		            else{
		                if(checkType(init)=="measurement"){
		                	variables.put(name, type);
		                    measurements.put(name, (Measurement)getValue(init));
		                }
		                else{
		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
		                }
		            }
					break;
				}
				/*case "state": { // XXX - Is this needed?
					state = (State) value;
					break;
				}*/
				case "ensemble": {
					if(variables.containsKey(name)){
						throw new Exception("Variable "+name+" already declared!");
		            }
		            else{
		                if(checkType(init)=="ensemble"){
		                	variables.put(name, type);
		                    ensembles.put(name, (Ensemble)getValue(init));
		                }
		                else{
		                	throw new Exception("Variable "+name+" type "+type+" doesn't match assigned type!");
		                }
		            }
					break;
				}
				default: {
					throw new Exception("Invalid type:" + type +"!");
				}
		        }
    		}
    }
    
    private String checkType(Expression expression) throws Exception{
    	if(expression instanceof FunctionCall){
    		String name = ((FunctionCall) expression).getFunctionName();
    		if(name.equals("&") || name.equals("|") ){
    			String left = checkType(((FunctionCall) expression).getArguments().get(0));
    			String right = checkType(((FunctionCall) expression).getArguments().get(1));
    			if(left.equals("bool") && right.equals("bool")){
    				return "bool";
    			}
    			else{
    				throw new Exception("Cannot compare something without truth value!");
    			}
    		}
    		else if( name.equals("+") || name.equals("*")  || name.equals("/")){
    			String left = checkType(((FunctionCall) expression).getArguments().get(0));
    			String right = checkType(((FunctionCall) expression).getArguments().get(1));
    			if((left.equals("string")||left.equals("char")) && (right.equals("string") || right.equals("char")))
    				return "string";
    			if(left.equals(right) && !left.equals("bool")){
    				return name;
    			}
    			else{
    				throw new Exception("Cannot "+left+" "+name+" "+right);
    			}
    		}
    		else if (name.equals("-") ){
    			if(((FunctionCall) expression).getArguments().size()==1){
    				String type = checkType(((FunctionCall) expression).getArguments().get(0));
    				if(type.equals("int") || type.equals("float")){
    					return type;
    				}
    				else{
    					throw new Exception("Cannot implicate "+name+" to type " + type+ "!");
    				}
    			}
    			else{
    				String left = checkType(((FunctionCall) expression).getArguments().get(0));
        			String right = checkType(((FunctionCall) expression).getArguments().get(1));
        			if(left.equals(right) && !left.equals("bool")){
        				return name;
        			}
        			else{
        				throw new Exception("Cannot "+left+" "+name+" "+right);
        			}
    			}
    		}
    		else{
    			if(AstTraverser.functions.containsKey(name)){
    				return ((Type) ((Function) AstTraverser.functions.get(name)).getType()).getName();
    			}
    			else if(AstTraverser.builtIns.containsKey(name)){
    				return AstTraverser.builtIns.get(name).getType();
    			}
    			else{
    				throw new Exception("No function "+name+"(..).");
    			}
    		}
    	}
    	else if (expression instanceof BooleanLiteral){
    		return "bool";
    	}
    	else if (expression instanceof FloatingPointLiteral){
    		return "float";
    	}
    	else if (expression instanceof IntegerLiteral){
    		return "int";
    	}
    	else if (expression instanceof StringLiteral){
    		if(((StringLiteral) expression).getValue().length()==1)
    			return "char";
    		else
    			return "string";
    	}
    	else if ( expression instanceof Variable){
    		String name=((Variable) expression).getName();
    		if(variables.containsKey(name)){
    			return variables.get(name);
    		}
    		else{
    			throw new Exception("No variable "+name+" declared yet!");
    		}
    	}
    	else{
    		throw new Exception("Something went wrong at checking types!");
    	}
    }
    
    private Object getValue(Expression expression) throws Exception{
    	if(expression instanceof FunctionCall){
    		String name = ((FunctionCall) expression).getFunctionName();
    		switch(name){
    		case "&":{
    			boolean left = (boolean) getValue(((FunctionCall) expression).getArguments().get(0));
    			boolean right = (boolean) getValue(((FunctionCall) expression).getArguments().get(1));
    			return left && right;
    		}
    		case "|":{
    			boolean left = (boolean) getValue(((FunctionCall) expression).getArguments().get(0));
    			boolean right = (boolean) getValue(((FunctionCall) expression).getArguments().get(1));
    			return left || right;
    		}
    		case "+":{
    			Object left = getValue(((FunctionCall) expression).getArguments().get(0));
    			Object right = getValue(((FunctionCall) expression).getArguments().get(1));
    			if(left instanceof Integer){
    				return (Integer)left + (Integer)right;
    			}
    			else if(left instanceof Float){
    				return (Float)left + (Float)right;
    			}
    			else if(left instanceof Complex){
    				return Complex.Add((Complex)left,(Complex)right);
    			}
    			else if(left instanceof Character || left instanceof String){
    				return (String)left + (String)right;
    			}
    			else
    				throw new Exception("Cannot add "+left.getClass()+" and "+right.getClass());
    		}
    		case "*":{
    			Object left = getValue(((FunctionCall) expression).getArguments().get(0));
    			Object right = getValue(((FunctionCall) expression).getArguments().get(1));
    			if(left instanceof Integer){
    				return (Integer)left * (Integer)right;
    			}
    			else if(left instanceof Float){
    				return (Float)left * (Float)right;
    			}
    			else if(left instanceof Complex){
    				return Complex.Multiply((Complex)left,(Complex)right);
    			}
    			else
    				throw new Exception("Cannot multiply "+left.getClass()+" and "+right.getClass());
    		}
    		case "/":{
    			Object left = getValue(((FunctionCall) expression).getArguments().get(0));
    			Object right = getValue(((FunctionCall) expression).getArguments().get(1));
    			if(left instanceof Integer){
    				return (Integer)left / (Integer)right;
    			}
    			else if(left instanceof Float){
    				return (Float)left / (Float)right;
    			}
    			else
    				throw new Exception("Cannot divide "+left.getClass()+" and "+right.getClass());
    		}
    		case "-":{
    			if(((FunctionCall) expression).getArguments().size()==1){
    				Object object = getValue(((FunctionCall) expression).getArguments().get(0));
    				if(object instanceof Integer){
    					return -(Integer)object;
    				}
    				else if(object instanceof Float){
    					return -(Float)object;
    				}
    				else if(object instanceof Complex){
    					return Complex.Subtract(new Complex(0,0), (Complex)object);
    				}
    				else throw new Exception("Type " +object.getClass() +" cannot be negative!");
    			}
    			else{
    				Object left = getValue(((FunctionCall) expression).getArguments().get(0));
        			Object right = getValue(((FunctionCall) expression).getArguments().get(1));
        			if(left instanceof Integer){
        				return (Integer)left-(Integer)right;
        			}
        			else if(left instanceof Float){
        				return (Float)left-(Float)right;
        			}
        			else if(left instanceof Complex){
        				return Complex.Subtract((Complex)left, (Complex)right);
        			}
        			else throw new Exception("Cannot subtract "+left+" and "+right);
    			}
    		}
    		default:{
    			if(AstTraverser.functions.containsKey(name)){
    				return goToFunction(name, expression);
    			}
    			else if(AstTraverser.builtIns.containsKey(name)){
    				List<Object> params = new ArrayList<>();
    				List<Expression> args = ((FunctionCall) expression).getArguments();
    				for(Expression arg: args){
    					params.add(getValue(arg));
    				}
    				return doBuiltIn(AstTraverser.builtIns.get(name), params);
    			}
    			else throw new Exception("No function named "+name+"!");
    		}
    		}
    	}
    	else if (expression instanceof BooleanLiteral){
    		return ((BooleanLiteral) expression).getValue();
    	}
    	else if (expression instanceof FloatingPointLiteral){
    		return ((FloatingPointLiteral) expression).getValue();
    	}
    	else if (expression instanceof IntegerLiteral){
    		return ((IntegerLiteral) expression).getValue();
    	}
    	else if (expression instanceof StringLiteral){
    		return ((StringLiteral) expression).getValue();
    	}
    	else if ( expression instanceof Variable){
    		String name=((Variable) expression).getName();
    		if(variables.containsKey(name)){
    			return getVariableValue(expression);
    		}
    		else{
    			throw new Exception("No variable "+name+" declared yet!");
    		}
    	}
    	else{
    		throw new Exception("Something went wrong at getting values!");
    	}
    }
    
    private Object goToFunction(String name, Expression expression) throws Exception{
    	List<Expression> params= new ArrayList<>();
    	List<Object> values = new ArrayList<>();
    	AstTraverser astTraverser= new AstTraverser(AstTraverser.functions.get(name),params,values);
    	return astTraverser.getReturn();
    }
    private Object getVariableValue(Expression expression) throws Exception{
    	String name = ((Variable) expression).getName();
    	String type = variables.get(name);
    	switch(type) {
		case "int": {
			return ints.get(name);
		}
		case "float": {
			return floats.get(name);
		}
		case "bool": {
			return bools.get(name);
		}
		case "complex": {
			return complexes.get(name);
		}
		case "qubit": {
			return qubits.get(name);
		}
		case "transformation": {
			return transformations.get(name);
		}
		case "string": {
			return strings.get(name);
		}
		case "char": {
			return chars.get(name);
		}
		case "measurement": {
			return measurements.get(name);
		}
		/*case "state": { // XXX - Is this needed?
			state = (State) value;
			break;
		}*/
		case "ensemble": {
			return ensembles.get(name);
		}
		default: {
			throw new Exception("No such type as "+type);
		}
	}
    }
    
    public boolean checkCondition(Expression condition)throws Exception{
    	if(checkType(condition).equals("bool")){
    		return true;
    	}
    	else if(getValue(condition)!=null){
    		return true;
    	}
    	else
    		return false;
    }

	public void addToMemory(Type type, String name, Object value) {
		try {
			switch(type.getName()) {
				case "int": {
					ints.put(name, (Integer) value);
					break;
				}
				case "float": {
					floats.put(name,  (Float) value);
					break;
				}
				case "bool": {
					bools.put(name, (Boolean) value);
					break;
				}
				case "complex": {
					complexes.put(name,  (Complex) value);
					break;
				}
				case "qubit": {
					qubits.put(name,  (Qubit) value);
					break;
				}
				case "transformation": {
					transformations.put(name, (Transformation) value);
					break;
				}
				case "string": {
					strings.put(name, (String) value);
					break;
				}
				case "char": {
					chars.put(name, (Character) value);
					break;
				}
				case "measurement": {
					measurements.put(name, (Measurement) value);
					break;
				}
				/*case "state": { // XXX - Is this needed?
					state = (State) value;
					break;
				}*/
				case "ensemble": {
					ensembles.put(name, (Ensemble) value);
					break;
				}
				default: {
					throw new Exception();
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid variable type!");
		}
	}
	private Object doBuiltIn(BuiltIn builtIn, List<Object> params) throws Exception{
		
		//We need
		//qubit initialization from two complex numbers
		//adding a qubit to state. Done! Untested.
		//applying transformation to state. Done! Untested.
		//applying transformation to qubit.Done! Untested.
		//applying measurement to state. Done! Untested.
		//initializing transformation from a matrix of complex numbers. Done! Untested
		//initializing measurement from a set of matrices of complex numbers. the first element is the number of 
		
		//can live without these, but it won't be pretty
		//making a complex matrix from a bunch of complex numbers?? can user use this? think about this later?
		//qubits zero, one, plus, minus
		//identity martix
		//zero matrix
		//Hadamard-gate
		//flip-gate
		//turn-gate (in which case )
		//tensor product of transformations
		//tensor product of measurements?
		//add row to complexmatrix
		//add column to complexmatrix
		
		switch(builtIn.getName()){
		case "qubit":{
			if(params.size()!=2){
				throw new Exception("Qubit needs exactly two complex numbers to be initialized");
			}
			else{
				for(Object param:params){
					if(!(param instanceof Complex)){
						throw new Exception("Qubit needs   complex numbers to be initialized");
					}
					
				}
				return new  Qubit(((Complex)params.get(0)), ((Complex) params.get(1)));
			}
			
		}
		case "applyToQubit":{
			//the first element is the transformation, the second is the qubit
			if(params.size()!=2){
				throw new Exception("To transform qubit, we need exactly two inputs");
			}
			else{
				if(!(params.get(0) instanceof Transformation)){
					throw new Exception("To transform qubit, first input must be transformation");
				}
				if(!(params.get(1) instanceof Qubit)){
					throw new Exception("To transform qubit, second input must be qubit");
				}
				else{
					return Transformation.apply(((Qubit)params.get(0)), ((Transformation) params.get(1)));
				}
			}
		}
		case "applyToQuantumState":{
			//the first element is the transformation. the state is THE state.
			if(params.size()!=1){
				throw new Exception("To transform quantum state, we need exactly one input");
			}
			else{
				if(!(params.get(0) instanceof Transformation)){
					throw new Exception("To transform quantum state., first input must be transformation");
				}
				else{
					this.state= Transformation.apply(state, ((Transformation)params.get(0)));
					return null;
				}
			}
		}
		case "measureState":{
			//the first element is the measurement. the state is THE state.
			//changes the state. 
			if(params.size()!=1){
				throw new Exception("To measure quantum state, we need exactly one input");
			}
			else{
				if(!(params.get(0) instanceof Measurement)){
					throw new Exception("To measure quantum state., first input must be measurement");
				}
				else{
					this.state= Measurement.measure(state, ((Measurement)params.get(0)));
					return null;
				}
			}
		}
		case "transformation":{
			//the first element is the complex matrix.
			if(params.size()!=1){
				throw new Exception("To initialize transformation, we need exactly one input");
			}
			else{
				if(!(params.get(0) instanceof ComplexMatrix)){
					throw new Exception("To measure quantum state., first input must be measurement");
				}
				else{
					
					return new Transformation(   (ComplexMatrix) params.get(0)  );
				}
			}
		}
		case "measurement":{
			//the elements are complex matrices
			//changes the state. 
			//TODO: this part.
			if(params.size()!=1){
				throw new Exception("To measure quantum state, we need exactly one input");
			}
			else{
				if(!(params.get(0) instanceof ComplexMatrix)){
					throw new Exception("To measure quantum state., first input must be measurement");
				}
				else{
					
					return new Transformation(   (ComplexMatrix) params.get(0)  );
				}
			}
		}
		
		}
		return "";
	}
	
	public static boolean isSquare (int a ){
		//returns true if a is a square number.
		if(a<0){
			return false;
		}
		else{
			int sqr= (int)Math.sqrt(a);
			if(sqr*sqr==a){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
}
