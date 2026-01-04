package AssignmentFour;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateStudent {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb", "root",
					"admindisha26");

			Statement st = con.createStatement();
			String sql = "UPDATE student SET name='Pam Beesly' WHERE name='Pam Helpert'";

			int rows = st.executeUpdate(sql);
			System.out.println(rows + " record updated");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
