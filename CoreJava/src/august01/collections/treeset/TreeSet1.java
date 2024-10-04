package august01.collections.treeset;

import java.util.Comparator;
import java.util.TreeSet;


class Student1 {
	private int studentID;
	private String studentName;
	private float studentFees;
	
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student1(int studentID, String studentName, float studentFees) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentFees = studentFees;
	}

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

	public float getStudentFees() {
		return studentFees;
	}

	public void setStudentFees(float studentFees) {
		this.studentFees = studentFees;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ "]";
	}
	
	public static Comparator<Student1> sortByID = new Comparator<Student1>() {
		 
        public int compare(Student1 s1, Student1 s2) {
            return s1.studentID - s2.studentID;
        }
        
    };
}

public class TreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student1> students = new TreeSet<Student1>(Student1.sortByID);
		
		Student1 s1 = new Student1(8, "Prashant", 5645.f);
		Student1 s2 = new Student1(1, "Yashuman", 8754.f);
		Student1 s3 = new Student1(5, "Abhishek", 9745.f);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		System.out.println(students);
	}

}
