package com.friends.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Scanner;
//import java.sql.Statement;

public class ConnectionUtils {
	
	private static Connection connection;
//	private static Statement statement;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	
	static {
		try {
			connection = MySQLConnection.getConnection();
//			statement = connection.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * int friend_id;
	 * String friend_name;
	 * float friend_age;
	 * String friends_dob;
	 * String friend_email;
	 * long friend_phone;
	 */
	
	public static void displayFriends() {
		String queryString = "SELECT * FROM friends;";
		
		try {
//			resultSet = statement.executeQuery(queryString);
			
			preparedStatement = connection.prepareStatement(queryString);
			resultSet = preparedStatement.executeQuery();
			
//			System.out.println("friend_id" + "\t" + "friend_name" + "\t" + "friend_email" + "\t\t" + "friend_phone" + "\t" + "friend_dob" + "\t" + "friend_age");
			System.out.printf("|%-12s|%-20s|%-30s|%-15s|%-12s|%-10s|", "friend_id", "friend_name", "friend_email", "friend_phone", "friend_dob", "friend_age");
			System.out.println();
			while(resultSet.next()) {
				int friendId = resultSet.getInt("friend_id"); //rs.getInt(1);
				String friendName = resultSet.getString("friend_name");
				String friendEmail = resultSet.getString("friend_email");
				long friendPhone = resultSet.getLong("friend_phone");
				String friendDOB = resultSet.getString("friend_dob");
				float friendAge = resultSet.getFloat("friend_age");
//				System.out.println(friendId + "\t\t" + friendName + "\t" + friendEmail + "\t\t" + friendPhone + "\t" + friendDOB + "\t" + friendAge);
				System.out.printf("|%-12s|%-20s|%-30s|%-15s|%-12s|%-10s|", friendId, friendName, friendEmail, friendPhone, friendDOB, friendAge);
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void displayFriends(String friendName) {
//		String queryString = "SELECT * FROM friends WHERE friend_name = '" + friendName + "';";
		String queryString = "SELECT * FROM friends WHERE friend_name = ?";
		
		try {
//			resultSet = statement.executeQuery(queryString);
			
			preparedStatement = connection.prepareStatement(queryString);
			preparedStatement.setString(1, friendName);
			
			resultSet = preparedStatement.executeQuery();
			
//			System.out.println("friend_id" + "\t" + "friend_name" + "\t" + "friend_email" + "\t\t" + "friend_phone" + "\t" + "friend_dob" + "\t" + "friend_age");
			System.out.printf("|%-12s|%-20s|%-30s|%-15s|%-12s|%-10s|", "friend_id", "friend_name", "friend_email", "friend_phone", "friend_dob", "friend_age");
			System.out.println();
			while(resultSet.next()) {
				int friendId = resultSet.getInt("friend_id");
				String friendEmail = resultSet.getString("friend_email");
				long friendPhone = resultSet.getLong("friend_phone");
				String friendDOB = resultSet.getString("friend_dob");
				float friendAge = resultSet.getFloat("friend_age");
//				System.out.println(friendId + "\t\t" + friendName + "\t" + friendEmail + "\t\t" + friendPhone + "\t" + friendDOB + "\t" + friendAge);
				System.out.printf("|%-12s|%-20s|%-30s|%-15s|%-12s|%-10s|", friendId, friendName, friendEmail, friendPhone, friendDOB, friendAge);
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void displayFriend(int friendId) {
//		String queryString = "SELECT * FROM friends WHERE friend_id = " + friendId + ";";
		String queryString = "SELECT * FROM friends WHERE friend_id = ?";
		
		try {
//			resultSet = statement.executeQuery(queryString);
			
			preparedStatement = connection.prepareStatement(queryString);
			preparedStatement.setInt(1, friendId);
			
			resultSet = preparedStatement.executeQuery();
			
//			System.out.println("friend_id" + "\t" + "friend_name" + "\t" + "friend_email" + "\t\t" + "friend_phone" + "\t" + "friend_dob" + "\t" + "friend_age");
			System.out.printf("|%-12s|%-20s|%-30s|%-15s|%-12s|%-10s|", "friend_id", "friend_name", "friend_email", "friend_phone", "friend_dob", "friend_age");
			System.out.println();
			if(resultSet.next()) {
				String friendName = resultSet.getString("friend_name");
				String friendEmail = resultSet.getString("friend_email");
				long friendPhone = resultSet.getLong("friend_phone");
				String friendDOB = resultSet.getString("friend_dob");
				float friendAge = resultSet.getFloat("friend_age");
//				System.out.println(friendId + "\t\t" + friendName + "\t" + friendEmail + "\t\t" + friendPhone + "\t" + friendDOB + "\t" + friendAge);
				System.out.printf("|%-12s|%-20s|%-30s|%-15s|%-12s|%-10s|", friendId, friendName, friendEmail, friendPhone, friendDOB, friendAge);
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void displayFriend(String friendEmail) {
//		String queryString = "SELECT * FROM friends WHERE friend_email = '" + friendEmail + "';";
		String queryString = "SELECT * FROM friends WHERE friend_email = ?";
		
		try {
//			resultSet = statement.executeQuery(queryString);
			
			preparedStatement = connection.prepareStatement(queryString);
			preparedStatement.setString(1, friendEmail);
			
			resultSet = preparedStatement.executeQuery();
			
//			System.out.println("friend_id" + "\t" + "friend_name" + "\t" + "friend_email" + "\t\t" + "friend_phone" + "\t" + "friend_dob" + "\t" + "friend_age");
			System.out.printf("|%-12s|%-20s|%-30s|%-15s|%-12s|%-10s|", "friend_id", "friend_name", "friend_email", "friend_phone", "friend_dob", "friend_age");
			System.out.println();
			if(resultSet.next()) {
				int friendId = resultSet.getInt("friend_id");
				String friendName = resultSet.getString("friend_name");
				long friendPhone = resultSet.getLong("friend_phone");
				String friendDOB = resultSet.getString("friend_dob");
				float friendAge = resultSet.getFloat("friend_age");
//				System.out.println(friendId + "\t\t" + friendName + "\t" + friendEmail + "\t\t" + friendPhone + "\t" + friendDOB + "\t" + friendAge);
				System.out.printf("|%-12s|%-20s|%-30s|%-15s|%-12s|%-10s|", friendId, friendName, friendEmail, friendPhone, friendDOB, friendAge);
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void displayFriend(long friendPhone) {
//		String queryString = "SELECT * FROM friends WHERE friend_phone = " + friendPhone + ";";
		String queryString = "SELECT * FROM friends WHERE friend_phone = ?";
		
		try {
//			resultSet = statement.executeQuery(queryString);
			
			preparedStatement = connection.prepareStatement(queryString);
			preparedStatement.setLong(1, friendPhone);
			
			resultSet = preparedStatement.executeQuery();
			
//			System.out.println("friend_id" + "\t" + "friend_name" + "\t" + "friend_email" + "\t\t" + "friend_phone" + "\t" + "friend_dob" + "\t" + "friend_age");
			System.out.printf("|%-12s|%-20s|%-30s|%-15s|%-12s|%-10s|", "friend_id", "friend_name", "friend_email", "friend_phone", "friend_dob", "friend_age");
			System.out.println();
			if(resultSet.next()) {
				int friendId = resultSet.getInt("friend_id");
				String friendName = resultSet.getString("friend_name");
				String friendEmail = resultSet.getString("friend_email");
				String friendDOB = resultSet.getString("friend_dob");
				float friendAge = resultSet.getFloat("friend_age");
//				System.out.println(friendId + "\t\t" + friendName + "\t" + friendEmail + "\t\t" + friendPhone + "\t" + friendDOB + "\t" + friendAge);
				System.out.printf("|%-12s|%-20s|%-30s|%-15s|%-12s|%-10s|", friendId, friendName, friendEmail, friendPhone, friendDOB, friendAge);
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean insertFriend(String friendName, String friendEmail, long friendPhone, String friendDOB, float friendAge) {
//		String validateEmail = "SELECT * FROM friends WHERE friend_email = '" + friendEmail + "';";
//		String validatePhone = "SELECT * FROM friends WHERE friend_phone = '" + friendPhone + "';";
		String validateEmail = "SELECT * FROM friends WHERE friend_email = ?";
		String validatePhone = "SELECT * FROM friends WHERE friend_phone = ?";
		
		boolean isInserted = false;
		
		try {
//			ResultSet emailResultSet = statement.executeQuery(validateEmail);
//			ResultSet phoneResultSet = statement.executeQuery(validatePhone);
			
			preparedStatement = connection.prepareStatement(validateEmail);
			preparedStatement.setString(1, friendEmail);
			
			ResultSet emailResultSet = preparedStatement.executeQuery();
			
			preparedStatement = connection.prepareStatement(validatePhone);
			preparedStatement.setLong(1, friendPhone);
			
			ResultSet phoneResultSet = preparedStatement.executeQuery();
			
			if (!emailResultSet.next() && !phoneResultSet.next()) {
//				String statementString = "INSERT INTO friends (friend_name, friend_email, friend_phone, friend_dob, friend_age) values ('" + friendName + "', '" + friendEmail + "', " + friendPhone + ", '" + friendDOB + "', " + friendAge + ");";
				String statementString = "INSERT INTO friends (friend_name, friend_email, friend_phone, friend_dob, friend_age) values (?, ?, ?, ?, ?)";
				
				preparedStatement = connection.prepareStatement(statementString);
				preparedStatement.setString(1, friendName);
				preparedStatement.setString(2, friendEmail);
				preparedStatement.setLong(3, friendPhone);
				preparedStatement.setString(4, friendDOB);
				preparedStatement.setFloat(5, friendAge);
				
//				int rowsAffected = statement.executeUpdate(statementString);
				int rowsAffected = preparedStatement.executeUpdate();
				
				if (rowsAffected > 0) {
					isInserted = true;
				} else {
					System.out.println("Something went wrong while insertion!");
				}
			} else {
				System.out.println("Cannot insert friend: Duplicate email or phone");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isInserted;
	}
	
	public static boolean updateFriend(int friendId) throws NumberFormatException, IOException {
//		String validate = "SELECT * FROM friends WHERE friend_id = '" + friendId + "';";
		String validate = "SELECT * FROM friends WHERE friend_id = ?";
		
		boolean isUpdated = false;
		
		try {
//			ResultSet emailResultSet = statement.executeQuery(validate);
			
			preparedStatement = connection.prepareStatement(validate);
			preparedStatement.setInt(1, friendId);
			
			resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
//				Scanner sc = new Scanner(System.in);
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Select a field to update:");
				System.out.println("1. Friend's name");
				System.out.println("2. Friend's email");
				System.out.println("3. Friend's phone");
				System.out.println("4. Friend's dob");
				System.out.println("5. Friend's age");
				System.out.println("6. Friend's everything");
				System.out.print("Input: ");
				char field = reader.readLine().charAt(0);
				
				System.out.println();
				
				String statementString = null;
				boolean isUpdateEverything = false;
				
				switch (field) {
					case '1':
						System.out.print("New name: ");
						String name = reader.readLine();
						
//						statementString = "UPDATE friends SET friend_name = '" + name + "' WHERE friend_id = " + friendId + ";";
						statementString = "UPDATE friends SET friend_name = ? WHERE friend_id=?";
						
						preparedStatement = connection.prepareStatement(statementString);
						preparedStatement.setString(1, name);
						break;
					case '2':
						System.out.print("New email: ");
						String email = reader.readLine();
						
//						statementString = "UPDATE friends SET friend_email = '" + email + "' WHERE friend_id = " + friendId + ";";
						statementString = "UPDATE friends SET friend_email = ? WHERE friend_id=?";
						
						preparedStatement = connection.prepareStatement(statementString);
						preparedStatement.setString(1, email);
						break;
					case '3':
						System.out.print("New phone: ");
						long phone = Long.parseLong(reader.readLine());
						
//						statementString = "UPDATE friends SET friend_phone = " + phone + " WHERE friend_id = " + friendId + ";";
						statementString = "UPDATE friends SET friend_phone = ? WHERE friend_id=?";
						
						preparedStatement = connection.prepareStatement(statementString);
						preparedStatement.setLong(1, phone);
						break;
					case '4':
						System.out.print("New dob (yyyy-mm-dd): ");
						String dob = reader.readLine();
						
//						statementString = "UPDATE friends SET friend_dob = '" + dob + "' WHERE friend_id = " + friendId + ";";
						statementString = "UPDATE friends SET friend_dob = ? WHERE friend_id=?";
						
						preparedStatement = connection.prepareStatement(statementString);
						preparedStatement.setString(1, dob);
						break;
					case '5':
						System.out.print("New age: ");
						float age = Float.parseFloat(reader.readLine());
						
//						statementString = "UPDATE friends SET friend_age = '" + age + "' WHERE friend_id = " + friendId + ";";
						statementString = "UPDATE friends SET friend_age = ? WHERE friend_id=?";
						
						preparedStatement = connection.prepareStatement(statementString);
						preparedStatement.setFloat(1, age);
						break;
					case '6':
						isUpdateEverything = true;
						
						System.out.print("New name: ");
						name = reader.readLine();
						
						System.out.print("New email: ");
						email = reader.readLine();
						
						System.out.print("New phone: ");
						phone = Long.parseLong(reader.readLine());
						
						System.out.print("New dob (yyyy-mm-dd): ");
						dob = reader.readLine();
						
						System.out.print("New age: ");
						age = Float.parseFloat(reader.readLine());
						
//						statementString = "UPDATE friends SET friend_name = '" + name + "', friend_email = '" + email + "', friend_phone = " + phone + ", friend_dob = '" + dob + "', friend_age = " + age + " WHERE friend_id = " + friendId + ";";
						statementString = "UPDATE friends SET friend_name = ?, friend_email = ?, friend_phone = ?, friend_dob = ?, friend_age = ? WHERE friend_id=?";
						
						preparedStatement = connection.prepareStatement(statementString);
						preparedStatement.setString(1, name);
						preparedStatement.setString(2, email);
						preparedStatement.setLong(3, phone);
						preparedStatement.setString(4, dob);
						preparedStatement.setFloat(5, age);
						break;
					default:
						System.out.println("Invalid Field Choice!");
				}
				
				System.out.println();
				
//				sc.close();
//				reader.close();
				
				if (isUpdateEverything) {
					preparedStatement.setInt(6, friendId);
				} else {
					preparedStatement.setInt(2, friendId);
				}
				
//				int rowsAffected = statement.executeUpdate(statementString);
				int rowsAffected = preparedStatement.executeUpdate();
				
				if (rowsAffected > 0) {
					isUpdated = true;
				} else {
					System.out.println("Something went wrong while insertion!");
				}
			} else {
				System.out.println("Id does not exist");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isUpdated;
	}
	
	public static boolean deleteFriend(int friendId) {
//		String validate = "SELECT * FROM friends WHERE friend_id = '" + friendId + "';";
		String validate = "SELECT * FROM friends WHERE friend_id = ?";
		
		boolean isDeleted = false;
		
		try {
//			resultSet = statement.executeQuery(validate);
			
			preparedStatement = connection.prepareStatement(validate);
			preparedStatement.setInt(1, friendId);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
//				String statementString = "DELETE FROM friends WHERE friend_id = " + friendId + ";";
				String statementString = "DELETE FROM friends WHERE friend_id = ?";
				
				preparedStatement = connection.prepareStatement(statementString);
				preparedStatement.setInt(1, friendId);
				
//				int rowsAffected = statement.executeUpdate(statementString);
				int rowsAffected = preparedStatement.executeUpdate();
				
				if (rowsAffected > 0) {
					isDeleted = true;
				} else {
					System.out.println("Something went wrong while deletion!");;
				}
			} else {
				System.out.println("ID does not exist!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isDeleted;
	}
	
	public static boolean deleteFriend(String friendEmail) {
//		String validate = "SELECT * FROM friends WHERE friend_email = '" + friendEmail + "';";
		String validate = "SELECT * FROM friends WHERE friend_email = ?";
		
		boolean isDeleted = false;
		
		try {
//			resultSet = statement.executeQuery(validate);
			
			preparedStatement = connection.prepareStatement(validate);
			preparedStatement.setString(1, friendEmail);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
//				String statementString = "DELETE FROM friends WHERE friend_email = " + friendEmail + ";";
				String statementString = "DELETE FROM friends WHERE friend_email = ?";
				
				preparedStatement = connection.prepareStatement(statementString);
				preparedStatement.setString(1, friendEmail);
				
//				int rowsAffected = statement.executeUpdate(statementString);
				int rowsAffected = preparedStatement.executeUpdate();
				
				if (rowsAffected > 0) {
					isDeleted = true;
				} else {
					System.out.println("Something went wrong while deletion!");;
				}
			} else {
				System.out.println("Email does not exist!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isDeleted;
	}
	
	public static boolean deleteFriend(long friendPhone) {
//		String validate = "SELECT * FROM friends WHERE friend_phone = '" + friendPhone + "';";
		String validate = "SELECT * FROM friends WHERE friend_phone = ?";
		
		boolean isDeleted = false;
		
		try {
//			resultSet = statement.executeQuery(validate);
			
			preparedStatement = connection.prepareStatement(validate);
			preparedStatement.setLong(1, friendPhone);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
//				String statementString = "DELETE FROM friends WHERE friend_phone = " + friendPhone + ";";
				String statementString = "DELETE FROM friends WHERE friend_phone = ?";
				
				preparedStatement = connection.prepareStatement(statementString);
				preparedStatement.setLong(1, friendPhone);
				
//				int rowsAffected = statement.executeUpdate(statementString);
				int rowsAffected = preparedStatement.executeUpdate();
				
				if (rowsAffected > 0) {
					isDeleted = true;
				} else {
					System.out.println("Something went wrong while deletion!");;
				}
			} else {
				System.out.println("Phone does not exist!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isDeleted;
	}
}
