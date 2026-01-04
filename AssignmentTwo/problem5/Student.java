package AssignmentTwo.problem5;

public class Student {
	private String id;
	private String name;
	private String course;
	private int marks;

	public Student(String id, String name, String course, int marks) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public String getId() {
		return id;
	}

	public String getCourse() {
		return course;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return id + " | " + name + " | " + course + " | " + marks;
	}

}
