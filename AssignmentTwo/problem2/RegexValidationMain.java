package AssignmentTwo.problem2;

import java.util.Scanner;

public class RegexValidationMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			while (true) {
				System.out.println("\n1. Validate Mobile Number");
				System.out.println("2. Validate Email ID");
				System.out.println("3. Validate Username");
				System.out.println("4. Validate Password");
				System.out.println("5. Exit");
				System.out.print("Enter choice: ");

				int choice = sc.nextInt();
				sc.nextLine(); // consume newline

				switch (choice) {
				case 1:
					System.out.print("Enter mobile number: ");
					String mobile = sc.nextLine();
					System.out.println(RegexValidation.validateMobile(mobile) ? "Valid Mobile Number. Welcome!"
							: "Invalid Mobile Number");
					break;

				case 2:
					System.out.print("Enter email ID: ");
					String email = sc.nextLine();
					System.out.println(
							RegexValidation.validateEmail(email) ? "Valid Email ID. Welcome!" : "Invalid Email ID");
					break;

				case 3:
					System.out.print("Enter username: ");
					String username = sc.nextLine();
					System.out.println(RegexValidation.validateUsername(username) ? "Valid Username. Welcome!"
							: "Invalid Username");
					break;

				case 4:
					System.out.print("Enter password: ");
					String password = sc.nextLine();
					System.out.println(RegexValidation.validatePassword(password) ? "Valid Password. Welcome!"
							: "Invalid Password");
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
