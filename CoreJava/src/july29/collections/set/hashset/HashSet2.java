package july29.collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(11);
		set1.add(12);
		set1.add(13);
		set1.add(14);
		set1.add(15);
		
		Iterator<Integer> it = set1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
