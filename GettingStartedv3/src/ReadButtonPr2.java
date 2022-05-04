/*

Program: ReadButtonPr2.java

Purpose:

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/




//Add Phidgets Library 
import com.phidget22.*;

public class ReadButtonPr2 
{
	
    //Handle Exceptions 
    public static void main(String[] args) throws Exception
    {
        
        //Create 
        DigitalInput redButton = new DigitalInput();

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);

        //Use your Phidgets 
        while(true)
        {
            System.out.println("Button State: " + redButton.getState());
            Thread.sleep(150);
        }

    }

}

/* Screen Dump



 */