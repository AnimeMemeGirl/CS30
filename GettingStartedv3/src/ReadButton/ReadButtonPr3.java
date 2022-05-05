package ReadButton;

import com.phidget22.DigitalInput;

public class ReadButtonPr3 
{

    //Handle Exceptions 
    public static void main(String[] args) throws Exception
    {
        
        //Create 
        DigitalInput greenButton = new DigitalInput();

        //Address 
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        //Open 
        greenButton.open(1000);

        //Use your Phidgets 
        while(true)
        {
            System.out.println("Button State: " + greenButton.getState());
            Thread.sleep(150);
        }
    }
	
}
