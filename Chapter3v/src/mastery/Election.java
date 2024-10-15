package mastery;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Election {
	public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  DecimalFormat deca = new DecimalFormat("#.##");
	  
	  System.out.println("Voting results from New York");
	  System.out.print("Trump: ");
	  int truny = in.nextInt(); 
	  System.out.print("Kamala: ");
	  int kamny = in.nextInt(); 
	  System.out.println("Voting results New Jersey");
	  System.out.print("Trump: ");
	  int trunj = in.nextInt();
	  System.out.print("Kamala: ");
	  int kamnj = in.nextInt();
	  System.out.println("Voting results from Connecticut");
	  System.out.print("Trump: ");
	  int truco = in.nextInt();
	  System.out.print("Kamala: ");
	  int kamco = in.nextInt();
	  
	  int trutotal = (truny + trunj + truco);
	  int kamtotal = (kamny + kamnj + kamco);
	  int total = (trutotal + kamtotal);
	  
	  double perc = (Double.valueOf(trutotal) / Double.valueOf(total))*100;
	  double perc1 = (Double.valueOf(kamtotal) / Double.valueOf(total))*100;
	  
	  System.out.println("Candidate 	Votes 	Percentage");
	  System.out.println("Trump         " + trutotal + " 	" + deca.format(perc) + "%" );
	  System.out.println("Kamala        " + kamtotal + " 	" + deca.format(perc1) + "%" );
	  System.out.println("TOTAL VOTES:  " + total);
	}

}
