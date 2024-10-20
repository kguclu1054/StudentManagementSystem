package casting2;

import java.util.Date;

public class RegistrationOffice {

	public RegistrationOffice() {
		System.out.println("Registration office is open");
	}
	
	public void registerStudent(Student student) {
		student.register();
		System.out.println("Registration completed for " + student);
	}

	public Student getAStudent() {
		return new UndergraduateStudent(1 , "John Doe", 2 , new Date() , "Computer Science)" , "Math");
	}
	
}
