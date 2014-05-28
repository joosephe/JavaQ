package Internals;

public class BuiltIn {
	private final String type;
	private final String name;
	
	public BuiltIn(String type, String name){
		this.type=type;
		this.name=name;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}
}
