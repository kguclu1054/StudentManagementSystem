package casting2;

import java.util.Date;

public class VocationalStudent implements Student {

    private int no;
    protected String name;
    private int year;
    private Date dob;
    private String major;

    public VocationalStudent(int no, String name, int year, Date dob, String major) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying vocational courses.");
    }

    @Override
    public void register() {
        System.out.println(name + " has registered for vocational courses.");
    }

    @Override
    public String toString() {
        return "VocationalStudent{no=" + no + ", name='" + name + "', year=" + year +
               ", dob=" + dob + ", major='" + major + "'}";
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
}
