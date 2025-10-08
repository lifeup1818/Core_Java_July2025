package method;

public class MethodCalling {

	// 1. Method with without parameter (Instance Method)
	public void display() {
		System.out.println("In Display method");
		System.out.println("Core Java");
	}

	// 2. method with parameter (Instance method)
	public void addTwoNumbers(int a, int b) {
		System.out.println("In addTwoNumbers method");
		System.out.println("Addition=" + (a + b));
	}

	// 3.method with return type without parameter (Instance method)
	int getSubtractionValue() {
		int a = 300, b = 100;
		int c = a - b;
		return c;
	}

	// 4.Method with return type with parameter (Instance method)
	int getMultiplicationValue(int a, int b) {
		int c = a * b;
		return c;
	}
	
	//5. Static method without parameter (Static method)
	public static void studentData() {
		String name="Bhagwan";
		System.out.println("student name="+name);
	}
	
	//6. Static method with parameter  (Static method)
	public static void empData(String empName) {
		System.out.println("student name="+empName);
	}
	
	//7. Static method with return type  (Static method)
	public static String data(String empName) {
		return empName;
	}

	public static void main(String[] args) {
		MethodCalling obj= new MethodCalling();
		//1.
		obj.display();
		
		//2.
		obj.addTwoNumbers(10, 20);
		
		//3.
		System.out.println("Subtraction value="+obj.getSubtractionValue());
		
		//4.
		int a=obj.getMultiplicationValue(22, 2);
		System.out.println("Multiplication value="+a);
		
		/**
		 * We can call static methods using class name, direct and object
		 */
		//5.
		studentData();
		
		//6.
		MethodCalling.empData("Bhagwan");
		
		//7.
		System.out.println("data="+obj.data("abcd"));
	}

}
