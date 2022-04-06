package Review;

import java.io.*;
import java.util.Scanner;

public class MyFile 
{

	public static void main(String[] args)
	{
	
	Scanner input = new Scanner(System.in);
	
	//System.out.println("Please Enter the name of a file: ");
	
	//String fileName = input.next();
		
		   File textFile = new File("C:\\Users\\74013002\\git\\CS30\\Chapter 11Test\\src\\Review\\Myfiles.txt");
		
		   if(textFile.exists())
		   {
			System.out.println("File already exists.");
		   }
		   else
		   {
			System.out.println("File does not exist.");
		   }
	
	
	}
	
}
