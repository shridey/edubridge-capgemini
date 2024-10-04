package july18.assignment;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numberOfStudents = sc.nextInt();
		
		Student[] students = new Student[numberOfStudents];
		
		System.out.print("Enter number of subjects per student: ");
		int numberOfSubjects = sc.nextInt();
		
		System.out.println();
		
		for(int i = 0; i < numberOfStudents; i++) {
			int total = 0;
			for(int j = 0; j < numberOfSubjects; j++) {
				System.out.print("Enter Marks of Student " + (i+1) + " Subject " + (j+1) + ": ");
				total += sc.nextInt();
			}
			students[i] = new Student(total, numberOfSubjects);
			System.out.println();
		}
		sc.close();
		
		System.out.println("******Results******");
		System.out.println();
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("Student " + (i+1) + ":");
			students[i].finalresult();
			System.out.println();
		}
	}
}
