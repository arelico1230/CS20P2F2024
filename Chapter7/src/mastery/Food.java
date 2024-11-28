package mastery;

public class Food {

	
	//create variables
	private double price;
	
	//constructor method
	public Food() {
		price = 0;
	}
	
	//adds whatever number is set in mysavings to pen
	public void burger (int num, double fat, double carb, double fiber) {
		price += num * 1.85;
		fat = 9;
		carb = 33;
		fiber = 1;
		System.out.println("Each hamburger has "+ fat + "g of fat, " + carb + "g of carbs, and " + fiber + "g of fiber");
	}
	
	//adds whatever number is set in mysavings to nic
	public void salad (int num, double fat, double carb, double fiber) {
		 price += num * 2;
		 fat = 1;
		 carb = 11;
		 fiber = 5;
		 System.out.println("Each salad has "+ fat + "g of fat, " + carb + "g of carbs, and " + fiber + "g of fiber");
	}
	
	//adds whatever number is set in mysavings to dime
	public void fries (int num, double fat, double carb, double fiber) {
		price += num * 1.3;
		fat = 11;
		carb = 36;
		fiber = 4;
		System.out.println("Each order of french fries has "+ fat + "g of fat, " + carb + "g of carbs, and " + fiber + "g of fiber");
	}
	
	//adds whatever number is set in mysavings to dime
	public void soda (int num, double fat, double carb, double fiber) {
		price += num * 0.95;
		fat = 0;
		carb = 38;
		fiber = 0;
		System.out.println("Each soda has "+ fat + "g of fat, " + carb + "g of carbs, and " + fiber + "g of fiber");
	}
	
	//turns pen nic and dime into their monetary values and adds them all together for the total amount in the bank
	public double orderTotal () {
		return price;
	}
}
