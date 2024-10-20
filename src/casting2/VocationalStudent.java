package casting2;

import java.util.Date;

public class VocationalStudent extends Student{

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}
	
	@Override
	public void study() {
		System.out.println(name + " is studying vocational courses");
	}
	
	@Override
	public void register() {
		System.out.println(name + " has registered vocational courses");
	}
	
	@Override
	public String toString() {
		return "VocationalStudent" + super.toString();
	}

	
	
}
