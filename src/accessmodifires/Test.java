package accessmodifires;
public class Test {
	
	public static void main(String[] args) {
		AccessModifires obj= new AccessModifires();
		
		//try to access public variables and methods
		obj.display();
		System.out.println("age="+obj.age);
		
		//try to access private variables and methods
		/**
		*It cannot be accessed from outside the class.
		*/
		
		//try to access protected variables and methods
		obj.addTowNumbers(10, 20);
		System.out.println("marks:"+obj.marks);	
		
		//try to access default variables and methods
		obj.sum();
		System.out.println("flag:"+obj.flag);
	}

}
