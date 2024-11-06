/*

Program: Primenumber.java          Date: November 6, 2024

Purpose: User inputs any number then program checks if it is a prime number or not

Name: Richard Chang
School: CHHS
Course: Computer Science 20
 
*/
package mastery;

import java.util.Scanner;

public class Primenumber {
	 public static void main(String[] args) {
		 //Lets the user input values
	        Scanner in = new Scanner(System.in);
	     
	        //prompt user for input
	        System.out.print("Enter a number: ");
	        
	        //holds user input
	        int num = in.nextInt();
	        
	       //checks num using the isPrime method
	        if (isPrime(num)) {
	        	
	        	//sends this message if num is a prime number
	            System.out.println(num + " is a prime number.");}
	        
	        else {
	        	
	        	//sends this message if num is not a prime number
	            System.out.println(num + " is not a prime number.");}
	    }
	 	
	 	//Checks number to see if it is prime and returns boolean 
	    public static boolean isPrime(int num) {
	    	
	    	//checks if num is 1 or 0 because those two aren't prime numbers   
	        if (num == 1 | num == 0) {
	        	
	        	//return false when it does not pass if statement
	            return false;
	        }
	        
	        /* for loop to check if num is not a prime number by seeing if it has any remainders after dividing by int i which goes up 
	        if it is less than or equal to num/2 */
	        for (int i = 2; i <= num / 2; i++) {
	        	
	  	      //divides the number the user input by i and takes the remainder to see if it is 0 or not
	        	if (num % i == 0) {
	  	    	  
	  	    	  //return false when the number is not a prime number
	  	    	  return false;
	            }
	        }
	        //return true if it passes everything and doesn't trigger the return false
	        return true;
	    }
/*
Screen dump Test 1:
Enter a number: 100
100 is not a prime number.

Test 2:

 */
	}
