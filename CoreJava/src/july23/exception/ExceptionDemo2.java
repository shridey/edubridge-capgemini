package july23.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int divident = 0;
			int divisor = 100;
			
			System.out.println("Division: " + (divisor/divident));
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			System.out.println("Exception: " + e.getClass());
			e.printStackTrace();
		}
	}

}
