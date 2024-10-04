package august21.assignment;

public class NeonNumbers {

	public static void main(String[] args) {
		checkNeon(9);
	}

	public static void checkNeon(int n) {
        int square = n * n;

        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        if(sumOfDigits == n) {
        	System.out.println(n + " is a Neon Number");
        } else {
        	System.out.println(n + " is not a Neon Number");
        }
    }
}
