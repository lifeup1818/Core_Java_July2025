package method;

import assignments.Assignmnet1;
import pages.LoginPage;

public class MethodDeclaration {

	// 1. Method with without parameter
	public void dispay() {
		System.out.println("In Display Method");
	}

	// 2. Method with parameter
	public void sum(int a, int b) {
		System.out.println("in sum method sum=" + (a + b));
	}

	// 3. Method with return type, without parameter
	public int subtraction() {
		int a = 20, b = 50;
		return b-a;
	}

	// 4. Method with return type with parameter
	int multiplication(int a) {
		System.out.println("In Multiplication Method");
		return a * 2;
	}

	// 5. Static method without parameter
	static void test() {
		System.out.println("In Static method");
	}

	// 6. Static method with parameter
	static void m1(boolean flag) {
		System.out.println("In Static method with parameter");
		System.out.println(flag);
	}
	
	// 7. static method with return type
	
	static char m2(boolean flag) {
		System.out.println("In Static method with parameter");
		return 'a';
	}
	
	public void empData(LoginPage login) {
		login.enterUserName();
	}
	
	public LoginPage getLoginData(LoginPage login) {
		return login;
	}
	
	
	
}
