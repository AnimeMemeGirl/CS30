package Uemployee;

/*

Program: Staff.java

Purpose: For holding and returning the job title.

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/

public class Staff extends Uemployee
{

	private String title;
	
	public Staff(String fn, String ln, double sal, String jobTitle)
	{
		
		super(fn, ln, sal);
		title = jobTitle;
		
	}
	
	public String getTitle()
	{
		return title;
	}
	
	
	
}

/* Screen Dump



 */