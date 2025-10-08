package method;

public class VariablesPriority {
	String name;
	String userName;
	String myName="Bhagwan";

	public void name(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		VariablesPriority obj = new VariablesPriority();
		
		obj.name("Bhagwan");
		System.out.println("name:"+obj.name);
	}
}
