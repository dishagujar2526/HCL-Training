package AssignmentFour.miniproject3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class StudentDAO {

	static Scanner sc = new Scanner(System.in);

	// 1. Add Student
	public static void addStudent() {
		try (Connection con = DBConnection.getConnection()) {

			System.out.print("Eno: ");
			int eno = sc.nextInt();
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Branch: ");
			String branch = sc.next();
			if (branch.isEmpty())
				throw new Exception("Branch cannot be empty");

			System.out.print("Semester: ");
			int sem = sc.nextInt();

			System.out.print("Percentage: ");
			double per = sc.nextDouble();
			if (per <= 0)
				throw new Exception("Percentage must be positive");

			String sql = "INSERT INTO student_mini (eno, name, branch, sem, percentage) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, eno);
			ps.setString(2, name);
			ps.setString(3, branch);
			ps.setInt(4, sem);
			ps.setDouble(5, per);

			ps.executeUpdate();
			System.out.println("Student Added Successfully");

		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("Error: Eno must be unique");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// 2. Display All Students
	public static void displayAll() {
		try (Connection con = DBConnection.getConnection()) {
			ResultSet rs = con.createStatement().executeQuery("SELECT * FROM student_mini");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
						+ " " + rs.getDouble(5));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 3. Search by Eno
	public static void searchByEno() {
		try (Connection con = DBConnection.getConnection()) {
			System.out.print("Enter Eno: ");
			int eno = sc.nextInt();
			sc.nextLine();

			PreparedStatement ps = con.prepareStatement("SELECT * FROM student_mini WHERE eno=?");
			ps.setInt(1, eno);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			} else {
				System.out.println("Student not found");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 4. Update Branch
	public static void updateBranch() {
		try (Connection con = DBConnection.getConnection()) {
			System.out.print("Eno: ");
			int eno = sc.nextInt();
			sc.nextLine();

			System.out.print("New Branch: ");
			String branch = sc.next();
			if (branch.isEmpty())
				throw new Exception("Branch cannot be empty");

			PreparedStatement ps = con.prepareStatement("UPDATE student_mini SET branch=? WHERE eno=?");
			ps.setString(1, branch);
			ps.setInt(2, eno);

			int rows = ps.executeUpdate();
			System.out.println(rows > 0 ? "Updated" : "Student not found");

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// 5. Delete by Eno
	public static void deleteByEno() {
		try (Connection con = DBConnection.getConnection()) {
			System.out.print("Enter Eno: ");
			int eno = sc.nextInt();
			sc.nextLine();

			PreparedStatement ps = con.prepareStatement("DELETE FROM student_mini WHERE eno=?");
			ps.setInt(1, eno);

			int rows = ps.executeUpdate();
			System.out.println(rows > 0 ? "Deleted" : "Student not found");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 6. Display Sorted Students
	public static void displaySorted() {
		try (Connection con = DBConnection.getConnection()) {
			ResultSet rs = con.createStatement().executeQuery("SELECT * FROM student_mini ORDER BY percentage DESC");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(5));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
