package exceptionhandling;

public class HandleRunTimeException {
	
	public static void main(String[] args) {
		//Handle Arithmetic Exception
		int number=100;
		int d=2;
		System.out.println("Execution started");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			int a=number/d;
			System.out.println("a="+a);
			System.out.println("logic completed");
		} catch (ArithmeticException e) {
			System.out.println("logic not completed");
			e.printStackTrace();
		}
		
		System.out.println(4);
		System.out.println(5);
		System.out.println("Execution End");
		
		//Handle String Index Out Of Bounds Exception
		System.out.println("***************************");
		String str="ja";
		
		System.out.println("started string logic");
		
		try {
			System.out.println("value of index 3 is="+str.charAt(3));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Logic not completed");
			e.printStackTrace();
		}
			
		System.out.println("end string logic");	
	}

}
