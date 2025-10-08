package polymorphisam;

public class Child extends Parent{
	int a=20;
	int b=30;
	
	@Override
	public void info() {
		System.out.println("a="+a);
		System.out.println("a="+b);
	}
	
	public static void main(String[] args) {		
		Parent obj= new Child();
		obj.info();		
	}
	
}
