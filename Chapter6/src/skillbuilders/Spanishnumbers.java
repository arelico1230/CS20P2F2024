package skillbuilders;

public class Spanishnumbers {
	  public static void main(String[] args) {
	       
		  // loop i through 1-10 and puts it into the method
	       for (int i = 0; i <= 9; i++) {
	    	   
	    	// Outputs the number and the name in spanish
		       System.out.println((i+1) + " in Spanish is " + spanishnum(i));
	       }
	   }
	  
	   // method that runs the loop that goes up to 10 and turns them into the spanish names
	   public static String spanishnum(int num) {
	  String[] spanishnum = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez"};
	  
	  //returns the string
	  return spanishnum[num];
	       }
	   }