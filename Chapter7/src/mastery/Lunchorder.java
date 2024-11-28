/*

Program: LunchOrder.java          Date: November 28, 2024

Purpose: An application that takes user input a

Author: Richard Chang
School: CHHS
Course: Computer Science 20
 

*/
package mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lunchorder {

			public static void main(String[] args) {
				//links Food to Lunchorder
				Food f = new Food();
				
				// Lets the user input values and makes it so that decimals only go to the hundredths
		        Scanner in = new Scanner(System.in);
		        DecimalFormat deca = new DecimalFormat("#.##");
		        
		        
		        //menu so user knows how much each item costs
		            System.out.println("Item	  	Price");
		            System.out.println("hamburger 	$1.85");
		            System.out.println("salad	  	$2.00");
		            System.out.println("french fries	$1.30");
		            System.out.println("soda	  	$0.95");
		            
		     
		        
		            
		           //prompt for user input and applies the f.burger method to it
		           System.out.print("Enter order of hamburgers: ");
		           f.burger(in.nextInt(), 0, 0, 0);
		           
		           //prompt for user input and applies the f.salad method to it
		           System.out.print("Enter order of salads: ");
		           f.salad(in.nextInt(), 0, 0, 0);
		           
		           //prompt for user input and applies f.fries method to it
		           System.out.print("Enter order of french fries: ");
		           f.fries(in.nextInt(), 0, 0, 0);
		           
		           //prompt for user input and applies f.soda method to it
		           System.out.print("Enter order of sodas: ");
		           f.soda(in.nextInt(), 0, 0, 0);
		           
		           //output message that tells the total dollars of the orders using f.orderTotal
		           System.out.print("Your total is $" + deca.format(f.orderTotal()));
		        }
}

/*
 Screen dump
 Test case 1:
 Item	  Price
hamburger $1.85
salad	  $2.00
fries	  $1.30
soda	  $0.95
Enter order of hamburgers: 10
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber
Enter order of salads: 5
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber
Enter order of french fries: 1
Each order of french fries has 11.0g of fat, 36.0g of carbs, and 4.0g of fiber
Enter order of sodas: 9
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber
Your total is $38.35


Test case 2:
Item	  Price
hamburger $1.85
salad	  $2.00
fries	  $1.30
soda	  $0.95
Enter order of hamburgers: 100
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0g of fiber
Enter order of salads: 100
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0g of fiber
Enter order of french fries: 100
Each order of french fries has 11.0g of fat, 36.0g of carbs, and 4.0g of fiber
Enter order of sodas: 100
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0g of fiber
Your total is $610
 */
