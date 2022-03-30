package Vehicle;

public class Car extends Vehicle
{
	
	private double Doors;
	private String DoorsS;
	private String Car;
	
   public Car(String c, String Fe, double FeI, String Cc, int CcI, String d, int Drs)
   {
	   
    super(FeI, CcI);
    Doors = Drs;
    DoorsS = d;
    Car = c;
   
   }
   
   public double getDoors()
   {
	   return Doors;
   }
   
}
