
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class Thermostat {
    public static void main(String[] args) throws Exception{

    	 //Create | Create objects for your buttons and LEDs.
    	DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        
        
      //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        
        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        int temp = 21;
        boolean redState = false;
        boolean greenState = false;
        double printTemp = 10;

        //Use your Phidgets | This code will print humidity and temperature read by the sensor every 1000ms.
        while(true){
                 
        	//get the temperature 
        		int currTemp = 21; 
                 System.out.println("Temperature: " + temp + "°C");
              	 //Thread.sleep(100);
                 
                 if (currTemp < (temp + 2) && currTemp > (temp - 2)){
                 	redLED.setState(false);
					greenLED.setState(true);
					}
                 else {
                    redLED.setState(true);
					greenLED.setState(false);
                 }
                 
                 
                 if (redButton.getState() && !redState) 
                 {
     				currTemp--;
     				//ouput the current temperature 
                 }
                 else if (greenButton.getState() && !greenState) 
                 {
                	 currTemp++;
      				//ouput the current temperature 
                 }
                 redState = redButton.getState();
                 greenState = greenButton.getState();
                 
                 
                 //print temperature every 10 seconds
                 //if(printTemp > 10
                 {
                	 //print set Temp
                	 //print current Temp
                	 printTemp = 0;
                 }
                 
                 printTemp = printTemp + 0.15;
                 Thread.sleep(150);
                  
                 
        }
    }
}