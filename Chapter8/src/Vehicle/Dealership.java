package Vehicle;

/*

Program: Dealership.java

Purpose: For testing the vehicle classes.

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/

import java.util.Scanner;

public class Dealership 
{

	public static void main(String[] args)
	{
		
		Car vel1 = new Car("car", "Fuel Economy: ", 8.9, "Carrying Capacity: ", 5, "doors: ", 4);
		Truck vel2 = new Truck("truck", "Fuel Economy: ", 2.1, "Horse Power: ", 341, "Carrying Capacity: ", 3);
		Minivan vel3 = new Minivan("Minivan", "Fuel Economy: ", 9.3, "Carrying Capacity: ", 7, "Seatcap: ", 7);
		
		Scanner input = new Scanner(System.in);
		
		String action;
		int velNum = 0;
		
		Vehicle vel = vel1;
		
		do 
		{
			
			System.out.println("\n Vehicles \\ Quit");
			System.out.println("Enter Choice: ");
			action = input.next();
			
			if(!action.equalsIgnoreCase("Q"));
			{
				
				System.out.println("Choose a vehicle(1. Car, 2. Truck, 3. Minivan): ");
				velNum = input.nextInt();
				
				switch(velNum)
				{
				
				case 1: System.out.println(vel1); break;
				case 2: System.out.println(vel2); break;
				case 3: System.out.println(vel3); break;
					
				}
				
				
				
			}
			
		}while(!action.equalsIgnoreCase("Q"));
		
	}
	
}

/* Screen Dump



 */
