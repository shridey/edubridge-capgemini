package july20;

public class Circle implements Shape {
	
	double radius;
	
	Circle(double r) {
		radius = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14 * radius * radius;
	}

}
