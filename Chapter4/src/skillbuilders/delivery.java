package skillbuilders;

import java.util.Scanner;

public class delivery {
	public static void main(String[] args) 
	{
		  Scanner in = new Scanner(System.in);
		  int sum = 0;
		  //prompts user for length and depending on the input accepts or rejects the value if it is over 10 using if else statements
		  System.out.print("Please Enter The Length Of The Package: ");
			int length = in.nextInt();
			
			if (length > 10) {
				System.out.println("Reject");
			}
			else {
				System.out.println("Accept");
				sum += length;
			}
			//prompts user for width and depending on the input accepts or rejects the value if it is over 10 using if else statements
			System.out.print("Please Enter The Width Of The Package: ");
			
			int width = in.nextInt();
			if (width > 10) {
				System.out.println("Reject");
			}
			else {
				System.out.println("Accept");
				sum += width;
			}
			//prompts user for height and depending on the input accepts or rejects the value if it is using if else statements
			System.out.print("Please Enter The Height Of The Package: ");
			
			int height = in.nextInt();
			if (height > 10) {
				System.out.println("Reject");
			}
			else {
				System.out.println("Accept");
				sum += height;
			}
			if (sum <= 30) {
				System.out.println("Package rejected");
			}
			else {
				System.out.println("Package accepted");
			}
	}

	
}

