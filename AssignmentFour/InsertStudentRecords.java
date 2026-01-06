package AssignmentFour;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudentRecords {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/schooldb";
		String user = "root";
		String password = "admindisha26";

		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();

			String insert = "INSERT INTO student(id, name) VALUES (101, 'Pam Helpert')";

			int rows = st.executeUpdate(insert);
			System.out.println(rows + " record(s) inserted successfully.");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
