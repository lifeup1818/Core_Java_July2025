package variables;

import java.security.DomainCombiner;

public class LocalVariables {
	
	
	//constructor
	public LocalVariables() {
		System.out.println("inside Constructor.......");
		int a=20;
		System.out.println(a);
	}
	
	//instance block
	{
		System.out.println("inside Instance Block.......");
		int b=20;
		boolean flag=true;
		System.out.println(b);
		System.out.println(flag);
	}
	
	//instance method/Area
	public void test() {
		System.out.println("inside Test.......");
		int a, xyz, age;
		String str="Java";
		System.out.println(str);
		a=100;
		xyz=200;
		age=20;
	}
	
	public static void main(String[] args) {
		
		LocalVariables obj= new LocalVariables();
		obj.test();
		
	}

}
