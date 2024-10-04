package july20;

public class Rectangle implements Shape {
	
	double length, breadth;
	
	Rectangle(double l, double b) {
		length = l;
		breadth = b;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 1.0 * length * breadth;
	}

}
