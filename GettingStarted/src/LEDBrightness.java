import com.phidget22.*;
public class LEDBrightness {

  public static void main(String[] args) throws Exception{

    DigitalOutput redLED = new DigitalOutput();
    redLED.setHubPort(1); 
    redLED.setIsHubPortDevice(true);
    redLED.open(1000);
    for (double dutyCycle = 0.0; dutyCycle <= 1.0; dutyCycle += 0.05) { 
        redLED.setDutyCycle(dutyCycle); 
        Thread.sleep(100); 
    }
    // For loop to gradually decrease brightness
    for (double dutyCycle = 1.0; dutyCycle >= 0.0; dutyCycle -= 0.05) { 
        redLED.setDutyCycle(dutyCycle);  
        Thread.sleep(100);  
    }
    
    redLED.setDutyCycle(0.0);  
    Thread.sleep(1000);   } 
} 


