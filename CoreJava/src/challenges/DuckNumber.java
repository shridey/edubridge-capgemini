package challenges;

import java.util.Scanner;

class Duck {
	String isDuckNumber(int num) {
		if (String.valueOf(num).length() == 3 && String.valueOf(num).contains("0")) {
			return "Duck number";
		}
		
		return "Invalid";
	}
}

public class DuckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Duck duck = new Duck();
		
		System.out.print("Input: ");
		int input = sc.nextInt();
		
		sc.close();
		
		System.out.println("Output: " + duck.isDuckNumber(input));
	}

}
