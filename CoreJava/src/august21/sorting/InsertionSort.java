package august21.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {9, 14, 3, 2, 43, 11, 58, 22};
		
		System.out.print("Before Insertion Sort:");
        for(int i: arr){
            System.out.print(" " + i);
        }
        System.out.println();
            
        insertionSort(arr, 0);
           
        System.out.print("After Insertion Sort:");
        for(int i: arr){
            System.out.print(" " + i);
        }
	}
	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			
			int j = i-1;
			
			while (j > -1 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[j + 1] = key;
		}
	}
	
	public static void insertionSort(int[] arr, int order) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			
			int j = i-1;
			
			if (order == 0) {
				while (j > -1 && arr[j] > key) {
					arr[j + 1] = arr[j];
					j--;
				}
			} else if (order == 1) {
				while (j > -1 && arr[j] < key) {
					arr[j + 1] = arr[j];
					j--;
				}
			} else {
				System.out.println("Invalid Order: Order should be 0 for Ascending or 1 for Descending!");
				return;
			}
			
			arr[j + 1] = key;
		}
	}

}
