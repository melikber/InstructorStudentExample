package odevJava;


public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmailAddress("engintatamata@gmail.com");
		instructor.setAchievement("Nasa etc. he worked as a consultant in institutions");
		
		Student student = new Student();
		
		student.setId(1);
		student.setFirstName("Melikber");
		student.setLastName("Gungor");
		student.setEmailAddress("melikbergngr@gmail.com");
		student.setSchoolName("Istanbul Aydýn University");
		
		Student[] students = {student};
		
		for(Student studentItem : students) {
			System.out.println("Student  : " + studentItem.getFirstName() + " " + studentItem.getLastName());
			System.out.println("Student Email   : " + studentItem.getEmailAddress());
			System.out.println("Student's School   : " + studentItem.getSchoolName());
		}
		
		Instructor[] instructors = {instructor};
		
		for (Instructor instructorItem : instructors) {
			System.out.println("\nInstructors   : " + instructorItem.getFirstName() + " " + instructorItem.getLastName() );
			System.out.println("Instructor Achievements   : " + instructorItem.getAchievement());
			System.out.println("Instructor Email   : " + instructorItem.getEmailAddress());
		}
		
		User[] users = {student,instructor};
		
		UserManager userManager = new UserManager();
		
		for (User user : users) {
			
			userManager.add(user);
			userManager.update(user);
			
			System.out.println("\n");
		}
		
		InstructorManager instructorManager = new InstructorManager();
		
		for (Instructor instructorItem : instructors) {
			
			instructorManager.logIn(instructorItem);
			instructorManager.logOut(instructorItem);
		}
			
		StudentManager studentManager = new StudentManager();
		
		for (Student studentItem : students) {
			studentManager.logIn(studentItem);
			studentManager.logOut(studentItem);
		}		
	}
}