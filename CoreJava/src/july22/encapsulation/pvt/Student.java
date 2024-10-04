package july22.encapsulation.pvt;

public class Student {
	private int studentID;
	private String studentName;
	private double studentPercentage;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public double getStudentPercentage() {
		return studentPercentage;
	}
	public void setStudentPercentage(double studentPercentage) {
		this.studentPercentage = studentPercentage;
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentID(15);
		student.setStudentName("Shridhar");
		student.setStudentPercentage(99);
		
		System.out.println(student.getStudentID());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentPercentage());
	}
}
