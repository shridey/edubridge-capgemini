package july19;

class SecondProgramParent {
	void display() {
		System.out.println("In Parent Class");
	}
}

public class SecondProgram extends SecondProgramParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondProgram s = new SecondProgram();
		s.display();
		
		SecondProgramParent p = new SecondProgramParent();
		p.display();
	}
	
	void display() {
		System.out.println("In Child Class");
	}

}
