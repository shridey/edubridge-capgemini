package july31.collections.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t1 = new TreeSet<String>();
		
		t1.add("Shri");
		t1.add("is");
		t1.add("a");
		t1.add("Noob");
		t1.add("java");
        t1.add("full");
        t1.add("stack");
        t1.add("util");
        t1.add("package");
        
        System.out.println(t1);
        
        
        t1.add("batch");
        t1.add("12296");
        System.out.println(t1);
        
        
        int len = t1.size();
        System.out.println("Length : "+ len);
        
        TreeSet<String> t2 = new TreeSet<String>();
        t2 = (TreeSet<String>) t1.reversed();
        
        t2.add(null);
        
        System.out.println(t2);
        
        t1.remove("12296");
        System.out.println(t1);
        
        
        Iterator<String> it = t1.iterator();
        
        while(it.hasNext())
        {
             System.out.println(it.next());        
        }
	}

}
