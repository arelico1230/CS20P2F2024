package skillbuilders;

import java.util.Scanner;

public class Studentroster {
	 public static void main(String[] args) {
		 
	       Scanner in = new Scanner(System.in);
	       
	       //prompt user for the number of students
	       System.out.print("Enter the number of students in the class: ");
	       
	       //hold user input in variable
	       int num = in.nextInt();
	       
	       //create array to store student names
	       String[] names = new String[num + 1];
	       
	       //collect names from the user
	       for (int i = 1; i <= num; i++) {
	           System.out.print("Enter the name of student # " + i + ":");
	          names[i] = in.next();
	       }
	       
	       //list name
	       System.out.println("Student Roster");
	       //show list of student number and names
	       for(int i = 1; i<= num; i++) {
				System.out.println("Student " + i + ": " + names[i]);
	       }

}
}