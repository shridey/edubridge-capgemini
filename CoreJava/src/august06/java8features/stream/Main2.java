package august06.java8features.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Main2 {
	public static void main(String[] args) throws IOException {
		// Implement HashMapProblem using Stream
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter your String: ");
		String str = reader.readLine();
		
		// Assuming input is limited to lowercase letters (a-z)
        int[] charCount = new int[26];
        
        // Using Streams to count characters
        str.chars()
           .filter(Character::isLetter)  // Consider only letters
           .map(Character::toLowerCase)   // Convert to lowercase for uniform counting
           .forEach(c -> charCount[c - 'a']++);  // Increment the count for the character
        
        // Display the character counts
        IntStream.range(0, 26)
                 .filter(i -> charCount[i] > 0)
                 .forEach(i -> System.out.println((char) (i + 'a') + " : " + charCount[i]));
	}
}
