package collectionsconcept;

import java.util.ArrayList;
import java.util.List;

public class MethodsOfArrayList {
	
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
			list.add(10);
			list.add(20);//15
			list.add(30);
			System.out.println(list);
			//how to check size of ArrayList
			System.out.println("Size="+list.size());
			
			//how to get particular value
			System.out.println("Perticular Value="+list.get(2));
			
			//how to print 1st and last value
			System.out.println("1st value="+list.getFirst());
			System.out.println("last value="+list.getLast());
			
			System.out.println("Adding new value to index 1");
			list.add(1, 15);
			System.out.println(list);
			
			System.out.println(":"+list.size());
			
			System.out.println("Adding new value to the last index");
			list.add(3, 45);
			System.out.println(list);
			System.out.println(":"+list.size());
			
			
			//how to add another object values
			System.out.println("*************************");
			ArrayList<Integer> list1= new ArrayList<Integer>();
			list1.add(1);
			list1.add(2);		
			list.addAll(list1);
			System.out.println(list);
			
			//how to add another object values to particular index
			ArrayList<Integer> list2= new ArrayList<Integer>();
			list2.add(7);
			list2.add(8);	
			
			list.addAll(0,list2);
			System.out.println(list);
			
			//how to check list is empty or not
			System.out.println("list is Empty or not="+list.isEmpty());
			
	}

}
