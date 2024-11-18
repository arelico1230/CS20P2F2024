package skillbuilders;

import java.util.Scanner;

public class Exponentiation {
	
	public static void main(String[] args) {
		
		//Lets the user input values
        Scanner in = new Scanner(System.in);
        
        //prompt user for input and holds num for later
        System.out.print("Enter number:");
        int num = in.nextInt();
        
        //prompt user for input and holds exp for later
        System.out.print("Enter exponent:");
        int exp = in.nextInt();
        
        //runs num and exp through the powerOf method
        double total = powerOf(num, exp);
        
        //outputs the numbers they input and the total
        System.out.println(num + " to the power of " + exp + " is: " + total);
    }
	
	//method to use the equation num^exp is (total)
    public static double powerOf(double base, int exp) {
    	//takes num and puts it to the power of exp
        double total =(Math.pow(base, exp));
        //returns the answer
        return total;
    }
}