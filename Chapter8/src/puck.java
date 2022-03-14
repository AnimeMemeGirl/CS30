/*

Program: puck.java          

Purpose: Create a puck class that inherits the disk class.

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/


public class puck extends circle
{
	
	double AdMax = 5.5;
	double AdMin = 5;
	double YthMax = 4.5;
	double YthMin = 4;
	double weight;
	boolean standard, youth;
	
	/*
	 puck weight constructor
	 */
	
	public puck(double w)
	{
		
		weight = w;
		
		if(weight >= AdMin && weight <= AdMax)
		{
			standard = true;
			youth = false;
		}
		
		else if(weight >= YthMin && weight <= YthMax)
		{
			standard = false;
			youth = true;
		}


	}
	
	/*
	 string constructor for division
	 */
	
  public String getDivision()
  {
	  
	  String div;
	  if(standard)
	  {
		  div = "puck is standard";
	  }
	  
	  else
	  {
		  div = "puck is youth";
	  }
		
	  
	  return div;
  }
  
  /*
   constructor for returning weight
   */
  
  public double getWeight()
  {
	  return(weight);
  }
	
  /*
   boolean used to return if the weight is true or false
   */
  
  public boolean equals(Object p)
  {
	  
	  puck testObj = (puck)p;
	  if(testObj.getWeight() == weight)
	  {
		  return(true);
	  }
	  else
	  {
		  return false;
	  }
	  
  }
  
  /*
   checks if the weights are equal
   */
  
  public int compareTo(Object p)
  {
	  
	  puck testPuck = (puck)p;
	  
	  if(weight < testPuck.getWeight())
	  {
		  return(-1);
	  }
	  else if(weight == testPuck.getWeight())
	  {
		  return(0);
	  }
	  else
	  {
		  return(1);
	  }
	  
  }
  
}

/* Screen Dump


 
 */