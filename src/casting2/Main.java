package casting2;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		RegistrationOffice office = new RegistrationOffice();
		
		Student student = office.getAStudent();
	    office.registerStudent(student);
	    
	    System.out.println("--------------");
	    
	    MasterStudent masterStudent = new MasterStudent(2, "Alice", 1, new Date(), " AI", " Dr. Smith", " AI in Healthcare");
        masterStudent.study();
        masterStudent.writeThesis();
        masterStudent.meetWithAdvisor();
		
        
        PhdStudent phdStudent = new PhdStudent(3, "Bob", 3, new Date(), "Physics", "Dr. Brown", "Quantum Mechanics", true);
        phdStudent.study();
        phdStudent.writePaper();
        phdStudent.meetWithAdvisor();
        
        System.out.println("\ninstanceof Kullanımı:");
        if (student instanceof UndergraduateStudent) {
            System.out.println(student.name + " is an UndergraduateStudent.");
        }

        if (masterStudent instanceof GraduateStudent) {
            System.out.println(masterStudent.name + " is a GraduateStudent.");
        }

        if (phdStudent instanceof PhdStudent) {
            System.out.println(phdStudent.name + " is a PhdStudent.");
        }
	}

}
