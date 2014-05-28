package ast;

import java.util.ArrayList;
import java.util.List;

import ee.ut.cs.akt.aktk.ast.AstNode;
import ee.ut.cs.akt.aktk.ast.Statement;


public class Program extends AstNode {
	private final List<Statement> functions;

	public Program(List<Statement> functions){
		this.functions=functions;
	}

	@Override
	public List<Object> getChildren() {
		return new ArrayList<Object>(functions);
	}
	
	public List<Statement> getFunctions(){
		return functions;
	}
	
}
