package challenges;

import java.util.Arrays;

public class SubArraySum {
	
    public static int[] subArraySum(int[] arr, int targetSum) {
        int start = 0, currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > targetSum && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == targetSum) {
                return Arrays.copyOfRange(arr, start, end + 1);
            }
        }

        return new int[]{};
    }


	public static void main(String[] args) {
		int[] arr = {12, 5, 31, 9, 21, 8};
		
		int[] subSum = subArraySum(arr, 45);
		
		System.out.println(Arrays.toString(subSum));
	}

}
