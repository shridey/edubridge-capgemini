package july29.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();
        
        l1.add(11);
        l1.add(12);
        l1.add(13);
        l1.add(14);
        l1.add(15);
        
        System.out.println(l1);
        
        Iterator it = l1.listIterator();
        
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        List<String> l2 = new ArrayList<String>();
        
        l2.add("Rohit Sir");
        l2.add("Shri");
        l2.add("Deepika");
        l2.add("Akriti");
        l2.add("Aarti");
        
        System.out.println(l2);
        
        Iterator it2 = l2.listIterator();
        
        while(it2.hasNext())
        {
            System.out.println(it2.next());
        }
	}

}
