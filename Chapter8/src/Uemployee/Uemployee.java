package Uemployee;

/*

Program: Uemployee.java

Purpose: Create a Uemployee class that contains member variables for the university employee name and salary.

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/

public abstract class Uemployee 
{

	private String firstName, lastName;
	private double salary;
	
	public Uemployee(String fn, String ln, double sal)
	{
		
		firstName = fn;
		lastName = ln;
		salary = sal;
		
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getlastName()
	{
		return lastName;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setfirstName(String fn)
	{
		firstName = fn;
	}
	
	public void setlastName(String ln)
	{
		lastName = ln;
	}
	
	public void setsalary(double sal)
	{
		salary = sal;
	}
	
	public String toString()
	{
		return("First Name: " + firstName + " Last Name: " + lastName + " Salary: " + salary);
	}
	
}

/* Screen Dump



 */
