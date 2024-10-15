/*

Program: quadratic_Mastery.java          Date: September 30, 2024

Purpose: Quadratic formula calculator

Name: Richard Chang
School: CHHS
Course: Computer Science 20
 
*/
package mastery;

import java.text.DecimalFormat;
import java.util.Scanner; 

public class quadratic {
	public static void main(String[] args) {
        // Lets the user input values and decimal format used to make the decimals cut off at the hundredths
        Scanner in = new Scanner(System.in);
        DecimalFormat deca = new DecimalFormat("#.##");

        //Tells the user to enter the numbers for a, b, and c in the quadratic formula
        System.out.print("Enter for a: ");
        int a = in.nextInt();

        System.out.print("Enter for b: ");
        int b = in.nextInt();

        System.out.print("Enter for c: ");
        int c = in.nextInt();
        
        //quadratic formula used in java and uses variables from before and puts them in
        double p = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2*a);
        double p1 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2*a);

        //Tells the user the answer
        System.out.print("Your roots are: " + deca.format(p) + " and " + deca.format(p1));
        
/*
Screen dump
Test case 1:
Enter for a: 3
Enter for b: 2
Enter for c: -19
Your roots are: -2.87 and 2.21

Test case 2:
Enter for a: 6
Enter for b: -17
Enter for c: 12
Your roots are: 1.33 and 1.5
*/
}
}
