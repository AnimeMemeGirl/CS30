package LEDAndButton;
import java.util.Scanner;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class LEDAndButtonPr4 
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
        int numValue = 0;
        int sumOfvalues = 0;
        int newValue = 0;

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        

        //Use your Phidgets 
        while(true)
        {

            if( redButton.getState())
            {
                redLED.setState(true);
                numValue++;
            } 
            else 
            {
                redLED.setState(false);
            }

            if(greenButton.getState())
            {
                greenLED.setState(true);
                numValue++;
            } 
            else 
            {
                greenLED.setState(false);
            }

            System.out.println("button Count: " + numValue);
            Thread.sleep(150);
            
            
              
        }
         
    }
	
}
