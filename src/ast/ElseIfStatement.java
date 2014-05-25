package ast;

import java.util.Arrays;
import java.util.List;

import ee.ut.cs.akt.aktk.ast.Expression;
import ee.ut.cs.akt.aktk.ast.Statement;

public class ElseIfStatement extends Statement {
	
	private final Expression condition;
	private final Statement thenBranch;

	public ElseIfStatement(Expression condition, Statement thenBranch) {
		this.condition = condition;
		this.thenBranch = thenBranch;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)condition, thenBranch);
	}
	
	public Expression getCondition() {
		return condition;
	}
	
	public Statement getThenBranch() {
		return thenBranch;
	}
}
