package mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Mysavings {

		public static void main(String[] args) {
			//links piggybank to mysavings
			PiggyBank pb = new PiggyBank();
			
			// Lets the user input values and makes it so that decimals only go to the hundredths
	        Scanner in = new Scanner(System.in);
	        DecimalFormat deca = new DecimalFormat("#.##");
	        
	        //establish int choice outside of do while loop to make the while part work
	        int choice = 0;
	        
	        do {
	        //prompt user to enter a number to pick what they want to do
	            System.out.println("1. Show total in bank");
	            System.out.println("2. Add a penny");
	            System.out.println("3. Add a nickel");
	            System.out.println("4. Add a dime");
	            System.out.println("5. Add a quarter");
	            System.out.println("6. Take money out of your bank");
	            System.out.println("Enter 0 to quit");
	            System.out.print("Enter your choice: ");
	            
	            //changes choice to the user input
	            choice = in.nextInt();
	        
	            
	           
	            //switch case for each choice
	            switch (choice) {
	            
	            
                //ends the program when user picks 0
              case 0:
                //confirmation message
                  System.out.println("Quit successful");
                  break;
	            
	            //Show total in bank when user picks 1
	                case 1:
	                    //takes user input and uses pb.bankTotal to show how much is in the bank with deca format in case c
	                    System.out.println("Total in bank: $" + deca.format(pb.bankTotal()));
	                    break;
	                    
	                  //Add a penny when user picks 2
	                case 2:
	                  //adds 1 penny to the bank using pb.penny
	                	pb.penny(1);
	                    System.out.println("Added 1 penny");
	                    break;
	                    
	                  //Add a nickel when user picks 3
	                case 3:
		                  //adds 1 nickel to the bank using pb.nickel
	                	pb.nickel(1);
	                    System.out.println("Added 1 nickel");
	                    break;
	                    
	                  //Add a dime when user picks 4
	                case 4:
		                  //adds 1 dime to the bank using pb.dime
	                	pb.dime(1);
	                    System.out.println("Added 1 dime");
	                    break;
	                    
	                  //Add a quarter when user picks 5
	                case 5:
		                 //adds 1 quarter to the bank using pb.quarter
	                	pb.quarter(1);
	                    System.out.println("Added 1 quarter");
	                    break;
	                    
	                  //Take money out of piggy bank when user picks 6
	                case 6:
		                  //uses pb.bankTotal to show the total amount the user has in the bank and then resets the bank to $0.00 with pb.takeOut
	                    System.out.println("You took $" + deca.format(pb.bankTotal()) + " out of the bank" );
	                    pb.takeOut();
	                    break;
	            }
	            }
	        //keeps the loop going when choice is any number but 0
	            while (choice != 0);
	            
	            }
	        }
			    

	/*
Screen dump test 1:
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 2
Added 1 penny
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 3
Added 1 nickel
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 4
Added 1 dime
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 5
Added 1 quarter
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 1
Total in bank: $0.41

Test 2:
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 6
You took $0.41 out of the bank
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 1
Total in bank: $0
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of your bank
Enter 0 to quit
Enter your choice: 0
Quit successful
	*/
