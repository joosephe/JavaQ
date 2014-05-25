package ast;

import java.util.Arrays;
import java.util.List;

import ee.ut.cs.akt.aktk.ast.Expression;

public class Parameter extends Expression {
	
	private final Expression type;
	private final Expression variable;
	
	public Parameter( Expression type, Expression variable){
		this.type = type;
		this.variable = variable;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)type, variable);
	}
	
	public Expression getType(){
		return type;
	}
	
	public Expression getVariable(){
		return variable;
	}

}
