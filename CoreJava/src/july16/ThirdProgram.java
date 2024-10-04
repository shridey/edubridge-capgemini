package july16;

public class ThirdProgram {
	
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		arr[0][0] = 20;
		arr[0][1] = 11;
		arr[0][2] = 12;
		arr[1][0] = 10;
		arr[1][1] = 11;
		arr[1][2] = 12;
		arr[2][0] = 20;
		arr[2][1] = 21;
		arr[2][2] = 22;
		
		int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
