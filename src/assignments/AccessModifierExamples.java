package assignments;

import accessmodifires.AccessModifires;

public class AccessModifierExamples {	
	
	public static void main(String[] args) {
		
		AccessModifires obj= new AccessModifires();
		obj.display();
		System.out.println("age="+obj.age);
		
		//try to access private variables and methods
		/**
		*It cannot be accessed from outside the class.
		*/
		
		//try to access default variables and methods
		/**
		 * It cannot be accessed from outside the package
		 */
	}

}
