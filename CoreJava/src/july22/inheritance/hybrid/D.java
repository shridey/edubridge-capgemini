package july22.inheritance.hybrid;

public class D extends A implements C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		d.printA();
		d.printB();
		d.printC();
	}

	@Override
	public void printC() {
		// TODO Auto-generated method stub
		System.out.println("Printing from Interface C");
	}

	@Override
	public void printB() {
		// TODO Auto-generated method stub
		System.out.println("Printing from Interface B");
	}

}
