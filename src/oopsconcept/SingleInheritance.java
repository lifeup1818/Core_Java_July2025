package oopsconcept;

public class SingleInheritance extends Student {
	String subject = "Hindi";

	public static void main(String[] args) {
		SingleInheritance obj = new SingleInheritance();
		System.out.println("Student ID:" + obj.id);
		System.out.println("Student ID:" + obj.name);
		System.out.println("Subject:" + obj.subject);
	}
	
	public SingleInheritance() {
		super("Java");
	}
	
	
}
