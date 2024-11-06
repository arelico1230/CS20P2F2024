/*

Program: Addcoins.java          Date: November 6, 2024

Purpose: User has to input the amount of coins they have then program adds coins together to get the total amount of dollars

Name: Richard Chang
School: CHHS
Course: Computer Science 20
 
*/

package mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Addcoins {
	
	public static void main(String[] args) {
		// Lets the user input values and makes it so that decimals only go to the hundredths
        Scanner in = new Scanner(System.in);
        DecimalFormat deca = new DecimalFormat("#.##");
        
      //prompt user to enter pennies, nickels, dimes, and quarters then holds the amount of each coin in variables
        System.out.print("Enter number of pennies: ");
        int pen = in.nextInt();
        System.out.print("Enter number of nickels: ");
        int nic = in.nextInt();
        System.out.print("Enter number of dimes: ");
        int dime = in.nextInt();
        System.out.print("Enter number of quarters: ");
        int quarter = in.nextInt();
        
        //applies the getDollarAmount method to the amount of pennies, nickels, dimes, and quarters the user entered
       Double total = getDollarAmount(pen, nic, dime, quarter);
       
       //outputs the total dollar amount with a message
        System.out.println("Total dollar amount: " + deca.format(total));
        
    }
	//method to convert the number of coins into dollars
    public static Double getDollarAmount(int pen, int nic, int dime, int quarter) {
    	
    	//multiplies the amount of pennies, nickels, dimes, and quarters to their actual value then adds them together
        Double total = (pen * 0.01) + (nic * 0.05) + (dime * 0.1) + (quarter * 0.25);
        
        //returns total
        return (total);
    }
/*
Screen dump Test 1:
Enter number of pennies: 1
Enter number of nickels: 1
Enter number of dimes: 1
Enter number of quarters: 1
Total dollar amount: 0.41

Test 2:
Enter number of pennies: 14
Enter number of nickels: 15
Enter number of dimes: 19
Enter number of quarters: 27
Total dollar amount: 9.54
 */


}



