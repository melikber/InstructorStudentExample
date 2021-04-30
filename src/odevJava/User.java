package odevJava;

public class User {

	private int id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String emailAddress) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		
}
	
	
		public int getId() {
		return id;
	
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
		public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
		public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
		public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	


	}
