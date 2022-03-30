package Vehicle;

import java.util.Scanner;

public class Dealership 
{

	public static void main(String[] args)
	{
		
		Car vel1 = new Car("car", "Fuel economy: ", 8.9, "Carrying Capacity: ", 5, "doors: ", 4);
		Truck vel2 = new Truck("truck", "Fuel Economy: ", 2.1, "Horse Power: ", 341, "Carrying Capacity: ", 3);
		
		Scanner input = new Scanner(System.in);
		
		String action;
		int velNum = 0;
		
		Vehicle vel = vel1;
		
		do 
		{
			
			System.out.println("\n Car \\ Minivan \\ Truck \\ Quit");
			System.out.println("Enter Choice: ");
			action = input.next();
			
			if(!action.equalsIgnoreCase("Q"));
			{
				
				System.out.println();
				velNum = input.nextInt();
				
				switch(velNum)
				{
				
				case 1: vel = vel1; break;
				case 2: vel = vel2; break;
				
				}
				
			}
			
		}while(!action.equalsIgnoreCase("Q"));
		
	}
	
}
