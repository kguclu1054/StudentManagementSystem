package casting2;

import java.util.Date;

public class UndergraduateStudent extends Student{

	private String minor;
	
	public UndergraduateStudent(int no, String name, int year, Date dob, String major , String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;	
	}
	
	public String getMinor() {
		return minor;
	}
	
	public void setMinor() {
		this.minor = minor;
	}
	
	@Override
	public void study() {
		System.out.println(name + " is studying undergraduate courses with a minor in");
	}
	
	@Override
	public void register() {
		System.out.println(name + " has registered undergraduate student");
	}
	
	@Override
	public String toString() {
		return "UndergraduateStudent" + super.toString() + " , minor" + minor; 
	}
	
	
}
