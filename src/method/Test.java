package method;

public class Test {
	
	public void m1() {
		System.out.println("in m1");
		m3();
	}
	
	public void m2() {
		System.out.println("in m2");
		m1();
	}
	
	public static void m3() {
		System.out.println("in m3");
		
	}
	
	public static void m4() {
		System.out.println("in m4");
		m3();
	}
	
	public static void main(String[] args) {
		System.out.println(".....");
		
		Test obj= new Test();
		obj.m1();
	}

}
