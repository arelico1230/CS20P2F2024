package Skillbuilders;

import java.util.Scanner;

public class gradeavg {
	 public static void main(String[] args) 
	 {
		 Scanner in = new Scanner(System.in);
		 
		 	System.out.println("Grade Average Calculator");

			System.out.print("Enter the 1st grade:");
			int one = in.nextInt();
			
			System.out.print("Enter the 2nd grade:");
			int two = in.nextInt();
			
			System.out.print("Enter the 3rd grade:");
			int three = in.nextInt();
			
			System.out.print("Enter the 4th grade:");
			int four = in.nextInt();
			
			System.out.print("Enter the 5th grade:");
			int five = in.nextInt();
			
			int sum = (one + two + three + four + five);
			
			int bla = 5;
			
			int total = sum/bla;
			
			System.out.println("Your grade average is:  " + total);
			
			
			
		 
		 /*
		 	int sum = 0;

		 	System.out.println("Grade Average Calculator");

			System.out.print("Enter the 1st grade:");
			int one = in.nextInt();
			sum += one;
			
			System.out.print("Enter the 2nd grade:");
			int two = in.nextInt();
			sum += two;
			
			System.out.print("Enter the 3rd grade:");
			int three = in.nextInt();
			sum += three;
			
			System.out.print("Enter the 4th grade:");
			int four = in.nextInt();
			sum += four;
			
			System.out.print("Enter the 5th grade:");
			int five = in.nextInt();
			
			sum += five;
			
			int bla = 5;

			
			int total = sum / bla;
			
			System.out.println("Your grade average is:  " + total + "%");
			 */
	 }
}
