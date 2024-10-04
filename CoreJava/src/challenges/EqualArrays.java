package challenges;

import java.util.Arrays;

public class EqualArrays {
	
	public static boolean isArraysEqual(int[] arr1, int[] arr2) {
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		int[] arr1 = {21, 45, 34};
		int[] arr2 = {21, 34, 45};
		System.out.println(isArraysEqual(arr1, arr2));
	}

}
