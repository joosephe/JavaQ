package ast;

import java.util.Arrays;
import java.util.List;

import ee.ut.cs.akt.aktk.ast.Expression;

public class Type extends Expression {
	
	private final String name;

	public Type(String name) {
		this.name = name;
	}

	@Override
	public List<Object> getChildren() {
		return Arrays.asList((Object)name);
	}
	
	public String getName() {
		return name;
	}
}
