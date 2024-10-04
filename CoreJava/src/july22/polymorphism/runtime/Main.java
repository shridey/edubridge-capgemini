package july22.polymorphism.runtime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle(3, 7);
		Shape circle = new Circle(6.7);
		
		rectangle.area();
		circle.area();
	}

}
