import com.phidget22.*;

public class ClosingPhidgets {
  public static void main(String[] args) throws Exception{
 
    TemperatureSensor temperatureSensor = new TemperatureSensor();
    
    temperatureSensor.open(1000);
    
    System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");
    temperatureSensor.close();
    
    temperatureSensor.open(1000);
    
    System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");
    temperatureSensor.close();
  }
} 
