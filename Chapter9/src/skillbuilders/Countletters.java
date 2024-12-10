package skillbuilders;

import java.util.Scanner;

public class Countletters {
	public static void main(String[] args) {
		
		//smallest possible value
		final int low = 'A'; 
		//highest possible value
		 final int hi = 'Z'; 
		 
		 //letting list of letters have the same amount of elements as letters in alphabet
		 int[] letterCounts = new int[hi - low + 1];
		 Scanner in = new Scanner(System.in);
		 
		 
		 //create array for the letters
		 char[] phraseLetters;
		  
		 //prompt user to enter their phrase
		 System.out.print("Please enter a phrase: ");
		 
		 //turning phrase upper case so it's not case sensitive
		 String phrase = (in.nextLine()).toUpperCase();
		 
		 //turning each character in the phrase into a value on an array
		 phraseLetters = phrase.toCharArray();
		 
		 //making sure the characters are letters then putting them into the main array which is used to show the number of each letter in the user input
		 for (char letter: phraseLetters) {
			 if(letter >= low && letter <= hi) {
				int offset = letter - low;
				letterCounts[offset] += 1;
			 }
		 }
		 //Outputting how many of each letter is in the phrase
		 for (int i = low; i <= hi; i++ ) {
			 System.out.println((char)i + ": " + letterCounts[i - low]);
		 }
	}

}