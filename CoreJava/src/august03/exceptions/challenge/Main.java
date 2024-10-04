package august03.exceptions.challenge;

class MyException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public MyException(String s) {
        super(s);
    }
}

class Source {
	
	public String checkAge(int age) throws MyException {
		if (age < 15) {
			throw new MyException("not valid");
		}
		return "valid";
	}
}

public class Main {
	public static void main(String[] args) throws MyException {
		Source src = new Source();
		System.out.println(src.checkAge(17));
	}
}
