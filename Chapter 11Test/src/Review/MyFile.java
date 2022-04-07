package Review;

/*

Program: Myfile.java

Purpose: Create a MyFile application that prompts the user for the name of a file and then displays a message indicates whether the files exists or not.

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/

import java.io.*;
import java.util.Scanner;

public class MyFile 
{

	public static void main(String[] args)
	{
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please Enter the name of a file: ");
	
	String fileName = input.next();
		
		   File textFile = new File(fileName);
		
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

/*
screen dump



 */
