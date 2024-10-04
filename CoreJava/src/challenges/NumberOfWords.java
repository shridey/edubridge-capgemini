package challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfWords {
	
	public static int numberOfWords(File file) {
		int wordCount = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Convert line to lowercase and split it into words
                String[] words = line.toLowerCase().split(" ");
                wordCount += words.length;
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return wordCount;
	}

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Asus\\git\\repository\\CoreJava\\src\\challenges\\text.txt");
		System.out.println("Word Count: " + numberOfWords(file));
	}

}
