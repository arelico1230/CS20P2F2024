package mastery;

public class Food {

	
	   private double price;
	   private int fat;
	   private int carb;
	   private int fiber;
	   
	   //Constructor method
	   public Food(double prices, int fats, int carbs, int fibers) {
	       price = prices;
	       fat = fats;
	       carb = carbs;
	       fiber = fibers;
	   }
	   
	   //method to return price
	   public double price() {
	       return price;
	   }
	   
	 //method to return fat
	   public int fat() {
	       return fat;
	   }
	   
	 //method to return carbs
	   public int carbs() {
	       return carb;
	   }
	   
	 //method to return fiber
	   public int fiber() {
	       return fiber;
	   }
	}


