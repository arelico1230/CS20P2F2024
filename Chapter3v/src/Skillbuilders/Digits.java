package Skillbuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a two digit number:");
		
	   int num = in.nextInt();

	   int ten = (num / 10) % 10;
	  
	   int one = num % 10;
	  
	   System.out.println("tens: " + ten);
	   System.out.println("ones: " + one);

	}

}

