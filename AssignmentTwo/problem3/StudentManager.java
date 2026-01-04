package AssignmentTwo.problem3;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class StudentManager implements StudentOperations {
	private List<Student> students;

	public StudentManager(List<Student> students) {
		this.students = students;
	}

	// REGEX: Roll No = S followed by 3 digits (e.g., S101)
	private boolean isValidRoll(String rollNo) {
		return Pattern.matches("S[0-9]{3}", rollNo);
	}

	@Override
	public void addStudent(Student s) {
		students.add(s);
		System.out.println("Student added successfully.");
	}

	@Override
	public void displayStudents() {
		if (students.isEmpty()) {
			System.out.println("No student records found.");
			return;
		}
		for (Student s : students) {
			System.out.println(s);
		}
	}

	@Override
	public void removeStudent(String rollNo) {
		Iterator<Student> it = students.iterator();
		while (it.hasNext()) {
			if (it.next().getRollNo().equals(rollNo)) {
				it.remove();
				System.out.println("Student removed.");
				return;
			}
		}
		System.out.println("Student not found.");
	}

	@Override
	public Student searchStudent(String rollNo) {
		for (Student s : students) {
			if (s.getRollNo().equals(rollNo)) {
				return s;
			}
		}
		return null;
	}

	public boolean validateRoll(String rollNo) {
		return isValidRoll(rollNo);
	}
}
