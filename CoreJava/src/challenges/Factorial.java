package challenges;

public class Factorial {
	
	public static long factorial(long number) {
		if (number == 0 || number == 1) {
	        return 1;
	    } else {
	        return number * factorial(number - 1);
	    }
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

}
