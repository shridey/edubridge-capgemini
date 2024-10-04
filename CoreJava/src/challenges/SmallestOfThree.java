package challenges;

public class SmallestOfThree {
	
	public static double smallestOfThree(double num1, double num2, double num3) {
		return (num1 < num2 && num1 < num3) ? num1 : (num2 < num1 && num2 < num3) ? num2 : num3;
	}

	public static void main(String[] args) {
		System.out.println(smallestOfThree(15, 9, 12));
	}

}
