package AssignmentThree;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {

		// Constructors
		Hashtable<Integer, String> ht1 = new Hashtable<>();
		Hashtable<Integer, String> ht2 = new Hashtable<>(10);
		Hashtable<Integer, String> ht3 = new Hashtable<>(10, 0.75f);
		Hashtable<Integer, String> ht4 = new Hashtable<>(ht1);

		// Methods
		ht1.put(1, "Java");
		ht1.put(2, "SQL");
		ht1.get(1);
		ht1.remove(2);
		ht1.containsKey(1);
		ht1.containsValue("Java");
		ht1.keySet();
		ht1.values();
		ht1.entrySet();
		ht1.size();
		ht1.isEmpty();
		ht1.replace(1, "Spring");
		ht1.putIfAbsent(3, "Hibernate");
		ht1.getOrDefault(5, "NA");
		ht1.clear();

		System.out.println("Hashtable Demo Completed");
	}

}
