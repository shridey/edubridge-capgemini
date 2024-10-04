package july15;
public class SecondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
        int sub1 = 50, sub2 = 40, sub3 = 48, sub4 = 35, sub5 = 33;
        
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