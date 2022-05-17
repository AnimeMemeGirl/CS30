package Practice;

import java.util.Scanner;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class TugOfWar 
{

    //Handle Exceptions 
    public static void main(String[] args) throws Exception
    {
        
        //Create 
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        Scanner input = new Scanner(System.in);

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        int gPress = 0;
        int rPress = 0;
        boolean rState = false;
        boolean gState = false;

        //Open 
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        //Use your Phidgets 
        while(rPress < 10 && gPress < 10)
        {
        	
        	if(!rState && redButton.getState())
            {
        		redLED.setState(true);
                rPress++;
               // System.out.println("Number of presses of red button is: " + rPress);
                
                
            }
        	else if(rState && !redButton.getState())
            {
                redLED.setState(false);
            }
        	
        	if(!gState && greenButton.getState())
            {
        		greenLED.setState(true);
                gPress++;
            }
        	else if(gState && !greenButton.getState())
        	{
        		greenLED.setState(false);
        	}
        	
       } 	
        	//Flash lights
        	redLED.setState(false);
        	Thread.sleep(500);
        	redLED.setState(true);
        	Thread.sleep(500);
        	redLED.setState(false);
        	Thread.sleep(500);
        	
        	greenLED.setState(false);
        	Thread.sleep(500);
        	greenLED.setState(true);
        	Thread.sleep(500);
        	greenLED.setState(false);
        	Thread.sleep(500);
        	
        	
        	
        	
        	
        
    }
	
}
