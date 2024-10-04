package july24.activity.classes;

public class Utilities {

	public void printMainMenu() {
		System.out.println("What you want to do?");
		System.out.println("1. Get the sum of range of numbers");
		System.out.println("2. Basic Converter");
		System.out.println("3. Basic Calculator");
		System.out.println("0. Quit");
		System.out.print("Input: ");
	}
	
	public String handleSum(double num1, double num2) {
		Operations operations = new Operations(num1, num2);
		int sum = operations.getSum();
		
		if(sum == 0) {
			return ("Starting number must be smaller than the Ending number!");
		}
		
		return ("Sum of numbers "+ num1 + " to " + num2 + ": " + sum);
	}
	
	public void printConversionMenu() {
		System.out.println("What do you want to convert?");
		System.out.println("1. Temperature");
		System.out.println("2. Distance");
		System.out.println("3. Currency");
		System.out.print("Input: ");
	}
	
	public void handlePrintConversionOptions(char choice) {
		if (choice == '1') {
			System.out.println("Select Conversion:");
			System.out.println("1. Celcius to Fahrenheit");
			System.out.println("2. Celsius to Kelvin");
			System.out.println("3. Fahrenheit to Celsius");
			System.out.println("4. Fahrenheit to Kelvin");
			System.out.println("5. Kelvin to Celsius");
			System.out.println("6. Kelvin to Fahrenheit");
			System.out.print("Input: ");
		} else if (choice == '2') {
			System.out.println("Select Conversion:");
			System.out.println("1. Feets to Inches");
			System.out.println("2. Inches to Feets");
			System.out.print("Input: ");
		} else if (choice == '3') {
			System.out.println("Select Conversion:");
			System.out.println("1. INR to USD");
			System.out.println("2. USD to INR");
			System.out.print("Input: ");
		}
	}
	
	public String handleConversions(char menuChoice, char optionChoice, double value) {
		Converter converter = new Converter(value);
		String result = "";
		if (menuChoice == '1' && optionChoice == '1') {
			result = (value + " Celsius in Fahrenheit: " + converter.celsiusToFahrenheit());
		} else if (menuChoice == '1' && optionChoice == '2') {
			result = (value + " Celsius in Kelvin: " + converter.celsiusToKelvin());
		} else if (menuChoice == '1' && optionChoice == '3') {
			result = (value + " Fahrenheit in Celsius: " + converter.fahrenheitToCelsius());
		} else if (menuChoice == '1' && optionChoice == '4') {
			result = (value + " Fahrenheit in Kelvin: " + converter.fahrenheitToKelvin());
		} else if (menuChoice == '1' && optionChoice == '5') {
			result = (value + " Kelvin in Celsius: " + converter.kelvinToCelsius());
		} else if (menuChoice == '1' && optionChoice == '6') {
			result = (value + " Kelvin in Fahrenheit: " + converter.kelvinToFahrenheit());
		} else if (menuChoice == '2' && optionChoice == '1') {
			result = (value + " Feets in Inches: " + converter.feetsToInches());
		} else if (menuChoice == '2' && optionChoice == '2') {
			result = (value + " Inches in Feets: " + converter.inchesToFeets());
		} else if (menuChoice == '3' && optionChoice == '1') {
			result = (value + " INR in USD: " + converter.INRtoUSD());
		} else if (menuChoice == '3' && optionChoice == '2') {
			result = (value + " USD in INR: " + converter.USDtoINR());
		}
		return result;
	}
	
	public void printOperations() {
		System.out.println("Select Operation:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Input: ");
	}
	
	public String handleOperations(char operation, double num1, double num2) {
		Operations operations = new Operations(num1, num2);
		
		if (operation == '1') {
			return ("Addition of " + num1 + " and " + num2 + ": " + operations.getAddition());
		} else if (operation == '2') {
			return ("Subtraction of " + num1 + " and " + num2 + ": " + operations.getSubtraction());
		} else if (operation == '3') {
			return ("Multiplication of " + num1 + " and " + num2 + ": " + operations.getMultiplication());
		} else if (operation == '4') {
			return ("Division of " + num1 + " and " + num2 + ": " + operations.getDivision());
		} else {
			return ("Invalid Operation!");
		}
	}
	
}
