package ReadTempAndHum;

	//Add Phidgets Library 
	import com.phidget22.*;
	
public class ReadTempAndHumPr1 
{

	public class GettingStarted 
	{
		public void main(String[] args) throws Exception
	    {

	        //Create 
	        HumiditySensor humiditySensor = new HumiditySensor();
	        TemperatureSensor temperatureSensor = new TemperatureSensor();

	        //Open 
	        humiditySensor.open(1000);
	        temperatureSensor.open(1000);

	        //Use your Phidgets 
	        while(true)
	        {
	            double tempF = (temperatureSensor.getTemperature() * 1.8) + 32;
	        	System.out.println("Humidity: " + humiditySensor.getHumidity() + " " + "Temperature: " + tempF + " °F" );
	            Thread.sleep(150);
	        }
	    }
	}
	
}
