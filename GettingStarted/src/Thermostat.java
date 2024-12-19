
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class Thermostat {
	  public static void main(String[] args) throws Exception {
		    // Create | Create objects for sensors, buttons, and LEDs
		    HumiditySensor humiditySensor = new HumiditySensor();
		    TemperatureSensor temperatureSensor = new TemperatureSensor();
		    DigitalInput redButton = new DigitalInput();
		    DigitalInput greenButton = new DigitalInput();
		    DigitalOutput redLED = new DigitalOutput();
		    DigitalOutput greenLED = new DigitalOutput();
		    
		  //set temperature at 21°C
		    double temp = 21.0;
		    
		    // Open | Open sensors, buttons, and LEDs
		    humiditySensor.open(1000);
		    temperatureSensor.open(1000);
		    
		    
		    redButton.setHubPort(0);
		    redButton.setIsHubPortDevice(true);
		    redButton.open(1000);
		    greenButton.setHubPort(5);
		    greenButton.setIsHubPortDevice(true);
		    greenButton.open(1000);
		    redLED.setHubPort(1);
		    redLED.setIsHubPortDevice(true);
		    redLED.open(1000);
		    greenLED.setHubPort(4);
		    greenLED.setIsHubPortDevice(true);
		    greenLED.open(1000);
		    
		    // Use your Phidgets | This code will run continuously and check the button presses and temperature.
		    while (true) {
		        //Get the current temperature from the temperature sensor
		        double currTemp = temperatureSensor.getTemperature(); // variable currenTemperature = temp from sensor
		        //if green button is pressed increase the set temperature by 1°C
		        if (greenButton.getState()) {
		        	//increases set temperature by 1°C
		            temp += 1; 
		        }
		        //if the red button is pressed decrease the set temperature by 1°C
		        if (redButton.getState()) {
		        	//decreases set temperature by 1°C
		            temp -= 1; 
		        }
		        
		        //output current temperature and set temperature every 10 seconds
		        System.out.println("Current Temperature: " + currTemp + " °C, Set Temperature: " + temp + " °C");
		        
		        //check if the current temperature is within 2°C of the set temperature
		        if (Math.abs(currTemp - temp) <= 2) { 
		            greenLED.setState(true);
		            redLED.setState(false);
		        } else {
		            redLED.setState(true);  
		            greenLED.setState(false);
		        }
		        //10 seconds
		        Thread.sleep(10000);
		     } 
		  } 
		}
