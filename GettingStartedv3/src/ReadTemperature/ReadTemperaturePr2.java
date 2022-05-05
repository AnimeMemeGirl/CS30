package ReadTemperature;

import com.phidget22.TemperatureSensor;

public class ReadTemperaturePr2 
{

    public static void main(String[] args) throws Exception
    {

        //Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        temperatureSensor.open(1000);
        
        double F;
        double C = 0;
        F = (C * 1.8) + 32;
        

        //Use your Phidgets 
        while (true) 
        {
			System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °F" );
            Thread.sleep(150);
        }
    }
	
}
