package casting2;

import java.util.Date;

public class UndergraduateStudent implements Student {

    private int no;
    private String name;
    private int year;
    private Date dob;
    private String major;
    private String minor;

    public UndergraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
        this.minor = minor;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying undergraduate courses with a minor in " + minor);
    }

    @Override
    public void register() {
        System.out.println(name + " has registered as an undergraduate student.");
    }

    @Override
    public String toString() {
        return "UndergraduateStudent{no=" + no + ", name='" + name + "', year=" + year +
                ", dob=" + dob + ", major='" + major + "', minor='" + minor + "'}";
    }

    @Override
    public int getNo() {
        return no;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public Date getDob() {
        return dob;
    }

    @Override
    public String getMajor() {
        return major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }
}
