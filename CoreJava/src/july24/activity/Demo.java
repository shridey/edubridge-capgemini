package july24.activity;

import java.util.Scanner;

import july24.activity.classes.Utilities;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Utilities utils = new Utilities();
		
		char choice = '1';
		
		while (choice != '0') {
			utils.printMainMenu();
			choice = sc.next().charAt(0);
			
			System.out.println();
			
			switch (choice) {
				case '1': {
					char repeat = '1';
					
					while (repeat != '0') {
						System.out.print("Enter the starting number: ");
						int start = sc.nextInt();
						System.out.print("Enter the ending number: ");
						int end = sc.nextInt();
						
						System.out.println();
						
						String result = utils.handleSum(start, end);
						System.out.println(result);
						
						System.out.println();
						
						System.out.print("Enter anything to repeat, 0 to go back\nInput: ");
						repeat = sc.next().charAt(0);
						
						System.out.println();
					}
					
					break;
				}
				case '2': {
					char repeat = '1';
					
					while (repeat != '0') {
						utils.printConversionMenu();
						char convert = sc.next().charAt(0);
						
						System.out.println();
						
						utils.handlePrintConversionOptions(convert);
						char option = sc.next().charAt(0);
						
						System.out.println();
						
						System.out.print("Enter units to convert: ");
						double units = sc.nextDouble();
						String result = utils.handleConversions(convert, option, units);
						System.out.println(result);
						
						System.out.println();
						
						System.out.print("Enter anything to repeat, 0 to go back\nInput: ");
						repeat = sc.next().charAt(0);
						
						System.out.println();
					}
					
					break;
				}
				case '3': {
					char repeat = '1';
					
					while (repeat != '0') {
						utils.printOperations();
						char operation = sc.next().charAt(0);
						
						System.out.println();
						
						System.out.print("Enter num 1: ");
						double num1 = sc.nextDouble();
						System.out.print("Enter num 2: ");
						double num2 = sc.nextDouble();
						
						String result = utils.handleOperations(operation, num1, num2);
						System.out.println(result);
						
						System.out.println();
						
						System.out.print("Enter anything to repeat, 0 to go back\nInput: ");
						repeat = sc.next().charAt(0);
						
						System.out.println();
					}
					
					break;
				}
				default: {
					if (choice != '0') {
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
