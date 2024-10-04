package july24.exception.throwing;

public class Demo2 {
	
	static void checking(int a, int b) {
		try {
			System.out.println("Division: " + (a/b));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (b >= 1) {
			System.out.println("Division: " + (a/b));
		} else {
			throw new ArithmeticException("Division by zero is not possible!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checking(100, 0);
	}

}
