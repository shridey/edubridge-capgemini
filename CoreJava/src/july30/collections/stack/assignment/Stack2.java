package july30.collections.stack.assignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Stack> stack = new ArrayList<Stack>();
		int stackCount = 0;
		ArrayList<String> stackType = new ArrayList<String>();
		
		char play = '1';
		
		do {
			System.out.println("Menu:");
			System.out.println("1. Create a new stack");
			System.out.println("2. Add members into existing stack");
			System.out.println("3. Remove members from existing stack");
			System.out.println("4. Delete the existing stack");
			System.out.println("5. Exit");
			System.out.print("Input: ");
			char choice = sc.next().charAt(0);
			
			System.out.println();
			
			switch(choice) {
				case '1': {
					char repeat = '1';
					do {
						System.out.println("Select the type of stack you want to create: ");
						System.out.println("1. Integer");
						System.out.println("2. Double");
						System.out.println("3. Character");
						System.out.println("4. String");
						System.out.println("5. Boolean");
						System.out.println("6. Default");
						System.out.print("Input: ");
						int type = sc.nextInt();
						
						switch(type) {
							case 1: {
								stack.add(new Stack<Integer>());
								stackType.add("Integer  ");
								System.out.println("A new stack is created, the id of your stack is " + (stackCount));
								stackCount++;
								break;
							}
							case 2: {
								stack.add(new Stack<Double>());
								stackType.add("Double   ");
								System.out.println("A new stack is created, the id of your stack is " + (stackCount));
								stackCount++;
								break;
							}
							case 3: {
								stack.add(new Stack<Character>());
								stackType.add("Character");
								System.out.println("A new stack is created, the id of your stack is " + (stackCount));
								stackCount++;
								break;
							}
							case 4: {
								stack.add(new Stack<String>());
								stackType.add("String   ");
								System.out.println("A new stack is created, the id of your stack is " + (stackCount));
								stackCount++;
								break;
							}
							case 5: {
								stack.add(new Stack<Boolean>());
								stackType.add("Boolean  ");
								System.out.println("A new stack is created, the id of your stack is " + (stackCount));
								stackCount++;
								break;
							}
							case 6: {
								stack.add(new Stack());
								stackType.add("Default  ");
								System.out.println("A new stack is created, the id of your stack is " + (stackCount));
								stackCount++;
								break;
							}
							default: {
								System.out.println("Invalid Type");
							}
						}
						
						System.out.println("Enter anything to create more");
						System.out.println("Enter 0 to go back to the menu");
						System.out.print("Input: ");
						repeat = sc.next().charAt(0);
					} while (repeat != '0');
					
					break;
				}
				case '2': {
					char repeat = '1';
					do {
						if (stackCount > 0) {
							System.out.println("Here are the number of stack(s) you have:");
							for (int i = 0; i < stackCount; i++) {
								System.out.println("Type: " + stackType.get(i) + " | ID " + i + ": " + stack.get(i));
							}
							
							System.out.print("Enter the ID of the stack to which you want to add member(s): ");
							int id = sc.nextInt();
							
							if (id < stackCount) {
								// TODO: Write the logic for adding members
								System.out.println("How many numbers do you want to add?");
								int count = sc.nextInt();
								for (int i = 0; i < count; i++) {
									System.out.print("Enter num " + (i+1) + ": ");
									
								}
							} else {
								System.out.println("Invalid ID");
							}
						} else {
							System.out.println("You do not have any existing stack, better create a new one!");
							break;
						}
						
						System.out.println("Enter anything to add more");
						System.out.println("Enter 0 to go back to the menu");
						System.out.print("Input: ");
						repeat = sc.next().charAt(0);
					} while (repeat != '0');
					
					break;
				}
				case '3': {
					char repeat = '1';
					do {
						if (stackCount > 0) {
							System.out.println("Here are the number of stack(s) you have:");
							for (int i = 0; i < stackCount; i++) {
								System.out.println("Type: " + stackType.get(i) + " | ID " + i + ": " + stack.get(i));
							}
							
							System.out.print("Enter the ID of the stack from which you want to remove member(s): ");
							int id = sc.nextInt();
							
							if (id < stackCount) {
								// TODO: Write the logic for removing members
							} else {
								System.out.println("Invalid ID");
							}
						} else {
							System.out.println("You do not have any existing stack, better create a new one!");
							break;
						}
						
						System.out.println("Enter anything to remove more");
						System.out.println("Enter 0 to go back to the menu");
						System.out.print("Input: ");
						repeat = sc.next().charAt(0);
					} while (repeat != '0');
					
					break;
				}
				case '4': {
					char repeat = '1';
					do {
						if (stackCount > 0) {
							System.out.println("Here are the number of stack(s) you have:");
							for (int i = 0; i < stackCount; i++) {
								System.out.println("Type: " + stackType.get(i) + " | ID " + i + ": " + stack.get(i));
							}
							
							System.out.print("Enter the ID of the stack you want to delete: ");
							int id = sc.nextInt();
							
							if (id < stackCount) {
								stack.remove(id);
								stackType.remove(id);
								stackCount--;
								System.out.println("Stack of ID " + id + " deleted successfully");
							} else {
								System.out.println("Invalid ID");
							}
						} else {
							System.out.println("You do not have any existing stack, better create a new one!");
							break;
						}
						
						System.out.println("Enter anything to delete more");
						System.out.println("Enter 0 to go back to the menu");
						System.out.print("Input: ");
						repeat = sc.next().charAt(0);
					} while (repeat != '0');
					
					break;
				}
				case '5': {
					play = '0';
					System.out.println("Come back again...");
					break;
				}
				default: {
					System.out.println("Invalid choice... Try again!");
				}
			}
			
			System.out.println();
			
		} while (play != '0');
		
		sc.close();
	}

}
