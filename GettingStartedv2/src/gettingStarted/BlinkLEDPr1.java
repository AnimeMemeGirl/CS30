/*

Program: BlinkLEDPr1.java

Purpose:

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/

package gettingStarted;

//Add Phidgets Library 
import com.phidget22.*;
import gettingStarted.DigitalOutput;

public class BlinkLEDPr1 
{
    //Handle Exceptions 
    public static void main(String[] args) throws Exception
    {

        //Create 
    	 DigitalOutput redLED = new DigitalOutput();

        //Address 
    	 redLED.setHubPort(1);
	     redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets 
        while(true)
        {
            redLED.setState(true);
            Thread.sleep(1000);
            redLED.setState(false);
            Thread.sleep(1000);
        }
    }
}
/* Screen Dump



 */
