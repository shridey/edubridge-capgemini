package challenges;

public class SwapWords {

	public static void main(String[] args) {
		String word1 = "Hello";
        String word2 = "World";

        System.out.println("Before Swap:");
        System.out.println("word1: " + word1);
        System.out.println("word2: " + word2);
        
        System.out.println();

        word1 = word1 + word2;

        word2 = word1.substring(0, word1.length() - word2.length());
        word1 = word1.substring(word2.length());

        System.out.println("After Swap:");
        System.out.println("word1: " + word1);
        System.out.println("word2: " + word2);
	}

}
