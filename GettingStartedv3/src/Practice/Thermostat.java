package Practice;

import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class Thermostat 
{
	
	public static void main(String[] args) throws Exception
    {
	
	//Create 
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    DigitalOutput greenLED = new DigitalOutput();
    DigitalOutput redLED = new DigitalOutput();
    DigitalOutput redButton = new DigitalOutput();
    DigitalOutput greenButton = new DigitalOutput();

	//Address
    redLED.setHubPort(1);
    redLED.setIsHubPortDevice(true);
    redButton.setHubPort(0);
    redButton.setIsHubPortDevice(true);
    greenLED.setHubPort(4);
    greenLED.setIsHubPortDevice(true);
    greenButton.setHubPort(5);
    greenButton.setIsHubPortDevice(true);
    int gPress = 0;
    int rPress = 0;
    int setTemp = 21;
    boolean rState = false;
    boolean gState = false; 
    
    while(true)
    {
    
    	if(!gState && greenButton.getState())
    	{
    		gPress++;
    	}
    	else if(!rState && greenButton.getState())
    	{
    		rPress++;
    	}
    	System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        Thread.sleep(10000);
    	
    }
    
    }
}
