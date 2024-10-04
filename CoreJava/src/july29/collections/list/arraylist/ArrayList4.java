package july29.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr1 = new ArrayList<Integer>();
		List<Integer> arr2 = new ArrayList<Integer>();
		
		arr1.add(21);
		arr1.add(11);
		arr1.add(5);
		arr1.add(45);
		arr1.add(33);
		
		System.out.println("ArrayList 1: " + arr1);
		
		arr2.add(1);
		arr2.add(3);
		arr2.add(4);
		arr2.add(7);
		arr2.add(8);
		
		System.out.println("ArrayList 2: " + arr2);
		
		List<Integer> arr3 = new ArrayList<Integer>();
		
		// Approach I thought:
		
		int end = arr2.size() - 1;
		for (int i = 0; i < arr1.size(); i++) {
//			int num1 = arr1.get(i);
//			int num2 = arr2.get(end);
//			int addition = num1 + num2;
			
//			System.out.println(num1 + " + " + num2 + " = " + addition);
			
			arr3.add(arr1.get(i) + arr2.get(end));
			end--;
		}
		
		// Easy Approach (Suggested by Junaid)
		
//		List<Integer> reversedArr2 = arr2.reversed();
//		for (int i = 0; i < arr1.size(); i++) {
////			int num1 = arr1.get(i);
////			int num2 = reversedArr2.get(i);
////			int addition = num1 + num2;
//			
////			System.out.println(num1 + " + " + num2 + " = " + addition);
//			
//			arr3.add(arr1.get(i) + reversedArr2.get(i));
//		}
		
		// Easy Approach (Suggested by Junaid) but using Iterator
		
//		List<Integer> reversedArr2 = arr2.reversed();
//		Iterator<Integer> it1 = arr1.listIterator();
//		Iterator<Integer> it2 = reversedArr2.listIterator();
//		
//		while (it1.hasNext()) {
////			int num1 = it1.next();
////			int num2 = it2.next();
////			int addition = num1 + num2;
//			
////			System.out.println(num1 + " + " + num2 + " = " + addition);
//			
//			arr3.add(it1.next() + it2.next());
//		}
		
		System.out.println("Addition of ArrayList 1 and 2: " + arr3);
	}

}
