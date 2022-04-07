package Review;

/*

Program: MyFile2.java

Purpose: Create a MyFile application that creates a file named zzz.txt and then displays a message that the file has been created.

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/

import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Scanner;

public class MyFile2 
{

	public static void main(String[] args)
	{
	
		
		File textFile = new File("zzz.txt");
		
		Scanner input = new Scanner(System.in);
		
			try
			{
				textFile.createNewFile();
				System.out.println("New file created.");
			}catch(IOException e) 
			{
				System.out.println("File could not be created.");
				System.err.println("IOException: " + e.getMessage());
			}
			
			System.out.println("n\\ Keep File \\ Delete");
			
			String action = input.next();
			String K;
			String D;
			
			if(action.equalsIgnoreCase("K"))
			{
				textFile.exists();
				System.out.println("The file has been kept.");
			}
			else if(action.equalsIgnoreCase("D"))
			{
				textFile.delete();
				System.out.println("The file has been deleted.");
			}

	}
	
}
/*
screen dump



 */
