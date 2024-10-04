package july10.area;


/*
 * Write a program to calculate the area of a circle
 */

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = 4;
		
		// Formula: Area of a Circle = PI * r * r (PI = 3.14)
		float area = 3.14159f * radius * radius;
		
		System.out.println("Area of a circle with radius = " + radius + " is " + area + " sq. units");
	}

}
