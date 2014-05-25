package Parser;

import java.util.HashMap;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import Internals.Complex;
import Internals.ComplexMatrix;
import Internals.Ensemble;
import Internals.random;
import gram.gramParser.*;

public class Visitor {

	private String result;
	private String resultType;
	private ParseTree tree;
	
	private HashMap<String, Integer> ints = new HashMap<>();
	private HashMap<String, Boolean> bools = new HashMap<>();
	private HashMap<String, Float> floats = new HashMap<>();
	private HashMap<String, Complex> complexes = new HashMap<>();
	
	public Visitor(ParseTree tree) {
		this.tree = tree;
	}
	
	public void runProgram() throws Exception {
		if(!(tree.getChild(0) instanceof FunctionContext))
			throw new Exception ("Invalid syntax!");
		runFunction((FunctionContext)tree.getChild(0));
	}

	
	private void runFunction(FunctionContext parent) throws Exception {
		this.resultType = parent.getChild(1).getText();
		getFunctionInitParams(parent.getChild(2).getChild(2)); //calls initParameters in the parse tree, before statements
		
	}

	private void getFunctionInitParams(ParseTree parent) throws Exception {
		for(int i=0; i<=parent.getChildCount(); i+=2) {
			if(!(parent.getChild(i) instanceof ParameterContext))
				throw new Exception("Invalid parameter in function init" + parent.getChild(i).getText());
			addToMemory(parent.getChild(i).getChild(0).getText(), (Token) parent.getChild(i).getChild(1).getPayload(), random.initialArgs[i/2]);
		}
		
	}

	private void addToMemory(String type, Token name, String value) throws Exception {
		switch(type) {
			case "int": {
				if(ints.containsKey(name))
					throw new Exception ("Bad variable name!");
				else {
					ints.put(name.getText(), new Integer(value));
				}
			}
			case "bool": {
				if(bools.containsKey(name))
					throw new Exception ("Bad variable name!");
				else {
					bools.put(name.getText(), new Boolean(value));
				}
			}
			case "float": {
				if(floats.containsKey(name))
					throw new Exception ("Bad variable name!");
				else {
					floats.put(name.getText(), new Float(value));
				}
			}
			case "complex": {
				if(complexes.containsKey(name))
					throw new Exception ("Bad variable name!");
				else {
					complexes.put(name.getText(), new Complex(value));
				}
			}
		}
		
	}

	public String getResult() {
		return result;
	}

}
