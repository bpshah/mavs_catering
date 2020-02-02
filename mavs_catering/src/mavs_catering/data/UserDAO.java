package mavs_catering.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import masv_catering.model.User;
import mavs_catering.util.SQLConnection;

public class UserDAO {
static SQLConnection DBMgr = SQLConnection.getInstance();
	
	public static void registerUser(User user) {
		Statement stmt = null;   
		Connection conn = SQLConnection.getDBConnection();  
		String registerUser = "INSERT INTO USER (username, password, role, utaid, firstname, lastname, phone, email, streetname, streetno, city, state, zipcode) ";					
		registerUser += " VALUES ('"  
				+ user.getUsername() + "','"
				+ user.getPassword() + "','"		
				+ user.getRole() + "','"
				+ user.getUtaId() + "','" 
				+ user.getFirstName() + "','"
				+ user.getLastName() + "',"
				+ user.getPhone() + ",'"		
				+ user.getEmail() + "','"
				+ user.getStreetName() + "','"
				+ user.getStreetNumber() + "','"
				+ user.getCity() + "','"
				+ user.getState() + "','"
				+ user.getZipcode() + "')" ;
		System.out.println("Query: "+registerUser);
		
		try {   
		conn = SQLConnection.getDBConnection();  
		conn.setAutoCommit(false);   
		stmt = conn.createStatement();
		stmt.executeUpdate(registerUser);
		System.out.println(registerUser);
		conn.commit();					 
	} catch (SQLException sqle) { 
		sqle.printStackTrace();
	} finally {
		try {
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		};
	}
	}
	public static boolean uniqueUsername(String username) {  
		Statement stmt = null;   
		Connection conn = null;  
		try {   
			conn = SQLConnection.getDBConnection();  
			stmt = conn.createStatement();
			String searchUsername = " SELECT * from USER WHERE USERNAME = '"+username+"'";
			ResultSet userList = stmt.executeQuery(searchUsername);
			ArrayList<User> userListInDB = new ArrayList<User>();
			while (userList.next()) {
				User user = new User(); 
				userListInDB.add(user);	 
			} 
			return (userListInDB.isEmpty());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			};
		return false;
	}
	
	public static User getUser(String username) {
		Statement stmt = null;   
		Connection conn = null;  
		User user = new User();
		try {   
			conn = SQLConnection.getDBConnection();  
			stmt = conn.createStatement();
			String searchUsername = " SELECT * from USER WHERE USERNAME = '"+username+"'";
			ResultSet userList = stmt.executeQuery(searchUsername);
			while(userList.next()) {
				String password = userList.getString("password");
				String role  = userList.getString("role");
				String utaId = userList.getString("utaid");
				String firstName  = userList.getString("firstname");
				String lastName  = userList.getString("lastname");
				String phone = userList.getString("phone");
				String email  = userList.getString("email");
				String streetname  = userList.getString("streetname");
				String streetno  = userList.getString("streetno");
				String city  = userList.getString("city");
				String state  = userList.getString("state");
				String zipcode  = userList.getString("zipcode");
				user.setUser( username, password, role, utaId, firstName, lastName,phone, email, streetname, streetno, city, state, zipcode);				  	
			}
			
			} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			};
		return user;
	}

}
