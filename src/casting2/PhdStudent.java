package casting2;

import java.util.Date;

public class PhdStudent extends GraduateStudent {
	
	private boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis , boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}
	
	public void writePaper() {
		System.out.println(name + "is writing a research paper.");
	}

	@Override 
	public void study() {
		System.out.println(name + " is studying for a PhD.");
	}
	
	@Override
	public void register() {
		System.out.println(name + " has registered for the PhD program.");
	}
	
	public void writeThesis() {
		System.out.println(name + " is writing a PhD thesis on: " + this.thesis);
	}
	
	public void meetWithAdvisor() {
		System.out.println(name + " is meeting with advisor" + this.advisor);
	}

	
}
