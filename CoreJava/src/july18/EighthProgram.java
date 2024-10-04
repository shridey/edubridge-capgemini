package july18;

class Student {
	public static String name = "Shridhar";
	public static double fees;
}

public class EighthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.fees = 5000;
		System.out.println("Name: " + Student.name);
		System.out.println("Fees: " + Student.fees);
		
		Student student = new Student();
		student.name = "Shridhar";
		student.fees = 6000;
		System.out.println(student.name);
		System.out.println(student.fees);
	}

}
