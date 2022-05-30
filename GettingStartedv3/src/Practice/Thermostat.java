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
    double temp;
    double printTemp = 10;
    
  //Open 
    temperatureSensor.open(1000);
    redLED.open(1000);
    greenLED.open(1000);
    redButton.open(1000);
    greenButton.open(1000);
    
    while(true)
    {
    	temp = Math.round(temperatureSensor.getTemperature());
    	
    	if( temp < (setTemp + 2) && temp > (setTemp - 2))
    	{
    		greenLED.setState(true);
    		redLED.setState(false);
		}
    	else
    	{
    		redLED.setState(true);
    		greenLED.setState(false);
    	}
    	//To change temperature
    	
    	
    	if(redButton.getState() && !rState)
    	{
    		setTemp--;
    		System.out.println("Set Temperature: " + setTemp);
    	}
    	
    	else if(greenButton.getState() && !gState)
    	{
    		setTemp++;
    		System.out.println("Set Temperature: " + setTemp);
    	}
    	//track button state
    	rState = redButton.getState();
    	gState = greenButton.getState();
    	
    	
    	if(printTemp >= 10)
    	{
    		System.out.println("Set Temperature: " + setTemp);
    		System.out.println("Current Temperature: " + temp + "\n");
    		printTemp = 0;
    	}
        printTemp = printTemp + 0.15;
        Thread.sleep(150);
    
    	
      }
    
    }

	
}
