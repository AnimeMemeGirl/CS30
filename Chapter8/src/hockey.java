import java.text.NumberFormat;
import java.util.Scanner;

/*

Program: Hockey.java

Purpose: Test the puck class

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/

public class hockey 
{

		/*
		 
		 launch the application
		 
		 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		puck pA = new puck(5.5);
		puck yt = new puck(4.5);
		
		//standard puck
		System.out.println(pA.getWeight());
		System.out.println(pA.getDivision());
		System.out.println(pA.getRadius());
		
		//youth puck
		System.out.println(yt.getWeight());
		System.out.println(yt.getDivision());
		System.out.println(yt.getRadius());
		
		
		String action;
		int w;
		double wArg;
		
		/*
		 output
		 */
		if(pA.equals(yt))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(pA.compareTo(yt) == -1)
		{
			System.out.println(pA + " Is greater than " + yt);
		}
		
	}
	
}

/* Screen Dump



 */
