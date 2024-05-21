package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class DBConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users_db",
													"root","admin");
			Statement stmt;
			stmt = connection.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery("select * from users");
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + 
									rs.getString("username") + " " + 
									rs.getString("password") + " " +
									rs.getString("email"));
			}
			rs.close();
			stmt.close();
			connection.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
