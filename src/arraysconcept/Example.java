package arraysconcept;

public class Example {

	public static void main(String[] args) {
		int[][] arr = new int[2][2];

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 11;
		arr[1][1] = 21;

		System.out.println("..:" + arr.length);

		System.out.println(arr[0][1]);

		// row
		for (int i = 0; i < arr.length; i++) {
			// clm
			for (int j = 0; j < arr.length; j++) {
				System.out.println("value of index " + i + "" + j + ":" + arr[i][j]);
			}
		}

		// arr[0][0]=10
		// arr[0][1]=20
		// arr[1][0]=11
		// arr[1][1]=21
		
		System.out.println("***********");
		System.out.println("***********");

		//assign value directly to the array object
		String[][] str = { { "a", "b", "c" }, { "d", "e", "f" } };
		// row
		for (int i = 0; i < str.length; i++) {
			// clm
			for (int j = 0; j < str.length+1; j++) {
				System.out.println("value of index " + i + "" + j + ":" + str[i][j]);
			}
		}
	}

}
