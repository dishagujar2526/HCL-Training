package AssignmentFour.miniproject3;

import java.util.Scanner;

public class Login {
	public static boolean authenticate() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Username: ");
		String user = sc.next();

		System.out.print("Enter Password: ");
		String pass = sc.next();

		if (user.equals("root") && pass.equals("admindisha26")) {
			System.out.println("Login Successful\n");
			return true;
		} else {
			System.out.println("Invalid Credentials!");
			return false;
		}
	}
}
