package constructor;

public class Test {
	int a=10;
	static Test classObjecTest;
	int name;
	
	Test(int age, String myName){
		System.out.println("age="+age);
		System.out.println("my name="+myName);
		name=age;
	}
	
	public void message() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		
		//2.
		Test obj= new Test(100, "bhagwan");
		
		
	}

}
