package Practice;

import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class HotOrCold 
{

    public static void main(String[] args) throws Exception
    {

        //Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput greenLED = new DigitalOutput();
        DigitalOutput redLED = new DigitalOutput();
        
        
        //Address
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        

        //Open 
        temperatureSensor.open(1000);
        redLED.open(1000);
        greenLED.open(1000);

        //Use your Phidgets 
        while (true) 
        {
        	if(temperatureSensor.getTemperature() >= 20 && temperatureSensor.getTemperature() <= 24)
        	{
        		greenLED.setState(true);
        	}
        	else
        	{
        		redLED.setState(true);
        	}
        	
            System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
            Thread.sleep(150);
        }
    }
	
}
