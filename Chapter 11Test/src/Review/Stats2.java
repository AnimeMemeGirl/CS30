package Review;

import java.io.*;
import java.util.Scanner;

public class Stats2 
{

	public static void main(String[] args)
	{
		
		File dataFile; 
		FileWriter out;
		BufferedWriter writeFile;
		Scanner input = new Scanner(System.in);
		String StuName;
		String Score;
		String fileName;
		double scoreValue = 0;
		double lowScore = 100;
		double highScore = 0;
		double AvgScore = 0;
		double totalScore = 0;
		int numScores = 0;
		int StuNum;
		
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
				
				
				
				System.out.print("Enter Student Name: ");
				StuName = input.next();
				System.out.print("Enter Test Score: ");
				Score = input.next();
				writeFile.write(StuName);
				writeFile.newLine();
				writeFile.write(String.valueOf(Score));
				writeFile.newLine();
				
			}
			

				numScores += 1;
				totalScore += scoreValue;
				
				if(scoreValue < lowScore)
				{
					lowScore = scoreValue;
				}
				if(scoreValue > highScore)
				{
					highScore = scoreValue;
				}
			
			writeFile.close();
			out.close();
			AvgScore = totalScore / numScores;
			System.out.println("Data Written To File.");
			System.out.println("Lowest Score: " + lowScore);
		System.out.println("Highest Score: " + highScore);
		System.out.println("Average Score: " + AvgScore);
			
		} catch (IOException e)
		{
			System.out.println("Problem Writing To File.");
			System.err.println("IOException: " + e.getMessage());
		}
		
	}
	
}
