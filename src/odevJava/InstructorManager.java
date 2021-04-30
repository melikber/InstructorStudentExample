package odevJava;

public class InstructorManager extends UserManager {
	
	public void logIn(Instructor instructor) {
		
		System.out.println(instructor.getFirstName() + "  " + instructor.getLastName() + " Welcome");
	}
	
	public void logOut(Instructor instructor) {
		
		System.out.println(instructor.getFirstName() + "  "+  instructor.getLastName() + " Good Bye!");
	}
}