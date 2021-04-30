package odevJava;


public class StudentManager extends UserManager {
	
	public void logIn(Student student) {		
		
		System.out.println("\n");
		
		System.out.println(student.getFirstName() +"  log in Kodlama.io");
	}

	public void logOut(Student student) {	
		System.out.println(student.getFirstName() + "  log out Kodlama.io");
	}
}