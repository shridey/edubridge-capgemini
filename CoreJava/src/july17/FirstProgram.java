package july17;
import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);    
        
        System.out.print("Enter a double value: ");
         
        double st = s.nextDouble();
        
        s.close();
        System.out.println(st);
	}

}
