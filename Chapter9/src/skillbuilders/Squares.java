package skillbuilders;


public class Squares {
	
	public static void main(String[] args) {
	       //create array to store 5 elements
	       int[] squares = new int[5];
	       
	       //fill array with squares of the index
	       for (int i = 0; i < squares.length; i++) {
	           squares[i] = i * i; // Square of the index
	       }
	       //show the values of each element
	       System.out.println("Squares of the indices:");
	       for (int i = 0; i < squares.length; i++) {
	           System.out.println("Index " + i + ": " + squares[i]);
	       }
	   }
	}

