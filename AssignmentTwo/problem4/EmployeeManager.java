package AssignmentTwo.problem4;

import java.util.Map;
import java.util.regex.Pattern;

public class EmployeeManager implements EmployeeOperations {

	private Map<String, Employee> map;

	public EmployeeManager(Map<String, Employee> map) {
		this.map = map;
	}

	// REGEX: Employee ID = E followed by 3 digits (E101)
	public boolean validateEmpId(String empId) {
		return Pattern.matches("E[0-9]{3}", empId);
	}

	@Override
	public void addEmployee(Employee e) {
		map.put(e.getEmpId(), e);
		System.out.println("Employee added.");
	}

	@Override
	public void displayEmployees() {
		if (map.isEmpty()) {
			System.out.println("No employee records.");
			return;
		}
		for (Map.Entry<String, Employee> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

	@Override
	public Employee searchEmployee(String empId) {
		return map.get(empId);
	}

	@Override
	public void removeEmployee(String empId) {
		if (map.remove(empId) != null) {
			System.out.println("Employee removed.");
		} else {
			System.out.println("Employee not found.");
		}
	}

	// Demonstrate null support
	public void demonstrateNullSupport() {
		try {
			map.put(null, null);
			System.out.println("Null key & null value allowed.");
		} catch (Exception e) {
			System.out.println("Null key/value NOT allowed in this Map.");
		}
	}

}
