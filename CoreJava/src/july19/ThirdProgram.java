package july19;

class GrandParent {
	void display1() {
		System.out.println("GrandParent display!");
	}
}

class Parent extends GrandParent {
	void display2() {
		System.out.println("Parent display!");
	}
}

class GrandChild extends Parent {
	void display3() {
		System.out.println("GrandChild display!");
	}
}

public class ThirdProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild g = new GrandChild();
		g.display1();
		g.display2();
		g.display3();
	}

}
