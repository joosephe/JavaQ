package ast;

import java.util.Arrays;
import java.util.List;

import ee.ut.cs.akt.aktk.ast.Expression;
import ee.ut.cs.akt.aktk.ast.Statement;


public class VariableDeclaration extends Statement {
	private final Expression parameter;
	private final Expression initializer;

	public VariableDeclaration(Expression parameter, Expression initializer) {
		this.parameter = parameter;
		this.initializer = initializer;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)parameter, initializer);
	}
	
	public Expression getParameter() {
		return parameter;
	}
	
	/**
	 * @return Võib tagastada {@code null}.
	 */
	public Expression getInitializer() {
		return initializer;
	}
}
