package casting2;

import java.util.Date;

public class GraduateStudent implements Student {

    private int no;
    protected String name;
    private int year;
    private Date dob;
    private String major;
    protected String thesis;
    protected String advisor;

    public GraduateStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
        this.advisor = advisor;
        this.thesis = thesis;
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
        System.out.println(name + " is writing thesis: " + thesis);
    }

    public void meetWithAdvisor() {
        System.out.println(name + " is meeting with advisor " + advisor);
    }

    @Override
    public String toString() {
        return "GraduateStudent{no=" + no + ", name='" + name + "', year=" + year +
               ", dob=" + dob + ", major='" + major + "', advisor='" + advisor +
               "', thesis='" + thesis + "'}";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
  
	public String getName() {
		return name;
	}
}
