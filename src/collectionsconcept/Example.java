package collectionsconcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Example {

	public static void main(String[] args) {
		Map<Integer, String>	map= new TreeMap<Integer, String>();
		map.put(20, "bk");
		map.put(30, "sk");
		map.put(10, "Bhagwan");
		map.put(null, "Bhagwan");
		
		System.out.println(map);
		System.out.println(map.get(10));
	}

}
