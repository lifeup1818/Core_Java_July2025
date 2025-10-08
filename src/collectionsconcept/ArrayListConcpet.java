package collectionsconcept;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcpet {

	public static void main(String[] args) {

		//Non generic concept
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("Bhagwan");
		list.add('a');
		list.add(10.5);
		list.add(10);
		list.add("Bhagwan");
		System.out.println(list);
			
		String str=(String)list.get(1);
		System.out.println(str);
		
		int a=(int)list.get(0);
		System.out.println(a);
		
		
		//Generic
		List<String> list1= new ArrayList<>();
		list1.add("bk");
		list1.add("SK");
		list1.add("Dk");
		
		System.out.println(list);
		
		String str1=list1.get(1);
		System.out.println("...:"+str1);
		
		List<Integer> list2= new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		int ab=list2.get(2);
		System.out.println("****:"+ab);
		
		
		List<Object> list3= new ArrayList<>();
		
		list3.add(10);
		list3.add("bh");		
		
	}

}
