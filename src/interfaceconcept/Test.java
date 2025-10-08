package interfaceconcept;

public class Test implements A, B{
	
	public void m1() {
		System.out.println("In Test class");
	}
	
	public static void main(String[] args) {
		Test objTest=new Test();
		objTest.m1();
	}
}
