package oopsconcept;

public class Student  extends Data{	
	
	String name="Harsh";
	static int id=10;
	
	public void studentData() {
		System.out.println("id="+id);
		System.out.println("name="+name);
	}
	
	public void subject(String subjectName) {
		System.out.println("Subject="+subjectName);
	}
	
	public void info() {
		System.out.println("my name:"+myName);
	}
	
	public Student(String myName) {
		super(myName);
	}
	
	public static void main(String[] args) {
		Student obj= new Student("Bhagwan");
		obj.info();
	}

}
