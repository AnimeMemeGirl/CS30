package Uemployee;

/*

Program: Faculty.java

Purpose: for storing and returning the department name.

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/

public class Faculty extends Uemployee
{

	private String department;
	
	public Faculty(String fn, String ln, double sal, String departmentName)
	{
		
		super(fn, ln, sal);
		department = departmentName;
		
	}
	
	public String departmentName()
	{
		return department;
	}
	
	
}

/* Screen Dump



 */