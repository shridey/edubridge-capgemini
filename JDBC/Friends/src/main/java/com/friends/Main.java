package com.friends;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

import com.friends.connection.ConnectionUtils;

public class Main {

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("Select Operation:");
			System.out.println("1. Get All Friends");
			System.out.println("2. Get Friend by Id");
			System.out.println("3. Get Friend by Name");
			System.out.println("4. Get Friend by Email");
			System.out.println("5. Get Friend by Phone");
			System.out.println("6. Add A New Friend");
			System.out.println("7. Update An Existing Friend");
			System.out.println("8. Delete An Existing Friend by Id");
			System.out.println("9. Delete An Existing Friend by Phone");
			System.out.println("10. Delete An Existing Friend by Email");
			System.out.println("0. Exit");
			System.out.print("Input: ");
			int choice = Integer.parseInt(reader.readLine());
			
			System.out.println();
			
			int id = 0;
			String name = null;
			String email = null;
			long phone = 0;
			String dob = null;
			float age = 0;
			
			switch(choice) {
				case 1:
					ConnectionUtils.displayFriends();
					break;
				case 2:
					System.out.print("Enter your friend's id: ");
					id = Integer.parseInt(reader.readLine());
					
					System.out.println();
					
					ConnectionUtils.displayFriend(id);
					break;
				case 3:
					System.out.print("Enter your friend's name: ");
					name = reader.readLine();
					
					System.out.println();
					
					ConnectionUtils.displayFriends(name);
					break;
				case 4:
					System.out.print("Enter your friend's email: ");
					email = reader.readLine();
					
					System.out.println();
					
					ConnectionUtils.displayFriend(email);
					break;
				case 5:
					System.out.print("Enter your friend's phone: ");
					phone = Long.parseLong(reader.readLine());
					
					System.out.println();
					
					ConnectionUtils.displayFriend(phone);
					break;
				case 6:
					System.out.print("Enter your friend's name: ");
					name = reader.readLine();
					
					System.out.print("Enter your friend's email: ");
					email = reader.readLine();
					
					System.out.print("Enter your friend's phone: ");
					phone = Long.parseLong(reader.readLine());
					
					System.out.print("Enter your friend's dob (yyyy-mm-dd): ");
					dob = reader.readLine();
					
					System.out.print("Enter your friend's age: ");
					age = Float.parseFloat(reader.readLine());
					
					System.out.println();
					
					if(ConnectionUtils.insertFriend(name, email, phone, dob, age)) {
						System.out.println("Inserted a new friend successfully!");
					} else {
						System.out.println("There was a problem inserting your friend!");
					}
					break;
				case 7:
					System.out.print("Enter your friend's id: ");
					id = Integer.parseInt(reader.readLine());
					
					System.out.println();
					
					if(ConnectionUtils.updateFriend(id)) {
						System.out.println("Updated a friend successfully!");
					} else {
						System.out.println("There was a problem updating your friend!");
					}
					break;
				case 8:
					System.out.print("Enter your friend's id: ");
					id = Integer.parseInt(reader.readLine());
					
					System.out.println();
					
					if(ConnectionUtils.deleteFriend(id)) {
						System.out.println("Deleted a friend successfully!");
					} else {
						System.out.println("There was a problem deleting your friend!");
					}
					break;
				case 9:
					System.out.print("Enter your friend's phone: ");
					phone = Long.parseLong(reader.readLine());
					
					System.out.println();
					
					if(ConnectionUtils.deleteFriend(phone)) {
						System.out.println("Deleted a friend successfully!");
					} else {
						System.out.println("There was a problem deleting your friend!");
					}
					break;
				case 10:
					System.out.print("Enter your friend's email: ");
					email = reader.readLine();
					
					System.out.println();
					
					if(ConnectionUtils.deleteFriend(email)) {
						System.out.println("Deleted a friend successfully!");
					} else {
						System.out.println("There was a problem deleting your friend!");
					}
					break;
				case 0:
//					sc.close();
					reader.close();
					System.out.println("Exiting... Come back again!");
					return; // System.exit(0);
				default:
					System.out.println("Invalid Choice!");
			}
			
			System.out.println();
		}
	}

}
