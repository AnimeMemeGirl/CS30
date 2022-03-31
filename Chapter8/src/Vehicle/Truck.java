package Vehicle;

/*

Program: Truck.java

Purpose: For holding and returning the Truck class.

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/

public class Truck extends Vehicle
{

	private double horsePower;
	private String Truck;
	private String horsePowerS;
	
	   public Truck(String t, String Fe, double FeI, String Hp, int HpI, String Cc, int CcI)
	   {
		   
	   super(FeI, Cc, CcI);
	   horsePower = HpI;
	   horsePowerS = Hp;
	   Truck = t;
	   
	   }
	   
	   public Double getHorsePower()
	   {
		   return horsePower;
	   }
	   
	   public String getHorsePowerS()
	   {
		   return horsePowerS;
	   }
	   
	   public String getTruck()
	   {
		   return Truck;
	   }
	   
	   public String toString()
	   {
		   return "Car type: truck" + " Fuel economy: " + 2.1 + " Horse Power: " + 341 + " Carrying Capacity: " + 3;
	   }
	   
}

/* Screen Dump



 */
