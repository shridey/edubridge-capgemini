package challenges;

public class ArmstrongNumber {
	
	public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == originalNumber;
    }

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
	}

}
