//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file.
import com.phidget22.*;
public class Thermostats {
   public static void main(String[] args) throws Exception {
    // Create | Create objects for sensors, buttons, and LEDs
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    DigitalInput redButton = new DigitalInput();
    DigitalInput greenButton = new DigitalInput();
    DigitalOutput redLED = new DigitalOutput();
    DigitalOutput greenLED = new DigitalOutput();
    
    double setTemperature = 21.0;  
    
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
    
    while (true) {
       
        double currentTemperature = temperatureSensor.getTemperature(); 
        
        if (greenButton.getState()) {
            setTemperature += 1;
        }
       
        if (redButton.getState()) {
            setTemperature -= 1;
        }
    
        System.out.println("Current Temperature: " + currentTemperature + " °C, Set Temperature: " + setTemperature + " °C");
       
        if (Math.abs(currentTemperature - setTemperature) <= 2) { 
            greenLED.setState(true); 
            redLED.setState(false);  
        } else {
            redLED.setState(true); 
            greenLED.setState(false); 
        }
        Thread.sleep(10000);
     }
  } 
} 
