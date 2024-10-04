package july29.collections.list.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
		
		Iterator i = l1.listIterator();
		
		while(i.hasNext()) {
			System.out.print(" "+i.next());
		}
	}

}
