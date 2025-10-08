package exceptionhandling;

public class Sequence {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\Bhagwan\\OneDrive\\Desktop\\abcd.txt";

		try {
				System.out.println(filePath.charAt(100));
		} catch (ArithmeticException e) {
			// TODO: handle exception
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
		}
	}

}
