package mavs_catering.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class SQLConnection {
	private static String DB_DRIVER;
	private static String DB_CONNECTION;
	private static String DB_USER;
	private static String DB_PASSWORD; 
	private static SQLConnection single_instance = null;
	private SQLConnection() {
		DB_DRIVER = "com.mysql.jdbc.Driver";
		DB_CONNECTION  = "jdbc:mysql://localhost:3306/mavs_catering";
		DB_USER  = "root";
		DB_PASSWORD = "Rishi1$1";
	}
	public static synchronized SQLConnection getInstance() {
        if (single_instance == null)
        	single_instance = new SQLConnection();
        System.out.println("connection"+single_instance);
        return single_instance;
	}

	public static Connection getDBConnection() {	
		Connection dbConnection = null;	 

		try {	 
			Class.forName(DB_DRIVER);	 
		} catch (ClassNotFoundException e) {	
			System.out.println("creating class");
			e.printStackTrace();
		}

		try {	 
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASSWORD);
			dbConnection.setAutoCommit(false);
		} catch (SQLException e) {	
			System.out.println("getting conn class");
			e.printStackTrace();

		}	 
		return dbConnection;	 
	}
}