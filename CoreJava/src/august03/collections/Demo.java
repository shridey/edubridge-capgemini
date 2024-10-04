package august03.collections;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Try block");
			System.exit(0);
		} catch (ArithmeticException e) { // first subclass
			e.printStackTrace();
		} catch(Exception e) { // then superclass
			e.printStackTrace();
		} finally {
			System.out.println("We are here!");
		}
	}

}
