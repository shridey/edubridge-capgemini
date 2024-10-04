package challenges;

public class LargestOfThree {
	
	public static double largestOfThree(double num1, double num2, double num3) {
		return (num1 > num2 && num1 > num3) ? num1 : (num2 > num1 && num2 > num3) ? num2 : num3;
	}

	public static void main(String[] args) {
		System.out.println(largestOfThree(12, 15, 9));
	}

}
