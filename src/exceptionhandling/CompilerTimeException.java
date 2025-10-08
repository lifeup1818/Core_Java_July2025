package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompilerTimeException {

	public static void main(String[] args) {
		
		
		String filePath="‪C:\\Users\\Bhagwan\\OneDrive\\Desktop\\abcd.txt";
		File file= new File(filePath);
		System.out.println("Execution started");
		
		try {
			
			FileReader f= new FileReader(file);
			System.out.println("File found");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		System.out.println("Execution completed");
	}

}
