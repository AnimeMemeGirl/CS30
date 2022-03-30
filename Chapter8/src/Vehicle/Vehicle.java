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
	
	public Vehicle(double FeI, double CcI)
	{
		
		Feconomy = FeI;
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
