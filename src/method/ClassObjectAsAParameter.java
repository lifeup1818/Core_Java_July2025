package method;

public class ClassObjectAsAParameter {
	
	public void displayName(VariablesPriority obj) {
		String name=obj.myName;
		System.out.println("My Name="+name);
	}
	
	public static void main(String[] args) {
		ClassObjectAsAParameter obj= new ClassObjectAsAParameter();
		obj.displayName(new VariablesPriority());
	}

}
