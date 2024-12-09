package skillbuilders;

public class Reverse {

	public static void main(String[] args) {
		
		//create array that has ten elements which values are the same as their index
		int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		//title
		System.out.println("Countdown");
		
		//outputting array in a reverse
		for (int i = 9; i >= 0; i--) {
			System.out.println(num[i]);		
			}
		
	}

}