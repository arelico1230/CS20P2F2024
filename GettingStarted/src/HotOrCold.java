
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class HotOrCold {
    public static void main(String[] args) throws Exception{

        //Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget.
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        
        
        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
        temperatureSensor.open(1000);
        redLED.open(1000);
        greenLED.open(1000);
        
        
        //Use your Phidgets | This code will print humidity and temperature read by the sensor every 1000ms.
        while(true){

            System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        	
        	//if temperature is 21°C or above prints the °C but if it is below 21°C it will print temperature is too cold
        	if (temperatureSensor.getTemperature() >= 20 & temperatureSensor.getTemperature() <= 24) {
            greenLED.setState(true);
            redLED.setState(false);
        	} else {
        		redLED.setState(true);
        		greenLED.setState(false);
        		
        	}
        	Thread.sleep(150);
             	
             	}
        }
    }
