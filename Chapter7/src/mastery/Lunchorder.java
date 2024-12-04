/*

Program: LunchOrder.java          Date: November 28, 2024

Purpose: An application that takes the user input(The lunch order) and adds up the price of each order of food to get the total price

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
				 Food hb = new Food(1.85, 9, 33, 1);
			     Food salad = new Food(2.00, 1, 11, 5);
			     Food fries = new Food(1.30, 11, 36, 4);
			     Food soda = new Food(0.95, 0, 38, 0);
				 
				// Lets the user input values and makes it so that decimals only go to the hundredths
		        Scanner in = new Scanner(System.in);
		        DecimalFormat deca = new DecimalFormat("#.##");
		        
		        
		        //menu so user knows how much each item costs
		            System.out.println("Item	  	Price");
		            System.out.println("hamburger 	$1.85");
		            System.out.println("salad	  	$2.00");
		            System.out.println("french fries	$1.30");
		            System.out.println("soda	  	$0.95");
		            
		     
		        
		            
		           //prompt for user input
		           System.out.print("Enter order of hamburgers: ");
		           //used for calculating price later
		           int Burger = in.nextInt();
		         //displays the fat carb and fiber values of each order of hamburgers
		           System.out.println("Each hamburger has " + hb.fat() + "g of fat, " + hb.carbs() + "g of carbs, and " + hb.fiber() + "g of fiber");
		           
		           //prompt for user input 
		           System.out.print("Enter order of salads: ");
		         //used for calculating price later
		           int Salad = in.nextInt();
		           //displays the fat carb and fiber values of each order of salads
		           System.out.println("Each salad has " + salad.fat() + "g of fat, " + salad.carbs() + "g of carbs, and " + salad.fiber() + "g of fiber");
		           
		           //prompt for user input
		           System.out.print("Enter order of french fries: ");
		         //used for calculating price later
		           int Fries = in.nextInt();
		         //displays the fat carb and fiber values of each order of fries
		           System.out.println("Each order of french fries has " + fries.fat() + "g of fat, " + fries.carbs() + "g of carbs, and " + fries.fiber() + "g of fiber");
		           
		           //prompt for user input
		           System.out.print("Enter order of sodas: ");
		         //used for calculating price later
		           int Soda = in.nextInt();
		         //displays the fat carb and fiber values of each order of sodas
		           System.out.println("Each soda has " + soda.fat() + "g of fat, " + soda.carbs() + "g of carbs, and " + soda.fiber() + "g of fiber");
		           
		           //calculate the total price
		           double total = ((hb.price() * Burger)  + (salad.price() * Salad) + (fries.price() * Fries) + (soda.price() * Soda));
		           
		           //output message that tells the total price of all orders
		           System.out.println("Your total is $" + deca.format(total));
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
