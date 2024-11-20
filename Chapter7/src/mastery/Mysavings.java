package mastery;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Mysavings {

		public static void main(String[] args) {
			PiggyBank pb = new PiggyBank();
			
			// Lets the user input values and makes it so that decimals only go to the hundredths
	        Scanner in = new Scanner(System.in);
	        DecimalFormat deca = new DecimalFormat("#.##");
	   
	        int choice = 0;
	        
	        do {
	        //prompt user to enter a number to pick which type of metric conversion they want
	            System.out.println("1. Show total in bank");
	            System.out.println("2. Add a penny");
	            System.out.println("3. Add a nickel");
	            System.out.println("4. Add a dime");
	            System.out.println("5. Add a quarter");
	            System.out.println("6. Take money out of your bank");
	            System.out.println("Enter 0 to quit");
	            System.out.print("Enter your choice: ");
	            choice = in.nextInt();
	        
	            
	           
	            //switch case for each metric conversion choice
	            switch (choice) {
	            
	            //Show total in bank when user picks 1
	                case 1:
	                	
	                    //takes user input and applies inchestocm method to it
	                    System.out.println("Total in bank: $" + deca.format(pb.bankTotal()));
	                    break;
	                    
	                  //Add a penny when user picks 2
	                case 2:
	                  //takes user input and applies cmtoinches method to it
	                	pb.penny(1);
	                    System.out.println("Added 1 penny");
	                    break;
	                    
	                  //Add a nickel when user picks 3
	                case 3:
	                  //takes user input and applies feettocm method to it
	                	pb.nickel(1);
	                    System.out.println("Added 1 nickel");
	                    break;
	                    
	                  //Add a dime when user picks 4
	                case 4:
	                	
	                  //takes user input and applies cmtofeet method to it
	                	pb.dime(1);
	                    System.out.println("Added 1 dime");
	                    break;
	                    
	                  //Add a quarter when user picks 5
	                case 5:
	                  //takes user input and applies yardstom method to it
	                	pb.quarter(1);
	                    System.out.println("Added 1 quarter");
	                    break;
	                    
	                  //Take money out of piggy bank when user picks 6
	                case 6:
	                  //takes user input and applies mtoyards  method to it
	                    System.out.println("You took $" + deca.format(pb.bankTotal()) + " out of the bank" );
	                    pb.takeOut();
	                    break;
	                    
	                  //runs case 7 when user picks 7
	                case 0:
	                  //takes user input and applies miletokm method to it
	                    System.out.println("Quit successful");
	                    break;
	            }
	            }
	            while (choice != 0);
	            
	            }
	        }
			    

	/*
	Screen dump test 1:
	
	*/
	


	
	
	
