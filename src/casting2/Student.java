package casting2;

import java.util.Date;

public class Student{
	
	protected int no;
	protected String name;
	protected int year;
	protected Date dob;
	protected String major;
	
	
	public Student(int no, String name, int year , Date dob , String major) {
		this.no = no;
		this.name = name;
		this.dob = dob;
		this.major = major;
	}
	
	public void study() {
		System.out.println(name + " is studying");
	}
	
	public void register() {
		System.out.println(name + " has registered");
	}
	
	@Override
	public String toString() {
		return "Student no= " + no + " ,name " + name + " ,year" + year + " ,dob" + dob + " ,major" + major;
	}
	
}
