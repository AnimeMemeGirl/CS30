package Review;

import java.io.*;

public class Stats 
{

	public static void main(String[] args)
	{
		
		File textFile = new File("newF.txt");
		FileReader in;
		BufferedReader readFile;
		String lineOfText;
		
		try
		{
			
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			while((lineOfText = readFile.readLine()) != null)
			{
				System.out.println(lineOfText);
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
		
	}
	
}

/*
Screen Dump

 
 */
