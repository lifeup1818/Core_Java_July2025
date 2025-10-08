package arraysconcept;

public class Test {
	
	
	public void displayAgeValues(int age[]) {		
		for(int i=0; i<age.length; i++) {
			System.out.println("value of index "+i+":"+age[i]);
		}
	}
	
	
	public static String[] getEmpnames() {
		String names[]= {"Bhagwan","Suraj","Yash"};
		return names;
	}
	
	public static void main(String[] args) {
		int age[]= {10,1,3,4};
	
		Test obj= new Test();
		obj.displayAgeValues(age);
		
		System.out.println("***************");
		System.out.println("***************");
		
		String [] name=getEmpnames();
		System.out.println(name.length);
		System.out.println("name of index 1="+name[1]);
		for (String string : name) {
			System.out.println(string);
		}
	}

}
