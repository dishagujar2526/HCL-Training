package AssignmentTwo.problem3;

public class Student {

	private String rollNo;
	private String name;
	private int age;

	public Student(String rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public String getRollNo() {
		return rollNo;
	}

	@Override
	public String toString() {
		return "RollNo: " + rollNo + ", Name: " + name + ", Age: " + age;
	}

}
