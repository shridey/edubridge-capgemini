package challenges;

import java.util.HashMap;
import java.util.Map;

public class Occurrences {
	
	public static void maxMinOccurringChar(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null.");
            return;
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char maxChar = ' ';
        char minChar = ' ';
        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int count = entry.getValue();
            char ch = entry.getKey();

            if (count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }
            if (count < minCount) {
                minCount = count;
                minChar = ch;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar + " (occurs " + maxCount + " times)");
        System.out.println("Minimum occurring character: " + minChar + " (occurs " + minCount + " times)");
    }
	
	public static Map<Integer, Integer> countOccurrences(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return countMap;
    }

	public static void main(String[] args) {
		maxMinOccurringChar("Shridhar");
		
		int[] array = {12, 9, 12, 9, 10, 9, 10, 11};
		
        System.out.println(countOccurrences(array));
	}

}
