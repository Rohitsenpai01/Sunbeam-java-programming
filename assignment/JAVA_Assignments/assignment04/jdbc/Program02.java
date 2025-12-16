package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Program02 {
	private static final String URL="jdbc:mysql://localhost:3306/internship_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "manager";
	
	public static Connection getconnection() throws SQLException{
		return DriverManager.getConnection(URL,USERNAME,PASSWORD);
	}
	
	public static void addElement(){
		String sql = "INSERT INTO DEMO(COL1,COL2,COL3) VALUES (?,?,?)";
		
		try {
			Connection con = getconnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, 25);
			st.setDouble(2, 1500.00);
			st.setString(3, "Car");
			st.executeUpdate();
			st.close();
			con.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteElement() {
		String sql = "DELETE FROM DEMO WHERE COL1 = 25";
		
		try {
			Connection con = getconnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.executeUpdate();
			st.close();
			con.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void getAllData() {
		String sql = "SELECT * FROM DEMO";
		
		try {
			Connection con = getconnection();
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt(1);
				double price = rs.getDouble(2);
				String name = rs.getString(3);
				System.out.println(id +" - "+ price + " - "+name+" .");
			}
			rs.close();
			st.close();
			con.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String [] args) {
		//addElement();
		deleteElement();
		//getAllData();
	}
}
