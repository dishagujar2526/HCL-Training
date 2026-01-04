package AssignmentTwo.problem3;

public interface StudentOperations {
	void addStudent(Student s);
    void displayStudents();
    void removeStudent(String rollNo);
    Student searchStudent(String rollNo);
}
