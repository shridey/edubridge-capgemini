package challenges;

public class GreatestCommonDivisor {
	
	public static int gcd(int num1, int num2) {
		while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
	}

	public static void main(String[] args) {
		System.out.println(gcd(48, 18));
	}

}
