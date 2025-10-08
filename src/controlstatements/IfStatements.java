package controlstatements;

public class IfStatements {

	public static void main(String[] args) {
		int a = 100, b = 200;
		// 1.Simple if statement

		if (b > a) {
			System.out.println("condition matched");
		}

		// 2. if-else statement

		if (b == a) {
			System.out.println("yes b is greater than a");
		} else {
			System.out.println("b is not greater than a");
		}

		// 3. if-else ladder statement

		int age = 20;

		if (age > 20) {
			// logic 1
			System.out.println("age is greater than 20");
		} else if (age < 10) {
			// logic 2
			System.out.println("age is less than 10");
		} else {
			// logic 3
			System.out.println("age is in between 10 to 20");
		}

		// 4. Nested if-statement

		int myAge = 20;
		if (myAge >= 20) {
			// logic 1
			System.out.println("age is greater than or euqal to 20");
			if (myAge > 20) {
				// logic 2
				System.out.println("age is greater than 20");
			} else {
				// logic 3
				System.out.println("age is equal to 20");
			}
		} else {
			// logic 4
			System.out.println("age is less than 20");
			if (myAge > 10 && myAge < 20) {
				// logic 5
				System.out.println("age is between to 10 to 20");

			} else {
				// logic 6
				System.out.println("age is less than 10");
			}
		}

	}

}
