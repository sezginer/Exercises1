package main;

import java.util.Date;

public interface Interfaces {
		
	public int loadData(String filename);
	public String[] findByName(String firstname, String lastname);
	public String[] findByDepartment(String department);
	public String[] findByTelephoneNumber(String telephoneNumber);
	public String[] findByEndDate(Date intervalStart, Date IntervalEnd);
	
}
