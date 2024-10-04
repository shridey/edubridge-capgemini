package july22.polymorphism.runtime;

public class Circle extends Shape {
	double radius;
	
	Circle(double r) {
		this.setRadius(r);
	}
	
	@Override
	void area() {
		super.area();
		System.out.println("Area of a Circle: " + (3.14 * radius * radius));
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
