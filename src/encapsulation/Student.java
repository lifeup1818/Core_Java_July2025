package encapsulation;

/**
 * Getter and Setter methods, 
 * POJO (Plain Old Java Object)
 */
public class Student {	
	
	private int studentAge=10;
	private String studentName="bhagwan";
	
	public int getStudentAge() {
		return studentAge;
	}
	
	public void setStudentAge(int studentAge) {
		this.studentAge=studentAge;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}	
	
}
