package august22.algorithms.recursion.sorting;

public class QuickSort {

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		
		int arr[] = {13, 18, 27, 2, 19, 25};
		int n = arr.length;
		
		System.out.print("Before Quick Sort:");
		quickSort.printArr(arr, n);
		
		System.out.println();
		
		quickSort.quickSort(arr, 0, n - 1);
		
		System.out.print("After Quick Sort:");
		quickSort.printArr(arr, n);
	}
	
	void quickSort(int arr[], int start, int end) {
		if (start < end) {
			int p = partition(arr, start, end);
			quickSort(arr, start, p - 1);
			quickSort(arr, p + 1, end);
		}
	}
	
	int partition (int arr[], int start, int end) {
		int pivot = arr[end];
		int i = (start - 1);
		
		for (int j = start; j <= end - 1; j++) {
			if (arr[j] < pivot) { // Change this condition to sort in descending order
				i++;
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		
		int t = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = t;
		return (i + 1);
	}
	
	void printArr(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
