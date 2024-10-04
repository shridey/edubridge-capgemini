package challenges;

import java.util.Arrays;

public class SeperateZeroes {
	
	public static void moveZeroesToEnd(int[] arr) {
        int nonZeroPos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroPos] = arr[i];
                nonZeroPos++;
            }
        }

        for (int i = nonZeroPos; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
	
	public static void moveZeroesToStart(int[] arr) {
        int n = arr.length;
        int nonZeroPos = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[nonZeroPos] = arr[i];
                nonZeroPos--;
            }
        }

        while (nonZeroPos >= 0) {
            arr[nonZeroPos] = 0;
            nonZeroPos--;
        }
    }

	public static void main(String[] args) {
		int[] arr = {14, 0, 5, 2, 0, 3, 0};
		
		System.out.println("Original Array: " + Arrays.toString(arr));

        moveZeroesToEnd(arr);
        System.out.println("Array after moving zeroes to the end: " + Arrays.toString(arr));
        
        moveZeroesToStart(arr);
        System.out.println("Array after moving zeroes to the start: " + Arrays.toString(arr));
	}

}
