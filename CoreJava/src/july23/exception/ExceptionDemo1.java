package july23.exception;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr = {1, 2, 3, 4, 5, 6};
			System.out.println("Array index 25" + arr[25]);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			System.out.println("Exception: " + e.getClass());
		}
	}

}
