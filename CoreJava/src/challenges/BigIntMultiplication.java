package challenges;

import java.math.BigInteger;

public class BigIntMultiplication {
	
	public String bigIntMultiply(String A, String B) {
	    BigInteger num1 = new BigInteger(A);
	    BigInteger num2 = new BigInteger(B);
	    
	    return num1.multiply(num2).toString();
	}
	
	public static void main(String[] args) {
		BigIntMultiplication bIM = new BigIntMultiplication();
		System.out.println(bIM.bigIntMultiply("68796574347", "786954326789"));
	}
	
}
