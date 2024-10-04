package july10.area;

/*
 * Write a program to calculate Area of a Triangle
 */

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 4;
		int height = 8;
		
		// Formula: Area of a Triangle = 1/2 * base * height
//		float area = ((float)1/2) * base * height;
		float area = 0.5f * base * height;
		
		System.out.println("Area of a triangle with base = " + base + " and height = " + height + " is " + area + " sq. units");
	}

}
