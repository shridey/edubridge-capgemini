package august01.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Count the occurrence of each character of a string using HashMap
 */

public class HashMapProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String name = sc.nextLine();
		char[] nameArr = name.toCharArray();
		
		sc.close();
		
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		
//		for (int i = 0; i < nameArr.length; i++) {
//			if (count.containsKey(nameArr[i])) {
//				count.put(nameArr[i], count.get(nameArr[i])+1);
//			} else {
//				count.put(nameArr[i], 1);
//			}
//		}
		
		for (Character c: nameArr) {
			if (count.containsKey(c)) {
				count.put(c, count.get(c)+1);
			} else {
				count.put(c, 1);
			}
		}
		
		Iterator<Character> it = count.keySet().iterator();
		
		while (it.hasNext()) {
			char key = it.next();
			System.out.println("Key: " + key + " Value: " + count.get(key));
		}
		
	}

}
