package mastery;

import java.util.Scanner;

public class guessinggame {
	public static void main(String[] args) {
	    // Lets the user input values
		  Scanner in = new Scanner(System.in);
	      // generates a random number from 1-20
	      int num = (int)(20*Math.random()+1);
	      //Tells the user to guess a number from 1-20
	      System.out.print("Enter a number from 1-20: ");
	      //Holds the inputted number
	      int guess = in.nextInt();

	    //gives a "Try again" message if user gets it wrong until they get it right
	      
	      while (guess != num){
	    	  System.out.println("Try again");
	    	  System.out.print("Enter a number from 1-20: ");
	    	  guess = in.nextInt();
	      }
	      if (guess == num){System.out.print("You guessed the right number!");}
}
}