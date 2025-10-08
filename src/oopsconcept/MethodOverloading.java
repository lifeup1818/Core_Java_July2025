package oopsconcept;

import java.lang.foreign.AddressLayout;

public class MethodOverloading {
	
	
	public void add() {
		System.out.println("in addition method");
	}
	
	public void add(int a) {
		System.out.println("sum="+(10+a));
	}
	
	public void add(String str) {
		System.out.println("sum="+str);
	}
	
	public void add(long a, int b) {
		System.out.println("in int data types");
		System.out.println("sum="+(a+b));
	}
	
	public void add(long a, long b) {
		System.out.println("sum="+(a+b));
	}
	
	public static void main(String[] args) {
		MethodOverloading obj= new MethodOverloading();
		obj.add(10,10);
	}
	
	

}
