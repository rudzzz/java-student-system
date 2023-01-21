package student_database_app;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	public Student() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter student First Name");
		this.firstName = scanner.nextLine();
		
		System.out.println("Enter student Last Name");
		this.lastName = scanner.nextLine();
		
		System.out.println("1- Freshman\n2 - for Sophmore\n3 - Junior\nEnter student class level");
		this.gradeYear = scanner.nextInt();
		
		setStudentId();
		System.out.println(firstName + " " + lastName + " - " + gradeYear + " " + studentId);
	}
	
	private void setStudentId() {
		id++;
		this.studentId =  this.gradeYear + "" + id;
	}
	
	public void enroll() {
		do {
			System.out.println("Enter course to enroll or Q to quit");
			Scanner scanner = new Scanner(System.in);
			String course = scanner.nextLine();
			
			if(!course.equals("Q")) {
				courses = course + "\n" + courses;
				tuitionBalance += costOfCourse;
			}
			else {
				break;
			}
		} while (1 != 0);
		System.out.println("ENROLLED IN: " + courses);
	}
	
	public void viewBalance() {
		System.out.println("Your balance is: " + tuitionBalance);
	}
	
	public void payTuition() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your payment: ");
		int payment = scanner.nextInt();
		scanner.close();
		tuitionBalance -= payment;
		System.out.println("Thank you for you payment of $" + payment);
		viewBalance(); 
	}
	
	public String showInfo() {
		return "Name: " + firstName + " " + lastName
		 + "\nCourses Enrolled: " + courses +
		  "\n Balance: $" + tuitionBalance;
	}
}
