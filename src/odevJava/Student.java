package odevJava;

public class Student extends User{
	
	private String schoolName;
	
	public Student() {
		
	}
	
	public Student(int id,String firstName,String lastName,String emailAddress,String schoolName) {
		super(id,firstName,lastName,emailAddress);
		this.schoolName = schoolName;
		
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
}
