package encapsulation;

public class Test implements A, B {

	@Override
	public void display() {
		System.out.println("in Test class");
	}
	
	
	public static void main(String[] args) {
		Test objTest= new Test();
		objTest.display();
	}

}
