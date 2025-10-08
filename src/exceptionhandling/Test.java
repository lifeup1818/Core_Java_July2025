package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		int a=5;
		
		if (a>10) {
			System.out.println("Condition matched");
		} else {
			throw new Error("conditon not matched "+a);
		}
	}

}
