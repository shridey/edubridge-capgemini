package july24.exception.throwing;

public class Demo1 {
	
	static void age(int a) {
		if (a < 18) {
			throw new ArithmeticException("Access Denied");
		} else {
			System.out.println("Access Granted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age(14);
	}

}
