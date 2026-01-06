package AssignmentFour;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/schooldb";
		String user = "root";
		String password = "admindisha26";

		try {
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Successful");
			con.close();
		} catch (Exception e) {
			System.out.println("Unable to connect");
		}
	}
}
