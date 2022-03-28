package Vehicle;

public class Truck extends Vehicle
{

	private double horsePower;
	
	   public Truck(double Fe, double Hp, double Cc)
	   {
		   
	   super(Fe, Hp);
	   horsePower = Hp;
	   
	   }
	   
	   public Double getHorsePower()
	   {
		   return horsePower;
	   }
	   
}
