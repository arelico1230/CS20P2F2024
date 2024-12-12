/*

Program: Palindrome.java          Date: December 12th, 2024

Purpose: takes the user entered phrase then checks and tells the user if its a palindrome

Author: Richard Chang
School: CHHS
Course: Computer Science 20
 

*/

package mastery;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Lets the user input values
		Scanner in = new Scanner(System.in);
		
		//prompting user input
		System.out.print("Enter your phrase: ");
		
		//turning all letters in the phrase to lower case so it isn't case sensitive
		String phrase = (in.nextLine()).toLowerCase();
		
		//getting rid of all non letter characters to make it so system doesn't make mistakes when looking through phrase
		phrase = phrase.replaceAll("[^a-z]","");
		
		//putting each character of the phrase into it's own element in array
		char[] letters = phrase.toCharArray();
		
		//boolean to check if the phrase is a palindrome
		boolean palindrome = true;
		
		//check if phrase is palindrome by checking if each character equals to the characters in the phrase reversed
		for(int i = 0; i < letters.length; i++) {
			
			//is one character doesn't equal its reversed counterpart than the variable made from becomes false
			if(letters[i] != letters[letters.length - i-1]) {
				palindrome = false;
			}
	}
		//if boolean palindrome is false then will output that the phrase isn't a palindrome
		if (palindrome == false) {
			System.out.print("The phrase entered is not a palindrome");
		} 
		
		//if palindrome is true then it will output that the phrase is a palindrome
		else {
			System.out.print("The phrase entered is a palindrome");
		}

}
}

/*
Screen dump

Test case 1:
Enter your phrase: No lemon, no melon.
The phrase entered is a palindrome

Test case 2:
Enter your phrase: Richard Chang
The phrase entered is not a palindrome
*/