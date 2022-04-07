package Review;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class Stats 
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		NumberFormat pc = NumberFormat.getPercentInstance();
		
		File textFile;
		FileReader in;
		BufferedReader readFile;
		
		String fileName, masterAnswers, stuAnswers, stuName;
		int numCorrect;
		double percentCorrect;
		
		
		try
		{
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			masterAnswers = (String)readFile.readLine();
			
			while((stuName = readFile.readLine()) != null)
			{
				stuAnswers = readFile.readLine();
				numCorrect = 0;

				for(int grade = 0; grade < masterAnswers.length(); grade++)
				{
					if(stuAnswers.charAt(grade) == masterAnswers.charAt(grade))
					{
						numCorrect = numCorrect + 1;
					}
				}
				percentCorrect = (double)numCorrect/masterAnswers.length();
				System.out.println(stuName + "\t" + pc.format(percentCorrect));
			}
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
		
	}//main method closing
	
}
