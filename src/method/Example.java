package method;

public class Example {
	
	int a=30;
	int b=20;
	int sum;
	
	
	public int addValuesGreaterThan10() {
		
		if (a>10) {
			sum=a;
		}
		
		if (b>10) {
			sum+=b;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		Example obj = new Example();
		int additionValue=obj.addValuesGreaterThan10();
		System.out.println("output="+additionValue);
	}
	
	
	

}
