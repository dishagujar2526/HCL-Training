package AssignmentTwo.project2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagementSystem {
	private static final String FILE_NAME = "employees.dat";
	private static Map<Integer, Employee> empMap = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		loadFromFile();

		if (!AuthService.login(sc)) {
			System.out.println("Invalid Login. Access Denied.");
			return;
		}

		int choice;
		do {
			System.out.println(
					"\n1.Add Employee\n2.Display All Employees\n3.Search Employee by ID\n4.Update Employee Salary\n5.Delete Employee\n6.Display Sorted Employees\n7.Display Departments\n8.Exit");
			choice = sc.nextInt();

			try {
				switch (choice) {
				case 1 -> addEmployee(sc);
				case 2 -> displayAll();
				case 3 -> searchEmployee(sc);
				case 4 -> updateSalary(sc);
				case 5 -> deleteEmployee(sc);
				case 6 -> displaySorted();
				case 7 -> displayDepartments();
				case 8 -> saveToFile();
				default -> System.out.println("Invalid Choice");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		} while (choice != 8);
	}

	private static void addEmployee(Scanner sc) throws Exception {
		System.out.print("ID: ");
		int id = sc.nextInt();
		if (empMap.containsKey(id))
			throw new Exception("Employee ID must be unique");

		System.out.print("Name: ");
		String name = sc.next();

		System.out.print("Salary: ");
		double salary = sc.nextDouble();
		if (salary <= 0)
			throw new Exception("Salary must be positive");

		System.out.print("Department: ");
		String dept = sc.next();
		if (dept.isEmpty())
			throw new Exception("Department cannot be empty");

		empMap.put(id, new Employee(id, name, salary, dept));
		saveToFile();
		System.out.println("Employee Added");
	}

	private static void displayAll() {
		empMap.values().forEach(System.out::println);
	}

	private static void searchEmployee(Scanner sc) {
		System.out.print("Enter ID: ");
		int id = sc.nextInt();
		System.out.println(empMap.getOrDefault(id, null));
	}

	private static void updateSalary(Scanner sc) throws Exception {
		System.out.print("ID: ");
		int id = sc.nextInt();
		if (!empMap.containsKey(id))
			throw new Exception("Employee not found");

		System.out.print("New Salary: ");
		double sal = sc.nextDouble();
		if (sal <= 0)
			throw new Exception("Salary must be positive");

		empMap.get(id).setSalary(sal);
		saveToFile();
		System.out.println("Salary Updated");
	}

	private static void deleteEmployee(Scanner sc) throws Exception {
		System.out.print("ID: ");
		int id = sc.nextInt();
		if (empMap.remove(id) == null)
			throw new Exception("Employee not found");
		saveToFile();
		System.out.println("Employee Deleted");
	}

	private static void displaySorted() {
		List<Employee> list = new ArrayList<>(empMap.values());
		Collections.sort(list);
		list.forEach(System.out::println);
	}

	private static void displayDepartments() {
		empMap.values().stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

	private static void saveToFile() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			oos.writeObject(empMap);
		} catch (IOException e) {
			System.out.println("File Write Error");
		}
	}

	private static void loadFromFile() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
			empMap = (Map<Integer, Employee>) ois.readObject();
		} catch (Exception ignored) {
		}
	}

}
