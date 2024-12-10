package mastery;

import java.util.Scanner;

public class EvensandOdds {
	
    public static void main(String[] args) {
    	
    	int[] num = new int[25];

    	
    	final int hi = 99;
		final int low = 0;
		final int range = hi - low + 1;
		
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
    





