package AssignmentTwo.problem4;

public class Employee {

	private String empId;
	private String name;
	private double salary;

	public Employee(String empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	@Override
	public String toString() {
		return "EmpID: " + empId + ", Name: " + name + ", Salary: " + salary;
	}

}
