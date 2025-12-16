package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program01 {
	private static final String URL = "jdbc:mysql://localhost:3306/internship_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "manager";

	public static Connection getconnection() throws SQLException {
		
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

	public static void addStudent() {
		String name = "Suresh";
		String email = "Suresh@gmail.com";
		String course = "Java";

		String query = "INSERT INTO students(name,email,course) VALUES (?,?,?)";

		try {
			Connection connection = getconnection();
			PreparedStatement st = connection.prepareStatement(query);
			st.setString(1,name);
			st.setString(2,email);
			st.setString(3, course);
			st.executeUpdate();
			connection.close();
			st.close();
			System.out.println("Entry added successfully !");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void updateStudent() {
		String Query = "update STUDENTS set NAME = 'ICE CREAM' WHERE ROLLNO = 7";
		try {
			Connection connection = getconnection();
			PreparedStatement ST = connection.prepareStatement(Query);
			ST.executeUpdate();
			
			ST.close();
			connection.close();
			System.out.println("Successfully Updated !");

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void getAllStudent() {
		String Query = "SELECT * FROM STUDENTS";
		try {
			Connection connection = getconnection();
			PreparedStatement selectedStatement = connection.prepareStatement(Query);
			ResultSet rs = selectedStatement.executeQuery();
			while(rs.next()) {
				int rollno = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String course = rs.getString(5);
				
				System.out.println(rollno+" - "+ " - "+name + " - "+email +" - "+course );
			}
			
			selectedStatement.close();
			connection.close();;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteStudent() {
		String Query = "DELETE FROM STUDENTS WHERE ROLLNO = 6";
		try {
			Connection connection = getconnection();
			PreparedStatement st = connection.prepareStatement(Query);
			st.executeUpdate();
			st.close();
			connection.close();
			System.out.println("Successfully deleted !");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		updateStudent();
		addStudent();
		
		deleteStudent();
		getAllStudent();
	}

}
