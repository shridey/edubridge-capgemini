package com.friends.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
	
	public static String driverPathString = "com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/edubridge";
	public static String username = "root";
	public static String password = "root";
	
	public static Connection connection;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName(driverPathString);
		
		// Make the Connection
		if (connection != null) {
			System.out.println("Connected to MySQL Database: " + connection.toString());
		} else {
			connection = DriverManager.getConnection(url, username, password);
		}
		
		return connection;
	}
}
