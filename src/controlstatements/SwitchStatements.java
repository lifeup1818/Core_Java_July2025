package controlstatements;

public class SwitchStatements {

	public static void main(String[] args) {
		
		int ch = 1;

		switch (ch) {
		case 1:
			System.out.println("launch application in chrome");
			break;
		case 2:
			System.out.println("launch application in edge");
			break;
		case 3:
			System.out.println("launch application in opera");
			break;
		case 4:
			System.out.println("Day 6");
			break;

		default:
			System.out.println("Day not matched kindly select day, 1, 2 and 3");
		}
		
		
	}

}
