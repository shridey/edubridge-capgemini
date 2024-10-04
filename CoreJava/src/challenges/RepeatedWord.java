package challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RepeatedWord {
	
	public static String mostRepeatedWord(File file) {
		Map<String, Integer> wordCount = new HashMap<>();
        String mostRepeatedWord = "";
        int maxCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Convert line to lowercase and split it into words
                String[] words = line.toLowerCase().split(" ");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

                        // Check if this word has the highest count
                        if (wordCount.get(word) > maxCount) {
                            maxCount = wordCount.get(word);
                            mostRepeatedWord = word;
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return mostRepeatedWord;
	}

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Asus\\git\\repository\\CoreJava\\src\\challenges\\text.txt");
		System.out.println("Most Repeated Word: " + mostRepeatedWord(file));
	}

}
