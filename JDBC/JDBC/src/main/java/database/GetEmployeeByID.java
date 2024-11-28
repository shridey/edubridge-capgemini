package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GetEmployeeByID {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Load the Driver
		String driverPath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/edubridge";
		String username = "root";
		String password = "root";
		
		Class.forName(driverPath);
		
		// Make the Connection
		Connection conn = DriverManager.getConnection(url, username, password);
		
		if (conn != null) {
			System.out.println("Connected to MySQL Database: " + conn.toString());
		} else {
			System.out.println("Something went wrong!");
		}
		
		// Create a Statement
		Statement statement = conn.createStatement();
		
		// Execute Query
		Scanner sc = new Scanner(System.in);
		
		int inputID = sc.nextInt();
		sc.close();
		String statementString = "SELECT * FROM employees where eid = " + inputID;
		
		ResultSet resultSet = statement.executeQuery(statementString);
		
		if(resultSet.next()) {
			System.out.println("eid" + "\t" + "ename" + "\t" + "edob" + "\t\t" + "email" + "\t\t\t" + "esalary");
			int id = resultSet.getInt("eid");
			String name = resultSet.getString("ename");
			String dob = resultSet.getString("edob");
			String email = resultSet.getString("email");
			double salary = resultSet.getDouble("esalary");
			if (name.contains("Deepika")) {
				System.out.println(id + "\t" + name + "\t" + dob + "\t" + email + "\t" + salary);
			} else {
				System.out.println(id + "\t" + name + "\t" + dob + "\t" + email + "\t\t" + salary);
			}
		} else {
			System.out.println(inputID + " not found!");
		}
		
		// Close the Connection
		conn.close();
	}

}
