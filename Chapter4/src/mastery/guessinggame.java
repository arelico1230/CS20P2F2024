/*

Program: guessinggame_Mastery.java          Date: September 30, 2024

Purpose: User has to guess the correct number from 1-20

Name: Richard Chang
School: CHHS
Course: Computer Science 20
 
*/
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
      int equal = in.nextInt();

    //Tells the user the number they input and the number that was the right number
      System.out.println("Computer's number: " + num);
      System.out.println("Player's number: " + equal);

    //Gives a congratulations message if the user got the number right and gives a "Better luck next time" message if user gets it wrong
      if (equal == num){System.out.print("You guessed the right number!");}
      else if (equal != num){System.out.print("Better luck next time.");}
    /*
    //Guessing game part b:  Application was tested by me guessing the number and 
    debugging was done by checking the red marks that are shown if there are errors in code and looking at the output messages
    */
      /*
Screen dump:
Test case 1:
Enter a number from 1-20: 20
Computer's number: 7
Player's number: 20
Better luck next time.

Test case 2:
Enter a number from 1-20: 14
Computer's number: 3
Player's number: 14
Better luck next time.
*/
}
}
