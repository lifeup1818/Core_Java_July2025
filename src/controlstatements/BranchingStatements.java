package controlstatements;

public class BranchingStatements {
	
	public static void main(String[] args) {
		int num=10;
		
		for (int i = 0; i <= num; i++) {
			System.out.println("Number="+i);
			
			if (i==4) {
				System.out.println(" 1 test case pass");
				continue;
			} else if (i==5) {
				System.out.println(" 2 test case pass");
				break;
			}
		}
	}

}
