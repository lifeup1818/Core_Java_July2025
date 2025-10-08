package oopsconcept;

public class ChildClass extends ParentClass {
	boolean flag = false;

	public void message() {
		System.out.println("in child class");
	}

	public static void main(String[] args) {
		/**
		 * With Child Class Object
		 * We can access child as well as Parent class properties 
		 */
		ChildClass child = new ChildClass();
		child.message(); 						// calling child method
		System.out.println(child.flag); 		// calling child variable
		child.dialog(); 						// calling parent method
		System.out.println(child.myName); 		// calling parent variable
		
		System.out.println(".........********..............");
		System.out.println(".........********..............");
		
		/**
		 * With Parent Class Object
		 * We can access only Parent class properties
		 */
		ParentClass parent = new ParentClass();
		parent.dialog(); 							// calling parent method
		parent.message();							// calling parent method	
		System.out.println(parent.myName); 			// calling parent variable

		System.out.println(".........********..............");
		System.out.println(".........********..............");
		
		/**
		 * With Child Object but Object Reference is Parent Class
		 * Compile time compiler will check if same methods are present in Parent and child class
		 * If yes, at runtime it will call Child class methods because we have created Child class object 
		 */
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		// parent parent= new child();
		ParentClass obj = new ChildClass();
		obj.dialog();       // calling method but compiler will check if same method are present in both class parent and child if same then it will call child class method
		//in parent class
		obj.message();		// calling method but compiler will check if same method are present in both class parent and child if same then it will call child class method
		//in child class
		System.out.println(obj.myName);
		
		
		/**
		 * With Parent Object but Object Reference is Child Class
		 * This will throw compile time error
		 */
		//ChildClass childClass= new ParentClass();   //compile time error
	}

}
