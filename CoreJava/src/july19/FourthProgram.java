package july19;

class ABC {
	public void print_ABC() {
		System.out.println("Cooking");
	}
}
 
class XYZ extends ABC {
	public void print_XYZ() {
		System.out.println("Emerging Technology");
	}
}

class PQR extends XYZ {
	public void print_PQR() {
		System.out.println("IoT");
	}
}

public class FourthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PQR d = new PQR();
		d.print_ABC();
		d.print_XYZ();
		d.print_PQR();
	}

}
