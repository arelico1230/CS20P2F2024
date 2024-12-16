
//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class TugOfWar{
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
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

        //initialize variable
        int rCount = 0;
        
        int gCount = 0;
        
        //continue until one player wins
        while (true) {
          
        	//add 1 to rCount when red button pressed
            if (redButton.getState()) {
             
            	rCount++;
             
            	System.out.println("Red: " + rCount);
               
                //flash red LED when pressed
                redLED.setState(true);
                Thread.sleep(150);
                redLED.setState(false);
                Thread.sleep(150);
            }
            //add 1 to gCount when green button pressed
            if (greenButton.getState()) {
               
            	gCount++;
              
            	System.out.println("Green: " + gCount);
               
                //flash green LED when pressed
                greenLED.setState(true);
                Thread.sleep(150);
                greenLED.setState(false);
                Thread.sleep(150);
            }
            
            //check if either player has won when there has been 10 presses counted
            if (rCount >= 10 || gCount >= 10) {
            	
                //flash both LEDs on for 200 ms
                redLED.setState(true);
                greenLED.setState(true);
                Thread.sleep(200); 
                
                //both LEDs off for 200 ms
                redLED.setState(false);
                greenLED.setState(false);
                Thread.sleep(200); 
                
                //flash the winner's LED 5 times.
                if (rCount >= 10) {
                	
                    //loop to make red flash 5 times
                	for (int i = 0; i < 5; i++) {
                    	redLED.setState(true);
                        Thread.sleep(200);
                        redLED.setState(false);
                        Thread.sleep(200);
                    }
                  
                    System.out.println("Red Victory!");
              
                } 
                
                else {
                	
                    //loop to make green flash three times
                	for (int i = 0; i < 5; i++) {
                    	greenLED.setState(true);
                        Thread.sleep(200);
                        greenLED.setState(false);
                        Thread.sleep(200);
                    }
                    System.out.println("Green Victory!");
                }
               
                //exit game
                break;
            }
            //speed of button in ms
            Thread.sleep(150);
        }
    }
 }
