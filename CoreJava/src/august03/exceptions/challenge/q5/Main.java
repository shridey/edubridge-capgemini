package august03.exceptions.challenge.q5;

class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	MyException(String message) {
		super(message);
	}
}

class Source {
	public String checkAge(int age) throws MyException {
		if (age < 15) {
			throw new MyException("not valid: age must be greater than or equal to 15");
		}
		
		return "valid";
	}
}

public class Main {

	public static void main(String[] args) throws MyException {
		Source src = new Source();
		System.out.println(src.checkAge(15));
	}

}
