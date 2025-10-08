package variables;

public class StaticVariables {

	// static variable 
	static int age=20;
	static boolean flag;
	
	
	//instance method
	public void name() {
		//1. direct access static variable
		System.out.println("Inside Instance Method......");
		System.out.println(age);
		System.out.println(flag);
		

		//2. Using Class name
		System.out.println("using class Name inside instance variable.........");
		System.out.println(StaticVariables.age);
		System.out.println(StaticVariables.flag);
		
		//3. Using Object
		StaticVariables obj= new StaticVariables();
		System.out.println("using object Name inside instance variable.........");
		System.out.println(obj.age);
		System.out.println(obj.flag);
	}
	
	public static void main(String[] args) {
		//1. direct access static variable
		StaticVariables obj= new StaticVariables();
		
		System.out.println(age);
		System.out.println(flag);
		
		//2. Using Class name
		System.out.println("using class Name inside static method.........");
		System.out.println(StaticVariables.age);
		System.out.println(StaticVariables.flag);
		
		//3. Using Object
		System.out.println("using Object inside static method.........");
		System.out.println(obj.age);
		System.out.println(obj.flag);
		
		
		System.out.println("***Instance method calling*****");
				
		obj.name();
		
		
	}
		
		
}
