package ast;

import java.util.Arrays;
import java.util.List;

import ee.ut.cs.akt.aktk.ast.Expression;
import ee.ut.cs.akt.aktk.ast.Statement;

public class IfStatement extends Statement {
	
	private final Expression condition;
	private final Statement thenBranch;
	private final List<Statement> elseIfs;
	private final Statement elseBranch;

	public IfStatement(Expression condition, Statement thenBranch, List<Statement> elseIfs, Statement elseBranch) {
		this.condition = condition;
		this.thenBranch = thenBranch;
		this.elseIfs = elseIfs;
		this.elseBranch = elseBranch;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)condition, thenBranch, elseIfs, elseBranch);
	}
	
	public Expression getCondition() {
		return condition;
	}
	
	public Statement getThenBranch() {
		return thenBranch;
	}
	
	public List<Statement> getElseIfs() {
		return elseIfs;
	}
	
	public Statement getElseBranch() {
		return elseBranch;
	}
}
