package AssignmentFour;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteStudent {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb", "root",
					"admindisha26");

			Statement st = con.createStatement();
			String sql = "DELETE FROM student WHERE name='Chandler'";
			int rows = st.executeUpdate(sql);

			System.out.println(rows + " record deleted");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
