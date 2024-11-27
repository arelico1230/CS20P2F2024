package mastery;

import java.util.Scanner;

public class Digitextractor {
	   public static void main(String[] args) {
		   
		//Lets the user input values 
		   Scanner in = new Scanner(System.in);
		   
		   //Prompt the user for an integer
	       System.out.print("Enter an integer: ");
	       
	       //holds the integer
	       int numb = in.nextInt();
	       
	     //Create a Num object to link Num to Digitextractor
	       Num num = new Num(numb);
	       
	     //establish String choice outside of do while loop to make the while part work
	       String choice;
	       
	       do {
	           //Prompt user for input
	    	   System.out.println("Show the (W)hole number");
	           System.out.println("Show the (O)nes digit");
	           System.out.println("Show the (T)ens digit");
	           System.out.println("Show the (H)undreds digit");
	           System.out.println("(Q)uit");
	           System.out.print("Enter your choice: ");
	           
	           //changes choice to the user input
	           choice = in.next();
	           
	           //makes choice lower case
	           choice = choice.toLowerCase();
	           
	           // Process user choice
	           switch (choice) {
	         //Outputs confirmation messaage and ends loop when user picks Q
	           	   case "q":
	           		   System.out.println("Quit successful");
                   break;
                   
                   //Show the number the user input when user picks W
	               case "w":
	            	   //returns the number the user input
	                   System.out.println("The whole number is: " + num.getNum());
	                   break;
	                   
	                 //Show tens place when user picks O
	               case "o":
	            	 //shows the ones place in  int numb
	                   System.out.println("Ones digit: " + num.ones());
	                   break;
	                   
	                 //Show hundreds place when user picks T
	               case "t":
	            	 //shows the tens place in  int numb
	                   System.out.println("Tens digit: " + num.tens());
	                   break;
	                   
	                 //Show ones place when user picks W
	               case "h":
	            	   //shows the hundreds place in  int numb
	                   System.out.println("Hundreds digit: " + num.hundreds());
	                   break;
	               
	           }
	       } 
	       //keeps the loop going when choice is any letter but Q
	       while (!choice.equals("q"));
	   }
	}
