package august22.algorithms.recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial: " + factorial(5));
		printName("Shri", 10);
	}
	
	public static double factorial(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	
	public static void printName(String name, int count) {
		if (count > 0) {
			System.out.println(name);
			printName(name, count -1);
		}
	}

}
