package august03.oops.challenge.q2;

class Student {
	String name;
	int score;
	
	public Student (String name, int score) {
		this.name = name;
		this.score = score;
	}
	
}

class Classroom {
	
	public String registerStudent(Student student) {
		if (!student.name.toUpperCase().equals(student.name)) {
			return "Block letters needed";
		}
		
		if (!(student.score >= 0 && student.score <= 100)) {
			return "Invalid Score";
		}
		
		return "Registered";
	}
	
	public String studentCard(String card) {
		boolean isValid = true;
		for (char c : card.toCharArray()) {
			if (!Character.isDigit(c)) {
				isValid = false;
				break;
			}
	    }
		
		if (isValid) {
			return "Valid card";
		} else {
			return "Invalid card";
		}
	}
	
}

public class Source {
	
	public static void main(String[] args) {
		Student s1 = new Student("A", 0);
		Classroom c1 = new Classroom();
		System.out.println(c1.registerStudent(s1));
	}

}
