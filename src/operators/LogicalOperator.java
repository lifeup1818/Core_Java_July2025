package operators;

public class LogicalOperator {
	
	public static void main(String[] args) {
		int a=40, b=30;
		boolean flag=true;
		//1 Logical operator &&
		System.out.println("Logical operator using And(&&)");
		System.out.println((a>b) && (b<a));
		
		System.out.println("Logical operator using Or(||)");
		System.out.println((a>b) || (b>a));
		
		System.out.println("Logical operator using Not(!)");
		System.out.println(!flag);
	}

}
