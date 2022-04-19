package Roster;

public abstract class StuName 
{

	static String firstName;
	static String lastName;
	
	public StuName(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
		
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getlastName()
	{
		return lastName;
	}
	
	public String toString()
	{
		return("firstName" +
	           "lastName");
	}
}
