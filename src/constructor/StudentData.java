package constructor;

public class StudentData {
	int a;
	int b;
	int studentID;
	String studentName;
	
	
	public void studentInfo() {
		System.out.println("ID="+studentID);
		System.out.println("name="+studentName);
	}
	
	public StudentData() {
		studentID=10;
		studentName="Bhagwan";
		a=10;
		b=20;
	}
	
	public StudentData(int a, int b) {
		studentID=10;
		studentName="Bhagwan";
		a=10;
		b=20;
	}
	
	StudentData(String a) {
		studentID=10;
		studentName="Bhagwan";
	}
	
	public static void main(String[] args) {
		StudentData obj=new StudentData();
		obj.studentInfo();
		
		StudentData obj1=new StudentData();
		StudentData ob2=new StudentData();
		Test aTest=new Test(01, "");
		Test aTest1=new Test(01, "");
	}

}
