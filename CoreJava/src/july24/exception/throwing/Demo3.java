package july24.exception.throwing;

import java.io.IOException;

public class Demo3 {
	
	void demo() throws IOException {
		throw new IOException("Hardware Failure");
	}
	
	public static void main(String[] args) throws IOException {
		Demo3 d3 = new Demo3();
		d3.demo();
	}
	
}
