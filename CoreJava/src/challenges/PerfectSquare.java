package challenges;

public class PerfectSquare {
	
	public static boolean isPerfectSquare(int number) {
        if (number < 0) {
            return false;
        }
        
        int sqrt = (int) Math.sqrt(number);
        
        return (sqrt * sqrt) == number;
    }

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(25));
	}

}
