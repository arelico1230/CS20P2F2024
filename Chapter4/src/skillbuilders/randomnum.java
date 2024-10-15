package skillbuilders;

import java.util.Random;
import java.util.Scanner;

public class randomnum {
	public static void main(String[] args) 
	{
		  Scanner in = new Scanner(System.in);
		  int min, max;
		  System.out.print("Enter a minimum number: ");
		  min = in.nextInt();
		  System.out.print("Enter a maximum number: ");
		  max = in.nextInt();
		  //r.nextInt(max - min + 1) + min;  r.nextInt(max))
		  Random r = new Random();
		  System.out.println("Your random number: " + r.nextInt(max - min + 1) + min);
		  
}
}