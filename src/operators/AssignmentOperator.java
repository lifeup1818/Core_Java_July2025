package operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a = 10, b = 30, sum, sum1, sub;
		int multi=10;
		int div=30;

		// with =  Assign
		sum = b;
		System.out.println("=" + sum);

		// with +=  Addition
		a += 90;
		System.out.println("Value a=" + a);

		// with -=  Subtraction
		b -= 8;
		System.out.println("value b="+b);
		
		//with *=  Multiplication
		multi*=30;
		System.out.println("value multi="+multi);
		
		//with /=  Division
		div/=10;
		System.out.println("value div="+div);

	}

}
