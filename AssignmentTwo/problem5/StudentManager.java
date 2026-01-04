package AssignmentTwo.problem5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;
import java.util.regex.Pattern;

public class StudentManager implements StudentOperations {
	// Core storage
    private Map<String, Student> studentMap = new HashMap<>();
    private Set<String> courseSet = new HashSet<>();
    private Stack<Student> studentStack = new Stack<>();
    private Vector<Student> studentVector = new Vector<>();

    // REGEX: Student ID = S followed by 3 digits
    public boolean validateId(String id) {
        return Pattern.matches("S[0-9]{3}", id);
    }

    @Override
    public void addStudent(Student s) {
        if (studentMap.containsKey(s.getId())) {
            System.out.println("Duplicate student not allowed.");
            return;
        }
        studentMap.put(s.getId(), s);
        courseSet.add(s.getCourse());
        studentStack.push(s);
        studentVector.add(s);
        System.out.println("Student added.");
    }

    @Override
    public void displayStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No records.");
            return;
        }
        studentMap.values().forEach(System.out::println);
    }

    @Override
    public void removeStudent(String id) {
        Student s = studentMap.remove(id);
        if (s != null) {
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

    @Override
    public Student searchStudent(String id) {
        return studentMap.get(id);
    }

    // Sort students by marks
    public void sortByMarks() {
        List<Student> list = new ArrayList<>(studentMap.values());
        list.sort(Comparator.comparingInt(Student::getMarks));
        list.forEach(System.out::println);
    }

    // Convert HashMap to TreeMap
    public void convertToTreeMap() {
        TreeMap<String, Student> treeMap = new TreeMap<>(studentMap);
        treeMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    // Count students course-wise
    public void countCourseWise() {
        Map<String, Integer> countMap = new Hashtable<>();
        for (Student s : studentMap.values()) {
            countMap.put(s.getCourse(), countMap.getOrDefault(s.getCourse(), 0) + 1);
        }
        countMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    // Display unique courses
    public void displayCourses() {
        courseSet.forEach(System.out::println);
    }
}
