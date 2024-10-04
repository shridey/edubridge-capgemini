package july16;

public class FourthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] b = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        System.out.println("Addition:");
        int[][] add = new int[3][3];
        for (int i = 0; i < add.length; i++) {
            for (int j = 0; j < add[0].length; j++) {
                add[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(add);
        
        System.out.println();

        System.out.println("Subtraction:");
        int[][] sub = new int[3][3];
        for (int i = 0; i < sub.length; i++) {
            for (int j = 0; j < sub[0].length; j++) {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }
        printMatrix(sub);
        
        System.out.println();

        System.out.println("Multiplication:");
        int[][] mul = new int[3][3];
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[0].length; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < mul.length; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        printMatrix(mul);
        
        System.out.println();

        System.out.println("Element-wise Division:");
        double[][] div = new double[3][3];
        for (int i = 0; i < div.length; i++) {
            for (int j = 0; j < div[0].length; j++) {
                div[i][j] = (double) a[i][j] / b[i][j];
            }
        }
        printMatrix(div);
	}

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to print a double matrix
    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
