package variables;

import java.lang.constant.Constable;

public class InstanceVariable {
	
	//instance variables
	int myAge=1;
	String userName;
	boolean flag=false;
	int studentAge=30;
	
	
	public void test() {
		//instance Method
		myAge=myAge+10;
		System.out.println(myAge);
		System.out.println(userName);
		System.out.println(flag);
	}
	
	public void test123() {
		//instance Method
		myAge=myAge+10;
		System.out.println(myAge);
		System.out.println(userName);
		System.out.println(flag);
	}
	
	public static void main(String[] args) {
		//static method
		
		InstanceVariable obj= new InstanceVariable();
		obj.myAge=40;
		System.out.println(obj.myAge);
		System.out.println(obj.userName);
		System.out.println(obj.flag);
	}

}
