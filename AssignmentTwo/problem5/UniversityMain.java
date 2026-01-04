package AssignmentTwo.problem5;

import java.util.Scanner;

public class UniversityMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentManager manager = new StudentManager();

		try {
			while (true) {
				System.out.println("\n1.Add Student");
				System.out.println("2.Display Students");
				System.out.println("3.Search Student");
				System.out.println("4.Remove Student");
				System.out.println("5.Sort by Marks");
				System.out.println("6.Convert HashMap to TreeMap");
				System.out.println("7.Count Students Course-wise");
				System.out.println("8.Display Unique Courses");
				System.out.println("9.Exit");
				System.out.print("Choice: ");

				int choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					System.out.print("ID (S101): ");
					String id = sc.nextLine();
					if (!manager.validateId(id)) {
						System.out.println("Invalid ID format.");
						break;
					}

					System.out.print("Name: ");
					String name = sc.nextLine();

					System.out.print("Course: ");
					String course = sc.nextLine();

					System.out.print("Marks: ");
					int marks = sc.nextInt();

					manager.addStudent(new Student(id, name, course, marks));
					break;

				case 2:
					manager.displayStudents();
					break;

				case 3:
					System.out.print("Enter ID: ");
					System.out.println(manager.searchStudent(sc.nextLine()));
					break;

				case 4:
					System.out.print("Enter ID: ");
					manager.removeStudent(sc.nextLine());
					break;

				case 5:
					manager.sortByMarks();
					break;

				case 6:
					manager.convertToTreeMap();
					break;

				case 7:
					manager.countCourseWise();
					break;

				case 8:
					manager.displayCourses();
					break;

				case 9:
					System.out.println("Exit");
					sc.close();
					return;

				default:
					System.out.println("Invalid choice");
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid input handled.");
		}
	}

}
