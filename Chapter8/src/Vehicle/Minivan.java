package Vehicle;

public class Minivan extends Vehicle
{
	
	private double seatCap;
	
	public Minivan(Double Fe, double Cc, double Sc)
	{
		super(Fe, Cc);
		seatCap = Sc;
		
	}
	
	public Double getSeatCap()
	{
		return seatCap;
	}
	
}
