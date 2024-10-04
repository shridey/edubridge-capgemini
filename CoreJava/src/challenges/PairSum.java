package challenges;

import java.util.HashSet;

public class PairSum {
	
	public static void pairSum(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Pairs with sum " + sum + " are:");

        for (int num : arr) {
            int complement = sum - num;

            if (set.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            
            set.add(num);
        }
    }

	public static void main(String[] args) {
		int[] arr = {4, 5, 7, 11, 9, 13, 8, 12};
		pairSum(arr, 20);
	}

}
