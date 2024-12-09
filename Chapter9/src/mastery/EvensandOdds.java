package mastery;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EvensandOdds {
	
    public static void main(String[] args) {
    	
        // Create a Random object
        Random r = new Random();
        
        // Lists to store even and odd numbers
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        // Generate 25 random numbers between 0 and 99
        for (int i = 0; i < 25; i++) {
        	
        	// Generates a number between 0 and 99
            int num = r.nextInt(100); 
            
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        
        // Display even numbers
        System.out.print("EVEN: ");
        for (int num : even) {
            System.out.print(num + " ");
        }
        
        // Display odd numbers
        System.out.print("ODD: ");
        for (int num : odd) {
            System.out.print(num + " ");
        }
    }
}




