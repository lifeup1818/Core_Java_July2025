package polymorphisam;

public class MethodOverloading {
	
	
//	public int add(int a, int b) {
//		return a+b;
//	}
//	
//	public double add(int a, int b) {
//		return a+b;
//	}
	
	MethodOverloading(){
		System.out.println("in constructor");
	}
	
	MethodOverloading(int a){
		System.out.println("in parameter constructor ");
		System.out.println("a="+a);
	}
	
	public static void main(String[] args) {
		new MethodOverloading();
		new MethodOverloading(10);
	}
	
	public static void main(int a) {
		System.out.println("another main method");
	}

}
