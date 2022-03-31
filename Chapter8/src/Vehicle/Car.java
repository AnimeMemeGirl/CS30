package Vehicle;

/*

Program: Car.java

Purpose: For holding, and return the car class.

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/

public class Car extends Vehicle
{
	
	private double Doors;
	private String DoorsS;
	private String Car;
	
   public Car(String c, String Fe, double FeI, String Cc, int CcI, String d, int Drs)
   {
	   
    super(FeI, Cc, CcI);
    Doors = Drs;
    DoorsS = d;
    Car = c;
   
   }
   
   public double getDoors()
   {
	   return Doors;
   }
   
   public String getDoorsS()
   {
	   return DoorsS;
   }
   
   public String getCar()
   {
	   return Car;
   }
   
   public String toString()
   {
	   return "Car type: Sedan" + " Fuel economy: " + 8.9 + " Carrying Capacity: " + 5 + " Doors: " + 4;
   }
   
}

/* Screen Dump



 */
