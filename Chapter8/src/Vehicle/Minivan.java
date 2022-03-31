package Vehicle;

/*

Program: Minivan.java

Purpose: For holding and returning the Minivan.

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/

public class Minivan extends Vehicle
{
	
	private String seatCapS;
	private double seatCap;
	private String Minivan;
	
	public Minivan(String M, String Fe, double FeI, String Cc, int CcI, String Sc, int ScI)
	{
		super(FeI, Cc, CcI);
		seatCapS = Sc;
		seatCap = ScI;
		Minivan = M;
		
	}
	
	public Double getSeatCap()
	{
		return seatCap;
	}
	
	public String getSeatCapS()
	{
		return seatCapS;
	}
	
	public String getMinivan()
	{
		return Minivan;
	}
	
	   public String toString()
	   {
		   return "Car type: Minivan" + " Fuel economy: " + 9.3 + " Carrying Capacity: " + 7 + " Seatcap: " + 7;
	   }
	
}

/* Screen Dump



 */
