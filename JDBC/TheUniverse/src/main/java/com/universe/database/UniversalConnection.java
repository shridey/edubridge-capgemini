package com.universe.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UniversalConnection {
	
	private static String driverPathString = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/the_universe";
	private static String username = "root";
	private static String password = "root";
	
	private static Connection connection;
	
	private UniversalConnection () {
		
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName(driverPathString);
		
		// Make the Connection
		if (connection != null) {
			System.out.println("Connected to the Universe Database");
		} else {
			connection = DriverManager.getConnection(url, username, password);
		}
		
		return connection;
	}

}
