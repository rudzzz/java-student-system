package student_database_app;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many students you want to Enroll? ");
		int numnerOfStudents = scanner.nextInt();
		
		Student[] students = new Student[numnerOfStudents];
		
		for (int i = 0; i < numnerOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll(); 
			students[i].payTuition();
		}
	}

}
