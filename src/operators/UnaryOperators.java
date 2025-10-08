package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		int a = 10, preIncrement = 50;
		int b = 20, postIncrement = 100;

		// pre-increment (++Before_Variable)
		System.out.println("value a=" + a);// 10
		System.out.println("after pre increment a=" + (++a));// 11
		System.out.println("value a=" + a);// 11

		// post-increment (After_Variable++)
		System.out.println("value b=" + b);// 20
		System.out.println("after post increment a=" + (b++));// 20
		System.out.println("value b=" + b);// 21

		++preIncrement;
		postIncrement++;

		System.out.println("value a=" + preIncrement);// 51,
		System.out.println("value b=" + postIncrement);// 101,

		////////// Decrement////////////
		int preDecrement = 500;
		int postDecrement = 600;
		// pre-decrement (--Before_Variable)
		System.out.println("value preDecrement=" + preDecrement);// 500
		System.out.println("after pre-drecrement value of preDecrement=" + (--preDecrement));// 499
		System.out.println("value preDecrement=" + preDecrement);// 499
		
		// post-decrement (After_Variable--)
		System.out.println("value of postDecrement=" + postDecrement);// 600
		System.out.println("after post-drecrement value of postDecrement=" + (postDecrement--));// 600
		System.out.println("value of postDecrement=" + postDecrement);// 599
		
	}

}
