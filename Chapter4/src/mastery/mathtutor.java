/*

Program: MathTutor_Mastery.java          Date: September 30, 2024

Purpose: Creates randomized math problems for the user to solve

Name: Richard Chang
School: CHHS
Course: Computer Science 20
 
*/
package mastery;

import java.util.Scanner;

public class mathtutor {
	public static void main(String[] args) {
		// Lets the user input values and restricts decimals from going past the hundredths place
		  Scanner in = new Scanner(System.in);
	    
	      // makes random numbers from 1-10 and uses variables to store the numbers
	        int num = (int)(10*Math.random()+1);
	        int num1 = (int)(10*Math.random()+1);

	        // makes random numbers 1-4 so the program can make 4 different operations (addition, subtraction, multiplication, division)
	        int op = (int)(4*Math.random()+1);
	        
	        // initializes variable so that it can use it to check answer of the user
	        int equal;

	//if the variable op generates the number 1 it creates an addition problem and uses 2 random numbers from 1-10 with the previous num and num1 variables
	        if (op == 1){{
	          System.out.print("What's " + num + "+" + num1 + ": ");
	          equal = in.nextInt();
	        }
	        //tells the user if they got the answer right or wrong
	        if (equal == num + num1){System.out.print("You got it correct");}
	        else if (equal != num + num1){System.out.print("You got it incorrect");}
	        }

	//if the variable op generates the number 2 it creates a subtraction problem and uses 2 random numbers from 1-10 with the previous num and num1 variables
	        if (op == 2){{
	          System.out.print("What's " + num + "-" + num1 + ": ");
	          equal = in.nextInt();
	        }
	        //tells the user if they got the answer right or wrong
	        if (equal == num - num1){System.out.print("You got it correct");}
	        else if (equal != num - num1){System.out.print("You got it incorrect");}
	        }
	        
	//if the variable op generates the number 3 it creates a multiplication problem and uses 2 random numbers from 1-10 with the previous num and num1 variables
	        if (op == 3){{
	          System.out.print("What's " + num + "*" + num1 + ": ");
	          equal = in.nextInt();
	        }
	        //tells the user if they got the answer right or wrong
	        if (equal == num * num1){System.out.print("You got it correct");}
	        else if (equal != num * num1){System.out.print("You got it incorrect");}
	        }
	        

	//if the variable op generates the number 4 it creates a multiplication problem and uses 2 random numbers from 1-10 with the previous num and num1 variables
	        if (op == 4){{
	          System.out.print("What's " + num + "/" + num1 + "(only whole numbers): ");
	          equal = in.nextInt();
	        }
	//tells the user if they got the answer right or wrong except instead of saying they got it correct it asks for the remainder because it is a division problem
	        if (equal != (num / num1)){System.out.print("You got it incorrect");}
	        if (equal == (num / num1)){System.out.print("What is the remainder?: ");}
	        
	        }
	        //takes the number the user inputted and makes it a variable, then checks the variable to see if it's right or wrong and tells user if it's right or wrong
	        int rem = in.nextInt();
	                  if (rem == num % num1) {System.out.print("You got it correct");}
	                  else if (rem != num % num1){System.out.print("You got it incorrect");}
	                  

	      /*
	Screen dump

	Test Case 1:
	What's 1+1: 2
	You got it correct

	Test Case 2:
	What's 7+3: 11
	You got it incorrect

	(^ put wrong number to check if incorrect message worked)
	      */
	    }
}


