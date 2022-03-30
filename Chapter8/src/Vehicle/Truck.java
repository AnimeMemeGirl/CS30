package Vehicle;

public class Truck extends Vehicle
{

	private double horsePower;
	private String Truck;
	private String horsePowerS;
	
	   public Truck(String t, String Fe, double FeI, String Hp, int HpI, String Cc, int CcI)
	   {
		   
	   super(FeI, CcI);
	   horsePower = HpI;
	   horsePowerS = Hp;
	   Truck = t;
	   
	   }
	   
	   public Double getHorsePower()
	   {
		   return horsePower;
	   }
	   
}
