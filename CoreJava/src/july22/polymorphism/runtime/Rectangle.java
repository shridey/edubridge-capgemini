package july22.polymorphism.runtime;

public class Rectangle extends Shape {
	private double length, breadth;
	
	Rectangle(double l, double b) {
		this.setLength(l);
		this.setBreadth(b);
	}
	
	@Override
	void area() {
		super.area();
		System.out.println("Area of Rectangle: " + (this.getLength() * this.getBreadth()));
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
}
