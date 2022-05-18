/*

Program: BlinkLEDPr2.java

Purpose:

Author: Luke Van Hardeveld 
School: CHHS
Course: Computer Science 30
 

*/



//Add Phidgets Library 
import com.phidget22.*;

public class BlinkLEDPr2 
{

    //Handle Exceptions 
public static void main(String[] args) throws Exception{

    int count = 0;
    
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
        Thread.sleep(2000);
        redLED.setState(false);
        Thread.sleep(2000);
    }
    
}
	
}
/* Screen Dump



 */