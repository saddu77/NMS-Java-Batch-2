package jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users_db",
					"root","admin");
			
			String query = "insert into users values(?,?,?,?)";
			CallableStatement cs = con.prepareCall(query);
			cs.setInt(1, 5);
			cs.setString(2, "jimmy");
			cs.setString(3, "123456");
			cs.setString(4, "jimmy@gmail.com");
			cs.execute();
			System.out.println("Record Inserted Successfully !!! ");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
