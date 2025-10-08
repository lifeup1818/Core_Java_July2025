package method;

public class MethodChaining {

	// Instance Method
	public void m1() {
		// instance area { }
		System.out.println("in m1 method");
		
		// calling static method directly in instance area
		test4();
	}

	// Instance Method
	public void m2() {
		// instance area { }
		System.out.println("in m2 method");

		// calling instance method directly in instance area
		m1();
	}

	// Instance Method
	public void m3() {
		// instance area { }
		System.out.println("in m3 method");

		// calling instance method directly in instance area
		m2();
	}

	// static Method
	public static void test1() {
		// static area { }
		System.out.println("int test1 method");
	}

	// static Method
	public static void test2() {
		// static area { }
		System.out.println("int test2 method");

		// calling static method test1() directly in static area
		test1();
	}

	// static Method
	public static void test3() {
		// static area { }
		System.out.println("int test3 method");

		// calling static method test2() using class name in static area
		MethodChaining.test2();
	}

	// static Method
	public static void test4() {
		// static area { }
		System.out.println("int test4 method");

		// calling static method test1() using Object in static area
		MethodChaining obj = new MethodChaining();
		obj.test3();
	}

	public static void main(String[] args) {
		
		MethodChaining obj = new MethodChaining();
		obj.m3();
	}

}
