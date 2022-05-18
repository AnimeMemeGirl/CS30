import com.phidget22.DigitalOutput;

public class BlinkLEDPr4 
{

	//Handle Exceptions 
    public static void main(String[] args) throws Exception
    {

        //Create 
    	 DigitalOutput greenLED = new DigitalOutput();

        //Address 
    	 greenLED.setHubPort(4);
    	 greenLED.setIsHubPortDevice(true);

        //Open 
    	 greenLED.open(1000);

        //Use your Phidgets 
        while(true)
        {
        	greenLED.setState(true);
            Thread.sleep(1000);
            greenLED.setState(false);
            Thread.sleep(1000);
        }
    }
	
}
