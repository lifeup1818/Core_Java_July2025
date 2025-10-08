package assignments;

import java.util.Iterator;

public class StarPatterns {
	
	public static void main(String[] args) {
		
		//*
		//**
		//***
		
		int n=5;
		
		for (int i = n; i >0; i--) {
			//1. i=5
			//2. i=4
			//3. i=3
			//4. i=2
			//5. i=1
			
			//for adding space before printing * 
			for (int c = n-i; c >0 ; c--) { 
				//1. //n=5   c=5-5==0//false
				//2. c=5-4>> c=1 >>0   space 1
				//3. c=5-3>> c=2  space 1  after post-decrement c=1 space 2 c=0  false
				//4. c=5-2>> c=3  space 1  c=2 space 2  c=1 space 3 c=0 false
				//5. c=5-1>> c=4  space 1  c=3 space 2  c= 2 space 3 c=1 space 4 c=0 false
				System.out.print(" ");
			}
			
			for (int j = i; j >0 ; j--) { 
				//1. j=5,4,3,2,1   
				//2. j=4 3 2 1
				//3. j=3 2 1
				//4. j=2 1
				//5. j=1
				System.out.print("* ");
			}		
			System.out.println();
			//1. 2nd line
			//2. 3rd line
			//3. 4th line
			//4. 5th line
			//5. 6 line
		}
		
		
		
	}

}
