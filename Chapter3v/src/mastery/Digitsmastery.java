package mastery;

import java.util.Scanner;

public class Digitsmastery {
	public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
      
      //Prompt the user to enter a three digit number
      System.out.print("Enter a three digit number:");
      
      ////Declare variable for number and stores number
      int num = in.nextInt();
     
     // Declare variables and calculates for hundredsPlace, tensPlace, onesPlace
     
    
      int hundred = (num / 100);
     
    
      int ten = (num / 10) % 10;

      
      int one = num % 10;
      
      //Output the hundredsPlace, tensPlace, onesPlace
      System.out.println("hundreds: " + hundred);

      System.out.println("tens: " + ten);
      
      System.out.println("ones: " + one);
	    
		}
}