package Chapter9;

import java.util.Scanner;

public class HighestGrade 
{
	
	public static void main(String[] args)
	{
		
		double scoreValue = 0;
		double lowScore = 100;
		double highScore = 0;
		int[] grade = new int[5];
		Scanner input = new Scanner(System.in);

	    System.out.println("Please enter 5 grades: ");

	    
		// calculates the square
	    for(int i = 0; i < grade.length;i ++)
	    {
			   if(scoreValue < lowScore)
			     {
				     lowScore = scoreValue;
			     }
			   if(scoreValue > highScore)
			     {
				     highScore = scoreValue;
			     }
	    }
	    

	    		
	    //displays the array
	    for(int i = 0; i < grade.length;i ++)
	    {
	    	System.out.println(grade[i]);
			System.out.println("Highest Score: ");
			System.out.println("Average Score: ");
	    }
		
	}

}
