package august07.designpattern.factorypattern;

import java.util.Scanner;

interface Shape{
	void draw();
}

class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("This is the square draw");		
	}
	
}

class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("This is the rectangle draw");		
	}
	
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("This is the circle draw");		
	}
	
}

class FactoryClass{ //this class is like container
	Shape obj;
	public Shape getObject(String str) {
		if(str.equalsIgnoreCase("Circle")) {
			obj = new Circle();
			return obj;
		}
		else if(str.equalsIgnoreCase("Square")) {
			obj = new Square();
			return obj;
		}
		else if(str.equalsIgnoreCase("Rectangle")) {
			obj = new Rectangle();
			return obj;
		}
		else {
			return null;
		}
	}
}

public class Main {

	public static void main(String[] args) {
//		Circle c= new Circle();
//		c.draw();
		
//		Shape obj;
//		
//		obj = new Square();
//		obj.draw();
//		
//		obj = new Circle();
//		obj.draw();
//		
//		obj = new Rectangle();
//		obj.draw();
		
		Scanner sc=new Scanner(System.in);
		
		FactoryClass obj = new FactoryClass();
		System.out.print("Enter the shape to be drawn: ");
		String sh = sc.next();
		sc.close();
		
		Shape sob = obj.getObject(sh);
		
		sob.draw();

	}

}
