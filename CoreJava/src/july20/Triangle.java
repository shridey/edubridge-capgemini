package july20;

public class Triangle implements Shape {
	
	double base, height;
	
	Triangle(double b, double h) {
		base = b;
		height = h;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (base * height) / 2.0;
	}

}
