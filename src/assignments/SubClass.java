package assignments;

import accessmodifires.AccessModifires;

public class SubClass extends AccessModifires {
		
	public static void main(String[] args) {
		//try to access protected variables and methods
		SubClass obj= new SubClass();
		obj.addTowNumbers(10, 20);
		System.out.println("marks:"+obj.marks);	
	}

}
