package challenges;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		if (str == null || str.isEmpty()) {
            return false;
        }
		
		StringBuilder sb = new StringBuilder(str);
		return str.equalsIgnoreCase(sb.reverse().toString());
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("Naman"));
	}

}
