package AssignmentTwo.problem4;

public interface EmployeeOperations {
	void addEmployee(Employee e);
    void displayEmployees();
    Employee searchEmployee(String empId);
    void removeEmployee(String empId);
}
