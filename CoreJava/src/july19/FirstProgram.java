package july19;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an integer");
	     Scanner s = new Scanner(System.in);
	     int n = s.nextInt();
	     
	     if(n%2 == 1)
	     {
	         System.out.println("Weird");
	     }
	     else
	     {
	            if(n>=2 && n<5)
	             {
	                 System.out.println("Not Weird");
	             }
	             else
	             {
	                 if(n>=6 && n<=20)
	                 {
	                     System.out.println("Weird");
	                 }
	                 else
	                 {
	                     System.out.println("Not Weird");
	                 }
	             }
	             
	     }
	     s.close();
	}

}
