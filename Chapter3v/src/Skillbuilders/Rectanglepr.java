/*
Program: ????.java          Date: September 17, 2024

Purpose:Take the values of the width and length of a rectangle and calculate the perimeter

Author: Richard
School: CHHS
Course: Computer Science 20
 
 */



package Skillbuilders;

import java.util.Scanner;

public class Rectanglepr {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please Enter The Length Of The Rectangle: ");
		
		int length = in.nextInt();
		
		System.out.print("Please Enter The Width Of The Rectangle: ");
		
		int width = in.nextInt();
		
		int perimeter  = length + width + length + width;
		
		System.out.print("The Perimeter Of The Rectangle Is: "+ perimeter);
		
	}

}
