package challenges;

public class MissingNumber {
	
	public static int missingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

	public static void main(String[] args) {
		int[] arr = {1, 4, 5, 3, 7, 8, 6};

        int missingNumber = missingNumber(arr, 8);
        System.out.println("The missing number is: " + missingNumber);
	}

}
