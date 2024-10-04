package july24.activity;

import java.util.Scanner;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		
		while (choice != 0) {
			System.out.println("What you want to do?");
			System.out.println("1. Get the sum of range of numbers");
			System.out.println("2. Convert Feets to Inches");
			System.out.println("3. Basic Calculator");
			System.out.println("0. Quit");
			System.out.print("Input: ");
			
			choice = sc.nextInt();
			
			System.out.println();
			
			switch(choice) {
				case 1: {
					int repeat = 1;
					
					while (repeat != 0) {
						System.out.print("Enter the starting number: ");
						int start = sc.nextInt();
						System.out.print("Enter the ending number: ");
						int end = sc.nextInt();
						
						System.out.println();
						
						if (start > end) {
							System.out.println("Starting number should be smaller than the ending number!\n");
							break;
						}
						
						int sum = 0;
						for (int i = start; i <= end; i++) {
							sum += i;
						}
						System.out.println("Sum of numbers "+ start + " to " + end + ": " + sum);
						
						System.out.println();
						
						System.out.print("Enter 1 to repeat, 0 to go back\nInput: ");
						repeat = sc.nextInt();
						
						System.out.println();
					}
	
					break;
				}
				case 2: {
					int repeat = 1;
					
					while (repeat != 0) {
						System.out.print("Enter Feets: ");
						double feets = sc.nextDouble();
						
						System.out.println();
						
						if (feets > 0) {
							double inches = feets * 12.0;
							System.out.println(feets + " feets = " + inches + " inches");
						} else {
							System.out.println(new Exception("Feets cannot be zero or negative"));
						}
						
						System.out.println();
						
						System.out.print("Enter 1 to repeat, 0 to go back\nInput: ");
						repeat = sc.nextInt();
						
						System.out.println();
					}
					
					break;
				}
				case 3: {
					int repeat = 1;
					
					while (repeat != 0) {
						System.out.print("Select Operation:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nInput: ");
						int operation = sc.nextInt();
						
						System.out.println();
						
						double num1, num2;
						
						if (operation == 1) {
							System.out.print("Enter num 1: ");
							num1 = sc.nextDouble();
							System.out.print("Enter num 2: ");
							num2 = sc.nextDouble();
							System.out.println("Addition of " + num1 + " and " + num2 + ": " + (num1 + num2));
						} else if (operation == 2) {
							System.out.print("Enter num 1: ");
							num1 = sc.nextDouble();
							System.out.print("Enter num 2: ");
							num2 = sc.nextDouble();
							System.out.println("Subtraction of " + num1 + " and " + num2 + ": " + (num1 - num2));
						} else if (operation == 3) {
							System.out.print("Enter num 1: ");
							num1 = sc.nextDouble();
							System.out.print("Enter num 2: ");
							num2 = sc.nextDouble();
							System.out.println("Multiplication of " + num1 + " and " + num2 + ": " + (num1 * num2));
						} else if (operation == 4) {
							System.out.print("Enter num 1: ");
							num1 = sc.nextDouble();
							System.out.print("Enter num 2: ");
							num2 = sc.nextDouble();
							
							if (num2 != 0) {
								System.out.println("Division of " + num1 + " and " + num2 + ": " + (num1 / num2));
							} else {
								System.out.println(new ArithmeticException("Division by zero must be avoided!"));
							}
						} else {
							System.out.println("Invalid Operation!");
						}
						
						System.out.println();
						
						System.out.print("Enter 1 to repeat, 0 to go back\nInput: ");
						repeat = sc.nextInt();
						
						System.out.println();
					}
					
					break;
				}
				default: {
					if (choice != 0) {
						System.out.println("Invalid Choice");
					} else {
						System.out.println("Come back again...");
					}
					
					System.out.println();
				}
			}
		}
		
		sc.close();
	}

}
