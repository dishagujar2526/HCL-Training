package AssignmentThree;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {

		// Constructors
		Vector<String> v1 = new Vector<>();
		Vector<String> v2 = new Vector<>(5);
		Vector<String> v3 = new Vector<>(5, 3);
		Vector<String> v4 = new Vector<>(Arrays.asList("A", "B"));

		// Methods
		v1.add("Java");
		v1.addElement("Python");
		v1.add(1, "C++");
		v1.get(0);
		v1.set(0, "JavaSE");
		v1.remove("C++");
		v1.removeElementAt(0);
		v1.contains("Python");
		v1.indexOf("Python");
		v1.capacity();
		v1.size();
		v1.firstElement();
		v1.lastElement();
		v1.toArray();
		v1.clear();

		System.out.println("Vector Demo Completed");
	}

}
