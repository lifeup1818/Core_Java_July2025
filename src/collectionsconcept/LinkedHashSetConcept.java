package collectionsconcept;

import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetConcept {
	
	
	public static void main(String[] args) {
		
		//Expected data
		LinkedHashSet list= new LinkedHashSet<>();
		list.add("India");
		list.add("Us");
		list.add("SA");
		
		//Actual data
		LinkedHashSet<String> list1= new LinkedHashSet<>();
		list1.add("India");
		list1.add("Us");
		list1.add("SA");
		
		LinkedHashSet<String> result= new LinkedHashSet<>();
		result.addAll(list);
		result.addAll(list1);
		
		result.removeAll(list1);
		if (result.isEmpty()) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case fail");
			System.out.println(result);
		}
					
	}

}
