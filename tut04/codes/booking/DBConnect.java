package connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	// declare DB connection parameters
	private static String DB_URL = "jdbc:mysql://localhost/bookingdb";
    private static String DB_USERNAME = "root";
    private static String DB_PASSWORD = "ygfamily1808";
    
    public static Connection getConnection()  {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return conn;
	}
}

