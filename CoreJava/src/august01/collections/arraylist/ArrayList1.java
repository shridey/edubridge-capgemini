package august01.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student {
	private int studentID;
	private String studentName;
	private float studentFees;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentID, String studentName, float studentFees) {
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
	
	public static Comparator<Student> sortByID = new Comparator<Student>() {
		 
        public int compare(Student s1, Student s2) {
            return s1.studentID - s2.studentID;
        }
        
    };
}

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student s1 = new Student(8, "Prashant", 5645.f);
		Student s2 = new Student(1, "Yashuman", 8754.f);
		Student s3 = new Student(5, "Abhishek", 9745.f);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		Iterator<Student> it1 = students.iterator();
		
		System.out.println("SID\tStudentName\tSFees");
		while(it1.hasNext()) {
			Student s = it1.next();
			System.out.println(s.getStudentID() + "\t" + s.getStudentName() + "\t" + s.getStudentFees());
		}
		
		System.out.println();
		
		Collections.sort(students, Student.sortByID);
		
		Iterator<Student> it2 = students.iterator();
		
		System.out.println("SID\tStudentName\tSFees");
		while(it2.hasNext()) {
			Student s = it2.next();
			System.out.println(s.getStudentID() + "\t" + s.getStudentName() + "\t" + s.getStudentFees());
		}
	}

}
