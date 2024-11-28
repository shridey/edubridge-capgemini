package com.hibernate.students;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table (name = "course")
public class Course {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "course_id")
	private int courseId;
	
	@Column (name = "course_name", nullable = false, length = 20)
	private String courseName;
	
	@Column (name = "course_price", nullable = false)
	private float coursePrice;
	
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn (name = "course_id")
	List<Student> students = new ArrayList<Student>();

	public Course() {
		super();
	}

	public Course(String courseName, float coursePrice) {
		super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public float getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(float coursePrice) {
		this.coursePrice = coursePrice;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", coursePrice=" + coursePrice
				+ ", students=" + students + "]";
	}

}
