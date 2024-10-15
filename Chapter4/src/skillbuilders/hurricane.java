package skillbuilders;

import java.util.Scanner;

public class hurricane {public static void main(String[] args) 
{
	  Scanner in = new Scanner(System.in);
	  //tells user to put in a number from 1-5 for hurricane categories and makes a variable for the user input
      System.out.print("Enter category of hurricane from 1-5: ");
      int cat = in.nextInt();
      
      //Makes an error message if the user enters a number lower than the limit
      if(cat < 1) {
    	    System.out.println("That number is too low");
        }
      
      //Will tell the user the wind speeds of the category of hurricane they put in based on the Saffir-Simpson Hurricane Scale
      if(cat == 1) {
    	    System.out.println("Category 1: 74-95 mph or 64-82 kt or 119-153 km/hr");
    	}
      if(cat == 2) {
  	    System.out.println("Category 2: 96-110 mph or 83-95 kt or 154-177 km/hr");
  	}
      if(cat == 3) {
  	    System.out.println("Category 3: 111-130 mph or 96-113 kt or 178-209 km/hr");
  	}
      if(cat == 4) {
  	    System.out.println("Category 4: 131-155 mph or 114-135 kt or 210-249 km/hr");
  	}
      if(cat == 5) {
  	    System.out.println("Category 5: greater than 155 mph or 135 kt or 249 km/hr");
  	}
      
      //Makes an error message if the user inputs a number higher than the limit
      if(cat > 5) {
  	    System.out.println("That number is too high");
      }
      
}
}