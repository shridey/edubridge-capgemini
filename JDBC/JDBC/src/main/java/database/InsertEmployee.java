package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Load the Driver
		String driverPath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/edubridge";
		String username = "root";
		String password = "root";
		
		Class.forName(driverPath);
		
		// Make the Connection
		Connection connnection = DriverManager.getConnection(url, username, password);
		
		if (connnection != null) {
			System.out.println("Connected to MySQL Database: " + connnection.toString());
		} else {
			System.out.println("Something went wrong!");
		}
		
		// Create a Statement
		Statement statement = connnection.createStatement();
		
		// Execute Query
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter dob: ");
		String dob = sc.nextLine();
		
		System.out.print("Enter email: ");
		String email = sc.nextLine();
		
		System.out.print("Enter salary: ");
		float salary = sc.nextFloat();
		
		System.out.print("Enter Department ID: ");
		int did = sc.nextInt();
		
		sc.close();
		
		String statementString = "INSERT INTO employees (ename, edob, email, esalary, did) values ('" + name + "', '" + dob + "', '" + email + "', " + salary + ", " + did + ");";
		System.out.println(statementString);
		
		int rowsAffected = statement.executeUpdate(statementString);
		
		if (rowsAffected > 0) {
			System.out.println("Inserted Successfully!");
		} else {
			System.out.println("Something went wrong!");
		}
		
		// Close the Connection
		connnection.close();
	}

}
