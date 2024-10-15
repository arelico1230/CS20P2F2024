package mastery;

import java.util.Scanner;

public class groupassignment {
	public static void main(String[] args) {
	    // Lets the user input values
		  Scanner in = new Scanner(System.in);
		  //asking user for their first and last name and holds them in variables
		  System.out.print("Enter your first name: ");
		  String first = in.next();
		  System.out.print("Enter your last name: ");
		  String last = in.next();
		  //initialize variable to assign groups later
		  int group = 0;
		  //takes the initial of users last name
		  char initial = Character.toUpperCase(last.charAt(0));
		  
		  //Selects what group user will be put in based off of the letter of their last name
		  if (initial >= 'A' && initial <= 'I') {
			  group = 1;}
		  else if (initial >= 'J' && initial <= 'S') {
			  group = 2;}
		  else if (initial >= 'T' && initial <= 'Z') {
			  group = 3;}
		  
		  //Tells user their name and their group
		  System.out.print(first + " " + last + " is in group " + group);
} 
}