package mastery;

import java.util.Scanner;

public class EvensandOdds {
	
    public static void main(String[] args) {
    	
    	//create array with 25 elements
    	int[] num = new int[25];

    	//highest value
    	final int hi = 99;
    	
    	//lowest value
		final int low = 0;
		
		//range made using both highest and lowest values
		final int range = hi - low + 1;
		
		//for loop to generate random numbers within the range
		for(int i = 0; i < 25; i++) {
			num[i] = (int)(Math.random() * range);
		}
		
		//title
		System.out.print("odds:");
		//checking numbers from the array and outputting the odd ones
		for( int i = 0; i<25; i++) {
			if ((num[i] % 2) != 0) {
				System.out.print(num[i]);
				System.out.print(", ");
			}
		}
		
		//blank to make new line for evens
		System.out.println("");
		
		//title
		System.out.print("evens:");
		//checking numbers from the array and outputting the even ones
		for( int i = 0; i<25; i++) {
			if ((num[i] % 2) == 0) {

				System.out.print(num[i]);
				System.out.print(", ");
			}
		}
	}
}
    
/*
 Screen dump
 
Test case 1:
odds:51, 31, 69, 57, 29, 3, 9, 79, 99, 
evens:32, 30, 36, 98, 86, 24, 10, 94, 10, 30, 92, 78, 74, 4, 28, 32, 

Test case 2:
odds:15, 65, 75, 87, 23, 35, 69, 15, 69, 39, 85, 25, 73, 83, 27, 55, 
evens:64, 84, 70, 92, 16, 24, 20, 62, 32, 
 */




