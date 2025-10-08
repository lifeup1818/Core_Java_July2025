package oopsconcept;

public class ChildClassVariables extends ParentClassVariables{
	
	int a=10;
	int b=20;
	
	public void printChildAndParentClassVariables() {
		System.out.println(super.a);
	}
	
	public void test() {
		System.out.println("in child class test method");
	}
	
	public void sum(int a, int b) {
		System.out.println("local variables addition"+(a+b));//150
		System.out.println("Instance variables with child addition="+(this.a+this.b));//30//super.a//this.a
		System.out.println("parents variables addition="+(super.a+super.b));//400
		super.m1();
		this.m1();
		System.out.println(name);
		test();
	}
	
	public void m1() {
		System.out.println("in child class");
	}
	
	
	public static void main(String[] args) {
		ChildClassVariables obj= new ChildClassVariables();
		obj.sum(100, 50);
	}

}
