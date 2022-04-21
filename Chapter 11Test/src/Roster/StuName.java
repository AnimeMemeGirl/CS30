package Roster;

import java.io.Serializable;

public class StuName implements Serializable 
{

	private String firstName;
	private String lastName;
	
	public StuName(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
		
	}
	
	
	
	public String toString()
	{
		return(firstName +
	           lastName);
	}
}
