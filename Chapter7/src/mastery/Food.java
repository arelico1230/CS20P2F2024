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
	   
	   // Getter methods for food properties
	   public double price() {
	       return price;
	   }
	   public int fat() {
	       return fat;
	   }
	   public int carbs() {
	       return carb;
	   }
	   public int fiber() {
	       return fiber;
	   }
	}


