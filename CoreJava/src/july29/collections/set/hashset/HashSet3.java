package july29.collections.set.hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(11);
		set1.add(12);
		set1.add(13);
		set1.add(14);
		set1.add(15);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(1);
		set2.add(3);
		set2.add(5);
		set2.add(7);
		set2.add(9);
		
		Set<Integer> set3 = new HashSet<Integer>();
		
		List<Integer> arr1 = new ArrayList<Integer>();
		Iterator<Integer> it = set2.iterator();
		while (it.hasNext()) {
			arr1.add(it.next());
		}
		
		List<Integer> reversedArr1 = arr1.reversed();
		Iterator<Integer> it1 = set1.iterator();
		int i = 0;
		while (it1.hasNext()) {
			int num1 = it1.next();
			int num2 = reversedArr1.get(i);
			System.out.println(num1 + num2);
			set3.add(num1 + num2);
			i++;
		}
		
		System.out.println(set3);
	}

}
