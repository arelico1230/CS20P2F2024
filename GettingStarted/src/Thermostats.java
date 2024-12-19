//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class Thermostats {
	
	//set temperature at 21°C
	    static int temp = 21;
	
	public static void main(String[] args) throws Exception {
	    // Create | Create objects for sensors, buttons, and LEDs
	    HumiditySensor humiditySensor = new HumiditySensor();
	    TemperatureSensor temperatureSensor = new TemperatureSensor();
	    DigitalInput redButton = new DigitalInput();
	    DigitalInput greenButton = new DigitalInput();
	    DigitalOutput redLED = new DigitalOutput();
	    DigitalOutput greenLED = new DigitalOutput();
	    
	 

	  //Address | Address your four objects which lets your program know where to find them.
	    redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(4);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(1);
        greenLED.setIsHubPortDevice(true);
        
      //Open | Connect your program to your physical devices.
	    temperatureSensor.open(1000);
	    redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
	        public void onStateChange (DigitalInputStateChangeEvent y) {
	        	if (y.getState() == true) {
	        		temp--;
	        	System.out.println("Temperature decreased by 1 °C" );
	        }
	        }
	 });
        
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
	        public void onStateChange (DigitalInputStateChangeEvent y) {
	        	if (y.getState() == true) {
	        		temp++;
	        	System.out.println("Temperature increased by 1 °C" );
	        }
	        }
	 });
        
        
        
      //Use your Phidgets | This code will print humidity and temperature read by the sensor every 1000ms.
        while(true){
        	
             System.out.println("Current temperature: " + temperatureSensor.getTemperature() + " °C");
             System.out.println("Set temperature: " + temp + " °C");
             Thread.sleep(10000);
        	
        	if (temperatureSensor.getTemperature() > (temp + 2) && temperatureSensor.getTemperature() < (temp - 2)) {
        		
        	greenLED.setState(true);
        	Thread.sleep(100);
        	greenLED.setState(false);
        	Thread.sleep(100);
        	continue;}
        	else {
        		redLED.setState(true);
        		Thread.sleep(100);
        		redLED.setState(false);
        		Thread.sleep(100);
        		continue;
        	}
        	
}
}
}