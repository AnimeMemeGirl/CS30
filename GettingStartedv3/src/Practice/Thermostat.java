package Practice;

import java.util.Scanner;

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
    Scanner input = new Scanner(System.in);
    int gPress = 0;
    int rPress = 0;
    int setTemp = 21;
    boolean rState = false;
    boolean gState = false; 
    
  //Open 
    temperatureSensor.open(1000);
    redLED.open(1000);
    greenLED.open(1000);
    redButton.open(1000);
    greenButton.open(1000);
    
    while(true)
    {
    
    	if(!gState && greenButton.getState())
    	{
    		gPress++;
    	}
    	else if(!rState && greenButton.getState())
    	{
    		rPress--;
    	}
    	
    	//setTemp += gPress;
    	//setTemp = rPress;
    	
    	System.out.println("Set Temperature: " + gPress);
    	System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        Thread.sleep(500);
    	
    }
    
    }
}
