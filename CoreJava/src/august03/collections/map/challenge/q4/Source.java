package august03.collections.map.challenge.q4;

import java.util.HashMap;
import java.util.Map;

public class Source {
	public Map<Character, Integer> countChars(char[] arr) {
		Map<Character, Integer> count = new HashMap<Character, Integer>();
		for (char c: arr) {
			if (count.containsKey(c)) {
				count.put(c, count.get(c)+1);
			} else {
				count.put(c, 1);
			}
		}
		
		return count;
	}
}
