package AssignmentThree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		// Constructors
		TreeMap<Integer, String> tm1 = new TreeMap<>();
		TreeMap<Integer, String> tm2 = new TreeMap<>(Comparator.reverseOrder());
		TreeMap<Integer, String> tm3 = new TreeMap<>(tm1);
		TreeMap<Integer, String> tm4 = new TreeMap<>(new HashMap<>());

		// Methods
		tm1.put(1, "A");
		tm1.put(2, "B");
		tm1.get(1);
		tm1.remove(2);
		tm1.containsKey(1);
		tm1.containsValue("A");
		tm1.firstKey();
		tm1.lastKey();
		tm1.headMap(2);
		tm1.tailMap(1);
		tm1.subMap(1, 3);
		tm1.keySet();
		tm1.values();
		tm1.size();
		tm1.clear();

		System.out.println("TreeMap Demo Completed");
	}

}
