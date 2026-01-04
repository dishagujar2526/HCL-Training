package AssignmentTwo.project2;

import java.util.Scanner;

public class AuthService {
	private static final String USERNAME = "admin";
	private static final String PASSWORD = "admin123";

	public static boolean login(Scanner sc) {
		System.out.print("Username: ");
		String u = sc.next();
		System.out.print("Password: ");
		String p = sc.next();
		return USERNAME.equals(u) && PASSWORD.equals(p);
	}

}
