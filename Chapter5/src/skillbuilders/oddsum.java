package skillbuilders;

import java.util.Scanner;

public class oddsum {
	public static void main(String[] args) 
	{
		
		  Scanner in = new Scanner(System.in);
		  
			//initialize variable
			int user, sum;
			
			//prompt user for number then holds number in variable
		  System.out.print("Enter a number: ");
		  user = in.nextInt();
		  //give sum a number so that it can add later
		  sum = 0;
		  //tells user the range of numbers it's going from
		  System.out.println("Your range of numbers from 1 to " + user);
		  //makes the minimum number which is 1 add 1 each time until it reaches the number the user entered
		  for(int n = 1; n <= user; n+=1) {
			  //output number on new line each time it adds 1
			  System.out.println(n);
		  }
		  //takes the odd numbers and uses sum to add all the odd numbers together
		  for(int o = 1; o <= user; o+=2) {
				  sum+=o;
		  }
		  //tells user the sum of all odd numbers
		  System.out.println("The sum of all the odd numbers is " + sum);
}
}