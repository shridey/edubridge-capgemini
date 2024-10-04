package july17;
import java.util.Scanner;

public class EighthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks of first subject: ");
		int sub1 = sc.nextInt();
		
		System.out.print("Enter marks of second subject: ");
		int sub2 = sc.nextInt();
		
		System.out.print("Enter marks of third subject: ");
		int sub3 = sc.nextInt();
		
		System.out.print("Enter marks of fourth subject: ");
		int sub4 = sc.nextInt();
		
		System.out.print("Enter marks of fifth subject: ");
		int sub5 = sc.nextInt();
		
		sc.close();
        
        int total = (sub1 + sub2 + sub3 + sub4 + sub5);
        
        double per = (total / 5.0);
        System.out.println("Percentage: " + per);
        
        int choice = 0;
        
        if(per >= 80.00) {
           choice = 1;    
        } else {
        	if(per >= 60.00) {
                  choice = 2;
            } else {
				if(per >=40.00) {
				    choice=3;
				} else {
				    choice=4;
				}
            }
        }
        
        
        switch(choice) {
	        case 1 : {
	            System.out.println("Paased with I st division");
	            break;
	        }
	        case 2 : {
	            System.out.println("Passed with II nd division");
	            break;
	        }
	        case 3 : {
	            System.out.println("Passed with III rd division");
	            break;
	        }
	        case 4 : {
	            System.out.println("Failed...!!!!");
	            break;
	        }
        }
	}

}
