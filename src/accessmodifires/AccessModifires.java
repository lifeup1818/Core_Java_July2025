package accessmodifires;

public class AccessModifires {
	// 1. public access modifier with variable
	public int age = 20;

	// 3. private access modifier with variable
	private String name = "bhagwan";

	// 5. private access modifier with variable
	protected float marks = 10.20f;

	// 7. default access modifier with variable
	boolean flag = false;

	// 2. public access modifier with method
	public void display() {
		System.out.println("In public method");
		System.out.println("Hello");
	}

	// 4. private access modifier with method
	private void message(String message) {
		System.out.println("In private method");
		System.out.println("message:" + message);
	}

	// 6. protected access modifier with method
	protected void addTowNumbers(int a, int b) {
		System.out.println("In protected method");
		System.out.println("sum:" + (a + b));
	}

	// 8. default access modifier with method
	void sum() {
		System.out.println("In default method");
		System.out.println("sum:" + 10);
	}

	public static void main(String[] args) {
		AccessModifires obj = new AccessModifires();
		// try to access public variables and methods
		obj.display();
		System.out.println("age=" + obj.age);

		// try to access private variables and methods
		obj.message("Hi");
		System.out.println("name:"+obj.name);

		// try to access protected variables and methods
		obj.addTowNumbers(10, 20);
		System.out.println("marks:" + obj.marks);

		// try to access default variables and methods
		obj.sum();
		System.out.println("flag:" + obj.flag);
	}

}
