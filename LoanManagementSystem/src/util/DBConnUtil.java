package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnUtil{
	public static Connection getConnection(String props)
	{
		Connection connection=null;
		String[] properties=pros.split(" ");
		try {
			Class.forName(properties[2]);
			System.out.println("Class is loaded successfully");
			
		}catch (ClassNotFoundException e) {
			System.out.println("Class is not established");
			e.printStackTrace();
		}
		
		try {
			connection=DriverManager.getConnection(properties[3],properties[0],properties[1]);
			System.out.println("Connection is established");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}


/*import java.sql.*;

public class DBConnUtil {
    
	static Connection getDBConn() throws Exception {
    	
    		Class.forName("com.mysql.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loanmanagementsystem", "root", "WORK@#5a()svi");
		    return con;
	}

    }*/


