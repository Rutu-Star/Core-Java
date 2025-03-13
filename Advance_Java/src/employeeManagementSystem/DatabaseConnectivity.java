package employeeManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity {
	
	static String url="jdbc:mysql://localhost:3306/shopingcarddb";
	static String user="Rutu";
	static String password="Rutu@123";
	


	public DatabaseConnectivity() throws SQLException {
		// TODO Auto-generated constructor stub
		Connection con=DriverManager.getConnection(url, user, password);
		System.out.println("Connection Created Successfully !!!");
		
	}
	


	
}
