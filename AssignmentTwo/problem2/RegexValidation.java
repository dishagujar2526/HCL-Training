package AssignmentTwo.problem2;

import java.util.regex.Pattern;

public class RegexValidation {

	// Mobile number: starts with 6-9 and 10 digits
	public static boolean validateMobile(String mobile) {
		return Pattern.matches("[6-9][0-9]{9}", mobile);
	}

	// Email ID validation
	public static boolean validateEmail(String email) {
		return Pattern.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}", email);
	}

	// Username: 5–15 characters
	public static boolean validateUsername(String username) {
		return Pattern.matches("[a-zA-Z0-9_]{5,15}", username);
	}

	// Password: min 8 chars, upper, lower, digit, special char
	public static boolean validatePassword(String password) {
		return Pattern.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}", password);
	}

}
