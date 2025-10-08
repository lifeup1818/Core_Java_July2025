package collectionsconcept;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;
import java.util.TreeMap;

public class HashMapConcept {

	public static void main(String[] args) {
		// K,V
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Bhagwan");
		map.put(3, "Harsh");
		map.put(4, "Surja");
		map.put(2, "Ram");
		
		Set<Entry<Integer, String>> obj=map.entrySet();
		

	}

}
