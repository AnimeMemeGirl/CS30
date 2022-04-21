package Review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FindAndreplace 
{

	public static void main(String[] args)
	{
    
		FileReader in;
		FileWriter out;
		BufferedReader readFile;
		BufferedWriter writeFile;
		File textFile;
		File newFile;
		String fileName;
		String line;
		String orPhrase;
		String repPhrase;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name Of The File: ");
		fileName = input.nextLine();
		textFile = new File(fileName);
		
		System.out.print("Enter a Phrase: ");
		orPhrase = input.nextLine();
		
		System.out.print("Enter a Replacement Phrase: ");
		repPhrase = input.nextLine();
		
		try
		{
		
		in = new FileReader(textFile);
		readFile = new BufferedReader(in);
		fileName = fileName.replace(".", "NEW.");//create a file name for the new file
		newFile = new File(fileName);
		out = new FileWriter(newFile);
		writeFile = new BufferedWriter(out);
		
		while((line = readFile.readLine()) != null)
		{
			line = line.replaceAll(orPhrase, repPhrase);
			writeFile.write(line);
			writeFile.newLine();
		}
		writeFile.close();
		out.close();
		readFile.close();
		in.close();
		
		} catch(FileNotFoundException e)
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
