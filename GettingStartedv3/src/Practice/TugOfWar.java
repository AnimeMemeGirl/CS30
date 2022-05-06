package Practice;

import com.phidget22.DigitalInput;

public class TugOfWar 
{

    //Handle Exceptions 
    public static void main(String[] args) throws Exception
    {
        
        //Create 
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);
        greenButton.open(1000);

        //Use your Phidgets 
        while(true)
        {
            System.out.println("Button State: " + redButton.getState());
            Thread.sleep(150);
        }
    }
	
}
