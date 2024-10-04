package august20.sorting;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
	}
	
	public int binarySearch(int[] arr, int key) {
		// Sorting the array before applying the algorithm
		Arrays.sort(arr);
		
	    // Initialize the starting index of the array
	    int low = 0;

	    // Initialize the ending index of the array
	    int high = arr.length - 1;

	    // Continue the search while the search space is not exhausted
	    while (low <= high) {
	        // Calculate the middle index of the current search space
	        int mid = low + (high - low) / 2;

	        // Check if the key is present at the mid index
	        if (arr[mid] == key) {
	            return mid; // Key found at index 'mid', return the index
	        }
	        // If the key is greater than the element at mid, it must be in the right half
	        else if (arr[mid] < key) {
	            low = mid + 1; // Move the lower bound to mid + 1
	        }
	        // If the key is smaller than the element at mid, it must be in the left half
	        else {
	            high = mid - 1; // Move the upper bound to mid - 1
	        }
	    }

	    // If the key is not found in the array, return -1
	    return -1;
	}

}
