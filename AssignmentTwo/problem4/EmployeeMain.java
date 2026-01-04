package AssignmentTwo.problem4;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, Employee> map;

		System.out.println("Choose Map Implementation:");
		System.out.println("1. HashMap");
		System.out.println("2. Hashtable");
		System.out.println("3. TreeMap");
		System.out.print("Enter choice: ");

		int mapChoice = sc.nextInt();
		sc.nextLine();

		switch (mapChoice) {
		case 1:
			map = new HashMap<>();
			break;
		case 2:
			map = new Hashtable<>();
			break;
		case 3:
			map = new TreeMap<>();
			break;
		default:
			System.out.println("Invalid choice. Using HashMap.");
			map = new HashMap<>();
		}

		EmployeeManager manager = new EmployeeManager(map);

		try {
			while (true) {
				System.out.println("\n1. Add Employee");
				System.out.println("2. Display Employees");
				System.out.println("3. Search Employee");
				System.out.println("4. Remove Employee");
				System.out.println("5. Demonstrate Null Support");
				System.out.println("6. Exit");
				System.out.print("Enter choice: ");

				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					System.out.print("Enter Emp ID (E123): ");
					String id = sc.nextLine();

					if (!manager.validateEmpId(id)) {
						System.out.println("Invalid Employee ID format.");
						break;
					}

					System.out.print("Enter Name: ");
					String name = sc.nextLine();

					System.out.print("Enter Salary: ");
					double salary = sc.nextDouble();

					manager.addEmployee(new Employee(id, name, salary));
					break;

				case 2:
					manager.displayEmployees();
					break;

				case 3:
					System.out.print("Enter Emp ID to search: ");
					Employee e = manager.searchEmployee(sc.nextLine());
					System.out.println(e != null ? e : "Employee not found.");
					break;

				case 4:
					System.out.print("Enter Emp ID to remove: ");
					manager.removeEmployee(sc.nextLine());
					break;

				case 5:
					manager.demonstrateNullSupport();
					break;

				case 6:
					System.out.println("Exiting...");
					sc.close();
					return;

				default:
					System.out.println("Invalid choice");
				}
			}
		} catch (Exception ex) {
			System.out.println("Invalid input. Please try again.");
		}
	}

}
