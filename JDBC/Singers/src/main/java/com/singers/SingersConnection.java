package com.singers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SingersConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driverPathString = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/edubridge";
		String username = "root";
		String password = "root";
		
		Class.forName(driverPathString);
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		if (connection != null) {
			System.out.println("Connected to MySQL Database: " + connection);
		} else {
			System.out.println("Something went wrong!");
		}
		
		Statement statement = connection.createStatement();
		
		String queryString = "SELECT * FROM singers;";
		ResultSet result = statement.executeQuery(queryString);
		
		System.out.println("SingerName" + "\t" + "SingerRating");
		while (result.next()) {
			String name = result.getString("singerName");
			int rating = result.getInt("singerRating");
			
			if (name.contains("Shaan")) {
				System.out.println(name + "\t\t" + rating);
			} else {
				System.out.println(name + "\t" + rating);
			}
			
		}
	}

}
