package Chapter9;

import java.util.Scanner;

public class FindName 
{

	public static void main(String[] args)
	{
		
	   Scanner input = new Scanner(System.in);
	   String name;
	   String[] nameCount = new String[5];
	
	
       for(int i = 0; i < nameCount.length;i ++)
       {
    	   
    	   System.out.println("Please Enter A Name: ");
    	   name = input.next();
    	   nameCount[i] = name;
       }
    
	}
	
}
