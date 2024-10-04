package july29.collections.list.arraylist;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(6);
		arrayList.add(6.0);
		arrayList.add(true);
		arrayList.add('c');
		arrayList.add("Shri");
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("ArrayList:");
			System.out.println(arrayList.get(i));
		}
	}

}
