package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnect1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users_db",
					"root","admin");
			
			String query = "select * from users where username= ? and password=?";
			PreparedStatement myStmt = con.prepareStatement(query);
			myStmt.setString(1, "clare");
			myStmt.setString(2, "888888");
			
			ResultSet rs = myStmt.executeQuery();
			while(rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				System.out.println(username + " " + password);
			}
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
