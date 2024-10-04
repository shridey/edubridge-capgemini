package july10.input;
import java.util.Scanner;

/*
 * Working with Scanner for input
 */

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int id = sc.nextInt();
		sc.nextLine(); // We need to use extra nextLine() method in order to make nextLine() to work in the next line
		String name = sc.nextLine();
		int sfees = sc.nextInt();
		
		sc.close();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(sfees);
	}

}
