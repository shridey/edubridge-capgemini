package july22.polymorphism.compiletime;

public class Area {
	
	public void area(double r) {
		System.out.println("Area of Circle: " + (3.14*r*r));
	}
	
	public void area(double l, double b) {
		System.out.println("Area of Rectangle: " + (l*b));
	}
	
	public static void main(String[] args) {
		Area area = new Area();
		area.area(5);
		area.area(5, 7.6);
	}
}
