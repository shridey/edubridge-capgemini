package challenges;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
	
	public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int num : array) {
            uniqueElements.add(num);
        }

        int[] result = new int[uniqueElements.size()];
        int index = 0;

        for (int num : uniqueElements) {
            result[index++] = num;
        }

        return result;
    }

	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 4, 9, 2};
		System.out.println(Arrays.toString(removeDuplicates(arr)));
	}

}
