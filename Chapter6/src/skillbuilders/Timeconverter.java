package skillbuilders;

import java.util.Scanner;

public class Timeconverter {
	
	//lets user input values and I had to change it to static because it was not working with the method things when it was regular
	static Scanner in = new Scanner(System.in);
	
	//main code 
	  public static void main(String args[]) {
		 
		  //Tells user what to input if they want to convert
		  System.out.println("For hours to minutes type 1 | For days to hours type 2 | For minutes to hours type 3 | For hours to days type 4 ");
		
		  //initiates user input
		  System.out.print("Please pick a converter: ");
		  
		  //user input variable
		  int pick = in.nextInt();
		 
// checks user input variable and depending on the number starts the method converters and if the number is not matching any of the method options gives error
		 if (pick == 1) {hourstominutes();}
		 if(pick == 2) {daystohours();} 
		 if(pick == 3) {minutestohours();} 
		 if(pick == 4) {hourstodays();} 
		 if (pick >= 5 | pick <= 0) System.out.print("You have picked nothing");}
	  
	  //method to convert hours to minutes
	public static void hourstominutes() {
    System.out.print("Enter your number of hours: ");
    int user = in.nextInt();
    int hrtomin = user*60;
    System.out.println("You have " + hrtomin + " minutes in your hour/s");
  }
	
	 //method to convert days to hours
	public static void daystohours() {
	    System.out.print("Enter your number of days: ");
	    int user = in.nextInt();
	    int hrtomin = user*24;
	    System.out.println("You have " + hrtomin + " hours in your day/s");
	  }
	 
	//method to convert minutes to hours
	public static void minutestohours() {
	    System.out.print("Enter your number of minutes: ");
	    int user = in.nextInt();
	    int hrtomin = user/60;
	    System.out.println("You have " + hrtomin + " hour/s in your minutes");
	  }
	
	 //method to convert hours to days
	public static void hourstodays() {
	    System.out.print("Enter your number of hours: ");
	    int user = in.nextInt();
	    int hrtomin = user/24;
	    System.out.println("You have " + hrtomin + " day/s in your hours");
	  }

}
