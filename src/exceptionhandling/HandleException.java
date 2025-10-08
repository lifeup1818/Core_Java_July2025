package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleException {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\Bhagwan\\OneDrive\\Desktop\\abcd.txt";

		System.out.println("Execution started");

		try {
			FileReader f = new FileReader(filePath);
			System.out.println("file read");
			System.out.println("file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
		
		System.out.println("Execution end");

	}

}
