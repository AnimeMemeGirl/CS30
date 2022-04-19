package Roster;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Roster extends StuName
{

	public Roster(String fn, String ln) 
	{
		super(fn, ln);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		
		File dataFile; 
		FileWriter out;
		String fileName;
		BufferedWriter writeFile;
		int StuNum;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name Of The File: ");
		fileName = input.next();
		System.out.print("Enter The Number Of Students: ");
		StuNum = input.nextInt();
		
		try
		{
			
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for (int i = 0; i < StuNum; i++)
			{
				
				System.out.print("Enter the Student's First Name: ");
				firstName = input.next();
				System.out.print("Enter the Student's Last Name: ");
				lastName = input.next();
				writeFile.write(firstName);
				writeFile.newLine();
				writeFile.write(lastName);
				writeFile.newLine();
			}
			writeFile.close();
			out.close();
			System.out.println("Data Written To File.");
			
			System.out.println("First name: " + firstName + "Last Name: " + lastName);
			                   
			
		}catch (IOException e)
		{
			System.out.println("Problem Writing To File.");
			System.err.println("IOException: " + e.getMessage());
		}
		
	}
	
}
