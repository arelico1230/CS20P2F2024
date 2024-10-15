package mastery;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) 
	{
		  Scanner in = new Scanner(System.in);
		  //user input
		   System.out.print("Enter a number: ");
		   int num = in.nextInt();   
		   //check if number is prime or not
	    boolean p = true;
	    //for loop to check if num is not a prime number
		   if (num == 1 | num == 0) {
			   p= false;
		   }
	    for (int i = 2; i <= num / 2; i++) {
	      if (num % i == 0) {
	        p = false;
	        break;
	      }
	    }
	    
	    // if p is false then it is a prime number and if p is true then it is not prime number
	    if (p)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
}
}

