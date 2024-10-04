package challenges;

public class PostiveNegative {
	
	public static String positiveOrNegative(int number) {
		return (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
	}

	public static void main(String[] args) {
		System.out.println(positiveOrNegative(0));
	}

}
