package AssignmentThree;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public static void main(String[] args) {

		// Constructors
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>(10);
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3));

		// Methods
		list1.add(10);
		list1.add(20);
		list1.add(1, 15);
		list1.addAll(list3);
		list1.get(0);
		list1.set(0, 100);
		list1.remove(1);
		list1.contains(20);
		list1.indexOf(15);
		list1.lastIndexOf(15);
		list1.size();
		list1.isEmpty();
		list1.subList(0, 2);
		list1.toArray();
		list1.clear();

		System.out.println("ArrayList Demo Completed");
	}

}
