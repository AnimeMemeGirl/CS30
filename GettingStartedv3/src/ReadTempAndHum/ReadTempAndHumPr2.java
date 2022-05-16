package ReadTempAndHum;

import com.phidget22.HumiditySensor;
import com.phidget22.TemperatureSensor;

public class ReadTempAndHumPr2 
{

	public class GettingStarted 
	{
	    public void main(String[] args) throws Exception
	    {

	        //Create 
	        HumiditySensor humiditySensor = new HumiditySensor();
	        TemperatureSensor temperatureSensor = new TemperatureSensor();
	        
	        //Address 
	        humiditySensor.setHubPort(3);
	        humiditySensor.setIsHubPortDevice(true);

	        //Open 
	        humiditySensor.open(1000);
	        temperatureSensor.open(1000);

	        //Use your Phidgets 
	        while(true)
	        {
	        	if(humiditySensor.getHumidity() >= 30)
	        	{
	            System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH");
	            Thread.sleep(150);
	        	}
	        	else
	        	{
	        		System.out.println("Humidity Is Too Low");
	        	}
	        	System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");
	        }
	    }
	}
	
}
