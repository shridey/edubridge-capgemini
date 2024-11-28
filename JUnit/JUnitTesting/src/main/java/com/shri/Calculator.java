package com.shri;

public class Calculator {
	public int add(int i, int j) {
		return i + j;
	}
	
	public int sub(int i, int j) {
		return i - j;
	}
	
	public int mul(int i, int j) {
		return i * j;
	}
	
	public int div(int i, int j) {
		return i / j;
	}
	
	public int length(String str) {
		return str.length();
	}
	
	public boolean isNumberArmstrong(long num) {
		if (num < 0) {
			return false;
		} else if (num < 10) {
			return true;
		}
		
		String numString = String.valueOf(num);
		int length = numString.length();
		
		long sum = 0;
		for (int i = 0; i < length; i++) {
//			char curr = numString.charAt(i);
//			String currString = String.valueOf(curr);
//			int currNumber = Integer.valueOf(currString);
			
			int currentNumber = Integer.valueOf(String.valueOf(numString.charAt(i)));
			sum += Math.pow(currentNumber, length);
		}
		
		return sum == num;
	}
	
	public static boolean isArmstrongNumber(long num) {
	    long originalNum = num;
	    int sum = 0;
	    int digits = String.valueOf(num).length();

	    while (num > 0) {
	        long digit = num % 10;
	        sum += Math.pow(digit, digits);
	        num /= 10;
	    }

	    return sum == originalNum;
	}
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if (Calculator.isArmstrongNumber(i)) {
				System.out.println(i);
			}
		}
	}
}
