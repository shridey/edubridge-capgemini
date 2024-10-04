package july20;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter shape of which area to be calculated:");
			System.out.print("1: Circle\n2: Rectangle\n3: Triangle\nInput: ");
			choice = s.nextInt();
			
			System.out.println();
			
			switch(choice) {
				case 1: {
					System.out.print("Enter Radius of a Circle: ");
					double r = s.nextDouble();
					Circle c = new Circle(r);
					System.out.println("Area of a Circle: "+ c.area());
					break;
				}
				case 2: {
					System.out.print("Enter Length of a Rectangle: ");
					double l = s.nextDouble();
					System.out.print("Enter Breadth of a Rectangle: ");
					double b = s.nextDouble();
					Rectangle r = new Rectangle(l, b);
					System.out.println("Area of a Rectangle : "+ r.area());
					break;
				}
				case 3 : {
					System.out.print("Enter Base of a Triangle: ");
					double b = s.nextDouble();
					System.out.print("Enter Height of a Triangle: ");
					double h = s.nextDouble();
					Triangle t = new Triangle(b,h);
					System.out.println("Area of a Triangle : "+ t.area());
					break;
				}
				default : {
					System.out.println("Invalid choice...\nTerminating the program...!");
					break;
				}
			}
			System.out.println();
		} while(choice<=3);
		s.close();
	}
}
