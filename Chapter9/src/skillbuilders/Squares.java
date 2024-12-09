package skillbuilders;


public class Squares {
	
	public static void main(String[] args) {
		
	       //create array to store 5
	       int[] squares = new int[5];
	       
	       //fill array with squares of the index
	       for (int i = 0; i < 5; i++) {
	    	   
	    	   //indexes squared
	           squares[i] = i * i;
	       }
	       //title
	       System.out.println("Squares of the indexes:");
	
	       //show the values of each index
	       for (int i = 0; i < 5; i++) {
	           System.out.println("Index " + i + ": " + squares[i]);
	       }
	   }
	}

