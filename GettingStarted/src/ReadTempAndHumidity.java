
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ReadTempAndHumidity {
    public static void main(String[] args) throws Exception{

        //Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget.
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets | This code will print humidity and temperature read by the sensor every 1000ms.
        while(true){
        	
        	//if temperature is 21°C or above prints the °C but if it is below 21°C it will print temperature is too cold
        	if (temperatureSensor.getTemperature() >= 21) {
            System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
            Thread.sleep(1000);
        	} else {
        		System.out.println("Temperature is too cold");
        		Thread.sleep(1000);
        	}
             	
        		//if humidity is 30% or above prints the humidity percentage but if it is below 30% it will print humidity is low
             	if (humiditySensor.getHumidity() >= 30) {
                 System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH");
                 Thread.sleep(1000);
             	} else {
             		System.out.println("Humidity is low");
             		Thread.sleep(1000);
             	}
        }
    }
}

  