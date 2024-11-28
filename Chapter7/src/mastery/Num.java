package mastery;
  
public class Num {
	
	   //establish int num and makes it private so it only exists here
	   private int num;
	   
	   //Constructor method
	   public Num(int number) {
		   //
	       num = number;
	   }
	   
	   //method to get the ones place
	   public int ones() {
	       return Math.abs(num % 10);
	   }
	   
	   //method to get the tens place
	   public int tens() {
	       return Math.abs((num / 10) % 10);
	   }
	   //method to get the hundreds place
	   public int hundreds() {
	       return Math.abs(num / 100);
	   }
	   
	   //method to get the whole number
	   public int getNum() {
	       return num;
	   }
}