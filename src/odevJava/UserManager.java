package odevJava;

public class UserManager {
	public void add(User user) {
	
		System.out.println("\n");
		
		System.out.println(user.getFirstName() + "" + user.getLastName() + "   User information has been saved");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName()  + "   User information has been updated");
	}
}