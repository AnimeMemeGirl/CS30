package ReadButton;

import com.phidget22.DigitalInput;

public class ReadButtonPr4 
{

    //Handle Exceptions 
    public static void main(String[] args) throws Exception
    {
        
        //Create 
        DigitalInput redButton = new DigitalInput();
        boolean state;

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);

        //Use your Phidgets 
        while(true)
        {
            if(state = true)
            {
	             System.out.println("button State: " + redButton.getState());
            }
            else if(state = false)
            {
        	     System.out.println("button State: " + redButton.getState());
        	     
            }
          Thread.sleep(150);
        }
    }
	
}
