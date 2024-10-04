package challenges;

public class SmallestAndBiggestPalindrome {
	
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void smallestAndBiggestPalindrome(String str) {
        String smallestPalindrome = null;
        String largestPalindrome = null;

        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String subStr = str.substring(i, j);

                if (isPalindrome(subStr)) {
                    if (smallestPalindrome == null || subStr.length() < smallestPalindrome.length()) {
                        smallestPalindrome = subStr;
                    }
                    if (largestPalindrome == null || subStr.length() > largestPalindrome.length()) {
                        largestPalindrome = subStr;
                    }
                }
            }
        }

        if (smallestPalindrome != null && largestPalindrome != null) {
            System.out.println("Smallest palindrome: " + smallestPalindrome);
            System.out.println("Largest palindrome: " + largestPalindrome);
        } else {
            System.out.println("No palindromes found.");
        }
    }

	public static void main(String[] args) {
		smallestAndBiggestPalindrome("Shridharandnanam");
	}

}
