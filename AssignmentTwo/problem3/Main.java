package AssignmentTwo.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// You can switch between ArrayList and Vector
		List<Student> list = new ArrayList<>();
		// List<Student> list = new Vector<>();

		StudentManager manager = new StudentManager(list);

		try {
			while (true) {
				System.out.println("\n1. Add Student");
				System.out.println("2. Display Students");
				System.out.println("3. Remove Student");
				System.out.println("4. Search Student");
				System.out.println("5. Exit");
				System.out.print("Enter choice: ");

				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					System.out.print("Enter Roll No (S123): ");
					String roll = sc.nextLine();

					if (!manager.validateRoll(roll)) {
						System.out.println("Invalid Roll Number format.");
						break;
					}

					System.out.print("Enter Name: ");
					String name = sc.nextLine();

					System.out.print("Enter Age: ");
					int age = sc.nextInt();

					manager.addStudent(new Student(roll, name, age));
					break;

				case 2:
					manager.displayStudents();
					break;

				case 3:
					System.out.print("Enter Roll No to remove: ");
					manager.removeStudent(sc.nextLine());
					break;

				case 4:
					System.out.print("Enter Roll No to search: ");
					Student s = manager.searchStudent(sc.nextLine());
					System.out.println(s != null ? s : "Student not found.");
					break;

				case 5:
					System.out.println("Exiting...");
					sc.close();
					return;

				default:
					System.out.println("Invalid choice");
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid input. Please try again.");
		}
	}

}
