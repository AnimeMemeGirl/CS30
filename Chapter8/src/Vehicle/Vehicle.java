package Vehicle;

/*

Program: Vehicle.java

Purpose: Create a vehicle class that is an abstract class defining the general details and actions associated with a vehicle.

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/

public abstract class Vehicle 
{

	private double Feconomy;
	private double carryCapacity;
	private String carryCapacityS;
	
	public Vehicle(double FeI, String Cc, double CcI)
	{
		
		Feconomy = FeI;
		carryCapacityS = Cc;
		carryCapacity = CcI;
		
	}
	
	public double getFeconomy()
	{
		return Feconomy;
	}
	
	public double getCarryCapacity()
	{
		return carryCapacity;
	}
	
	public String toString()
	{
		return("Fuel Economy: " + 
	           "Carrying Capacity: ");
	}
	
}

/* Screen Dump



 */
