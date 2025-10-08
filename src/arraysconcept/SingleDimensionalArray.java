package arraysconcept;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		int[] age = new int[5];

		System.out.println("age lenght=" + age.length);

		age[0] = 10;
		age[1] = 20;
		age[2] = 30;
		age[3] = 40;
		age[4] = 50;
		
		//1. print length
		int lenghtOfArray=age.length;
		System.out.println("lenght="+lenghtOfArray);
		
		
		System.out.println("****************************");
		System.out.println("****************************");
		
		//2. print particular value
		System.out.println(age[1]);
		
		
		System.out.println("****************************");
		System.out.println("****************************");
		
		//print array using for loop
		for(int i=0; i<lenghtOfArray; i++) {
			System.out.println("value of index "+i+":"+age[i]);
		}
		
		System.out.println("****************************");
		System.out.println("****************************");
		
		//print array using for each
		for(int ar:age) {
			System.out.println(":"+ar);
		}
		
		String[] str= new String[3];
		str[0]="A";
		str[1]="B";
		str[2]="C";
		
		for (String s : str) {
			System.out.println("...:"+s);
		}
		
		System.out.println("****************************");
		System.out.println("****************************");
		
		char [] ch= {'a','b','c'};
		System.out.println("lenght of ch:"+ch.length);
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println("value of index "+i+":"+ch[i]);
		}
		
		int a[]= {1,2,3,4};
		String s[]= {"ab","sk"};
	}

}
