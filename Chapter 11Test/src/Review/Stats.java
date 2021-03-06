package Review;

import java.io.*;

public class Stats 
{

	public static void main(String[] args)
	{
		
		File dataFile = new File("C:\\Users\\74013002\\git\\CS30\\Chapter 11Test\\src\\Review\\newF.txt");
		FileReader in;
		BufferedReader readFile;
		String StuName, Score;
		double scoreValue = 0;
		double lowScore = 100;
		double highScore = 0;
		double AvgScore = 0;
		double totalScore = 0;
		int numScores = 0;
		
		try
		{
			
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while((StuName = readFile.readLine()) != null)
			{
				Score = readFile.readLine();
				System.out.println(StuName + " " + Score);
				numScores += 1;
				scoreValue = Double.parseDouble(Score);
				totalScore += scoreValue;
				
				if(scoreValue < lowScore)
				{
					lowScore = scoreValue;
				}
				if(scoreValue > highScore)
				{
					highScore = scoreValue;
				}
				
			}//while loop
			
			AvgScore = totalScore / numScores;
			System.out.println("Lowest Score: " + lowScore);
		System.out.println("Highest Score: " + highScore);
		System.out.println("Average Score: " + AvgScore);
			readFile.close();
			in.close();
		}catch(FileNotFoundException e)
		{
			System.out.println("File does not exist!");
			System.err.println("FileNotFoundException: "+ e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("File does not exist!");
			System.err.println("IOException: "+ e.getMessage());
		}
		
		
		
	}
	
}

/*
Screen Dump

 
 */
