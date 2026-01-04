package AssignmentFour.miniproject3;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {

		if (!Login.authenticate())
			return;

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n1.Add Student");
			System.out.println("2.Display All");
			System.out.println("3.Search by Eno");
			System.out.println("4.Update Branch");
			System.out.println("5.Delete by Eno");
			System.out.println("6.Display Sorted");
			System.out.println("7.Exit");

			choice = sc.nextInt();

			switch (choice) {
			case 1 -> StudentDAO.addStudent();
			case 2 -> StudentDAO.displayAll();
			case 3 -> StudentDAO.searchByEno();
			case 4 -> StudentDAO.updateBranch();
			case 5 -> StudentDAO.deleteByEno();
			case 6 -> StudentDAO.displaySorted();
			case 7 -> System.out.println("Thank You!");
			default -> System.out.println("Invalid Choice");
			}
		} while (choice != 7);
	}
}
