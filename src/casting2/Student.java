package casting2;

import java.util.Date;

public interface Student{
	
	 int getNo();
	 String getName();
     int getYear();
	 Date getDob();
	 String getMajor();
	
	public void study();
	
	public void register();
	
	@Override
    String toString();
}
