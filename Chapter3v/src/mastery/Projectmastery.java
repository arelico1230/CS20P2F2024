package mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Projectmastery {
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  DecimalFormat deca = new DecimalFormat("#.##");
	      int sum = 0;
		  System.out.println("Project Time Percentages");
		//Prompt the user to enter a value in minutes then declares variable for number and stores number then uses sum to add the number
	      System.out.print("Designing minutes: ");
	      int des = in.nextInt();
	      sum += des;
	      
	    //Prompt the user to enter a value in minutes then declares variable for number and stores number then uses sum to add the number
	      System.out.print("Coding minutes ");
	      int cod = in.nextInt();
	      sum += cod;
	    //Prompt the user to enter a value in minutes then declares variable for number and stores number then uses sum to add the number
	      System.out.print("Debugging minutes: ");
	      int deb = in.nextInt();
	      sum += deb;
	    //Prompt the user to enter a value in minutes then declares variable for number and stores number then uses sum to add the number
	      System.out.print("Testing minutes: ");
	      int tes = in.nextInt();
	      sum += tes;
	      // Takes all the variables and turns them into percentages so that it will output as percentages and also add up to 100%
	      double min = (Double.valueOf(des) / Double.valueOf(sum))*100;
	      double min1 = (Double.valueOf(cod) / Double.valueOf(sum))*100;
	      double min2 = (Double.valueOf(deb) / Double.valueOf(sum))*100;
	      double min3 = (Double.valueOf(tes) / Double.valueOf(sum))*100;
	    
	      //Outputs all the variables as percentages from all the double variables
	      System.out.println("Task		%Time");
	      System.out.println("Designing	" + deca.format(min) + "%");
	      System.out.println("Coding		" + deca.format(min1) + "%");
	      System.out.println("Debugging  	" + deca.format(min2) + "%");
	      System.out.println("Testing 	" + deca.format(min3) + "%");
	}
	
}
