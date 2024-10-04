package july30.collections.stack;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	Stack s = new Stack();
        s.add(11);
        s.add("Python");
        s.add(true);
        s.add('C');
        s.add(11);
        System.out.println(s);
        s.addFirst(5);
        s.addLast("Java");
        System.out.println(s);
        
        int len = s.capacity();
        System.out.println("Capacity : "+len);
        System.out.println("Size : "+ s.size());
        
        
        s.add(20);
        s.add("Full stack");
        s.add(false);
        s.add('D');
        System.out.println(s);
        System.out.println("Capacity : "+len);
        System.out.println("Size : "+ s.size());
        
        Iterator its = s.iterator(); 
        
        while(its.hasNext())
        {
           System.out.print(" "+its.next());    
        }
	}

}
