package august07.designpattern.decorator;

interface Shape {
	public void draw();
}

class Square implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing square");
	}
	
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing rectangle");
	}
	
}

class Triangle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing triangle");
	}
	
}

class Circle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
	}
	
}

class Rhombus implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing rhombus");
	}
	
}

abstract class ShapeDecorator implements Shape {
	protected Shape shape;
	
	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}
	
	public void draw() {
		shape.draw();
	}
}

class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
	}
	
	@Override
    public void draw() {
        shape.draw();
        setRedBorder(shape);
    }
    
    private void setRedBorder(Shape shape) {
        System.out.println(shape + " Border color: Red");
    }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape;		
		
		shape = new Square();
		shape.draw();
		
		System.out.println();
		
		shape = new Rectangle();
		shape.draw();
		
		System.out.println();
		
		shape = new Triangle();
		shape.draw();
		
		System.out.println();
		
		shape = new Circle();
		shape.draw();
		
		System.out.println();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		redCircle.draw();
		
		System.out.println();
		
		Shape redSquare = new RedShapeDecorator(new Square());
		redSquare.draw();
		
		System.out.println();
		
		Shape redTriangle = new RedShapeDecorator(new Triangle());
		redTriangle.draw();
		
		System.out.println();
		
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		redRectangle.draw();
		
		System.out.println();
		
		Shape rhombus = new Rhombus();
		rhombus.draw();
		
		System.out.println();
		
		Shape redRhombus = new RedShapeDecorator(new Rhombus());
		redRhombus.draw();
	}
	
	void printOne() {
		System.out.println("One");
	}
	
	void printTwo() {
		System.out.println("Two");
		printOne();
	}

}
