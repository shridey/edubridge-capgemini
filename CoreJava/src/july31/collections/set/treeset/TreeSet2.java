package july31.collections.set.treeset;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(15);
		t1.add(21);
		t1.add(18);
		t1.add(11);
		t1.add(23);
		t1.add(4);
		t1.add(26);
		t1.add(10);
		
		char play = '1';
		while (play != '0') {
			
			Iterator<Integer> it = t1.iterator();
			
			System.out.println("Here is our TreeSet: " + t1);
			System.out.print("Enter your target number: ");
			int target = sc.nextInt();
			
			System.out.println();
			
			if (!t1.contains(target)) {
				System.out.println("Invalid Target!");
				System.out.println();
				break;
			}
			
			System.out.println("Enter 1 to get lower numbers than " + target);
			System.out.println("Enter 2 to get higher numbers than " + target);
			System.out.print("Input: ");
			int choice = sc.nextInt();
			
			System.out.println();
			
			switch (choice) {
				case 1: {
					System.out.print("Lowers numbers are: ");
					while (it.hasNext()) {
						int num = it.next();
						if (num < target) {
							System.out.print(num + " ");
						} else {
							break;
						}
					}
					System.out.println();
					break;
				}
				case 2: {
					System.out.print("Higher numbers are: ");
					while (it.hasNext()) {
						int num = it.next();
						if (num > target) {
							System.out.print(num + " ");
						}
					}
					System.out.println();
					break;
				}
				default: {
					System.out.println("Invalid Choice!");
				}
			}
			
			System.out.println();
			
			System.out.println("Do you want to play again?");
			System.out.println("Enter anything to play, 0 to exit");
			System.out.print("Input: ");
			play = sc.next().charAt(0);
			
			System.out.println();
		}
		
		sc.close();
		System.out.println("Come back again (Rohit Sir)...!");
	}

}
