package casting2;

import java.util.Date;

public class MasterStudent extends GraduateStudent{
	
	public MasterStudent(int no, String name, int year, Date dob, String major , String advisor ,String thesis) {
		super(no, name, year, dob, major, advisor , thesis);
		}
	
	@Override
	public void writeThesis() {
		System.out.println(name + "is writing a Master's thesis on" + thesis);
	}

	@Override
	public void study() {
		System.out.println(name + " is studying for a Master's program");
	}
	
	@Override
	public void register() {
		System.out.println(name + " has registered for a Master's program");
	}
	
	@Override
	public void meetWithAdvisor() {
		System.out.println(name + "is meeting with advisor" + this.advisor);
	}
}
