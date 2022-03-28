package Vehicle;

public class Car extends Vehicle
{
	
	private double Doors;
	
   public Car(double Fe, double Cc, double Drs)
   {
	   
    super(Fe, Cc);
    Doors = Drs;
   
   }
   
   public double getDoors()
   {
	   return Doors;
   }
   
}
