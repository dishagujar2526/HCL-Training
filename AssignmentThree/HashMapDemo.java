package AssignmentThree;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		// Constructors
		HashMap<Integer, String> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>(10);
		HashMap<Integer, String> map3 = new HashMap<>(10, 0.75f);
		HashMap<Integer, String> map4 = new HashMap<>(map1);

		// Methods
		map1.put(1, "A");
		map1.put(2, "B");
		map1.putIfAbsent(3, "C");
		map1.get(1);
		map1.remove(2);
		map1.containsKey(1);
		map1.containsValue("A");
		map1.keySet();
		map1.values();
		map1.entrySet();
		map1.size();
		map1.isEmpty();
		map1.replace(1, "Z");
		map1.getOrDefault(5, "Default");
		map1.clear();

		System.out.println("HashMap Demo Completed");
	}

}
