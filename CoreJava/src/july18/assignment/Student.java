package july18.assignment;

public class Student {

    int total;
    int subjectCount;
    double percentage;
        
    Student(int totalMarks, int numberOfSubjects) {
       total = totalMarks;
       subjectCount = numberOfSubjects;
    }
    
    void finalresult() {
    	percentage = (total / (subjectCount * 1.0));
    	if(percentage >= 80) {
    		System.out.println(percentage + "%: Passed with I divion");
    	} else if(percentage >= 60) {
    		System.out.println(percentage + "%: Passed with II divion");
    	} else if(percentage >= 40) {
    		System.out.println(percentage + "%: Passed with III divion");
    	} else {
    		System.out.println(percentage + "%: Failed..!!");
    	}
    }
}
