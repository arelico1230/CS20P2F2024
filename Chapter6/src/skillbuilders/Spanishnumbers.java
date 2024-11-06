package skillbuilders;

public class Spanishnumbers {
	  public static void main(String[] args) {
	       
		  // Loop i through until it reaches 10
	       for (int i = 1; i <= 10; i++) {
	    	   
	           // Call method to output the Spanish word for the number
	           SpanishNumber(i);
	       }
	   }
	   // Method to display the Spanish word for the number passed
	   public static void SpanishNumber(int num) {
	      //initialize variable
		   String spanish = null;
		   
		   //outputs spanish number name based on the number changing
	       switch (num) {
	           case 1:
	               spanish = "Uno";
	               break;
	           case 2:
	               spanish = "Dos";
	               break;
	           case 3:
	               spanish = "Tres";
	               break;
	           case 4:
	               spanish = "Cuatro";
	               break;
	           case 5:
	               spanish = "Cinco";
	               break;
	           case 6:
	               spanish = "Seis";
	               break;
	           case 7:
	               spanish = "Siete";
	               break;
	           case 8:
	               spanish = "Ocho";
	               break;
	           case 9:
	               spanish = "Nueve";
	               break;
	           case 10:
	               spanish = "Diez";
	               break;
	       }
	       // Outputs the number and the name in spanish
	       System.out.println(num + " in Spanish is: " + spanish);
	       
	       /*
	        String myStr = "Hello %s! One kilobyte is %,d bytes.";
    String result = String.format(myStr, "World", 1024);
    System.out.println(result);
  
	        */
	        
	   }
	}
