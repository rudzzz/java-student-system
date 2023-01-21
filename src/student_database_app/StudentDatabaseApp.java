package student_database_app;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Student student1 = new Student(); 
		student1.enroll(); 
		student1.payTuition();
		System.out.println(student1.showInfo());
	}

}
