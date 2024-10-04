package challenges;

public class LargestSmallestWord {
	
	public static String largest(String str) {
		String[] arr = str.split(" ");
		
		int largestWordCount = 0;
		String largestWord = "";
		
		for (String word: arr) {
			if (word.length() > largestWordCount) {
				largestWord = word;
				largestWordCount = word.length();
			}
		}
		
		return largestWord;
	}
	
	public static String smallest(String str) {
		String[] arr = str.split(" ");
		
		int smallestWordCount = Integer.MAX_VALUE;
		String smallestWord = "";
		
		for (String word: arr) {
			if (word.length() < smallestWordCount) {
				smallestWord = word;
				smallestWordCount = word.length();
			}
		}
		
		return smallestWord;
	}

	public static void main(String[] args) {
		String str = "My name is Shridhar";
		System.out.println("Largest word: " + largest(str));
		System.out.println("Smallest word: " + smallest(str));
	}

}
