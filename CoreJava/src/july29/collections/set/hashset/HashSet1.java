package july29.collections.set.hashset;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s1 = new HashSet();
		s1.add(11);
        s1.add("Java");
        s1.add(15.55);
        s1.add(false);
        s1.add(11);
        System.out.println(s1);
        
        int len = s1.size();
        System.out.println("length : "+len);
        
        s1.remove(11);
        System.out.println(s1);
	}

}
