package ast;

import java.util.ArrayList;
import java.util.List;

import ee.ut.cs.akt.aktk.ast.Expression;

public class Parameters extends Expression {
	
	private final List<Expression> expressions;

	public Parameters(List<Expression> expressions) {
		this.expressions = expressions;
	}

	@Override
	public List<Object> getChildren() {
		return new ArrayList<Object>(expressions); 
	}
}
