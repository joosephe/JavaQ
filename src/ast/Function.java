package ast;

import java.util.Arrays;
import java.util.List;

import ee.ut.cs.akt.aktk.ast.Expression;
import ee.ut.cs.akt.aktk.ast.Statement;


public class Function extends Statement {
	private final String type;
	private final String name;
	private final Expression parameters;
	private final Statement statements;

	public Function(String type, String name, Expression parameters, Statement statements) {
		this.type = type;
		this.name = name;
		this.parameters = parameters;
		this.statements = statements;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)type, name, parameters, statements);
	}
	
	public String getType(){
		return type;
	}
	
	public String getName(){
		return name;
	}
	
	public Expression getParameters() {
		return parameters;
	}
	
	public Statement getStatements() {
		return statements;
	}
}
