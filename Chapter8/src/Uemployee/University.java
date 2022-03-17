package Uemployee;

import java.text.NumberFormat;
import java.util.Scanner;

public class University 
{


	
	public static void main(String[] args) 
	{
		Staff emp1 = new Staff("Steve", "Jobs", 65000, "Teacher");
		Faculty emp2 = new Faculty("Bill", "Gates", 32000, "Janitor");
		
		Scanner input = new Scanner(System.in);
		
		String action;
		int empNum = 0;		
		

		Uemployee emp = emp1;
		
		do 
		{
			 System.out.println("\n employee \\ Quit");
			 System.out.println("Enter choice: ");
			 action = input.next();
			 
			 if(!action.equalsIgnoreCase("Q"))
			 {

				 System.out.println("Enter employee number(1, or 2): ");
				 empNum = input.nextInt();
				 
				 switch(empNum)
				 {
				 case 1: emp = emp1; break;
				 case 2: emp = emp2; break;
				 }
			 
			     if(action.equalsIgnoreCase("e")) 
			     {
			       System.out.println(emp);
			     }

			 
			
		        }while(!action.equalsIgnoreCase("Q"));
		}
	}
	
}
