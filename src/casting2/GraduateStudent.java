package casting2;

import java.util.Date;

public class GraduateStudent extends Student {
	
	protected String thesis;
	protected String advisor;

	public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor ,String thesis) {
		super(no, name, year, dob, major);
		this.thesis = thesis;
		this.advisor = advisor;
	}

	@Override 
	public void study() {
		System.out.println(name + " is studying for a graduate degree.");
	}
	
	@Override
	public void register() {
		System.out.println(name + " has registered for the Graduate program.");
	}
	
	public void writeThesis() {
		System.out.println(name + " is writing thesis: " + this.thesis);
	}
	
	public void meetWithAdvisor() {
		System.out.println(name + " is meeting with advisor" + this.advisor);
	}

	
}
