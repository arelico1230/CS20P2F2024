package skillbuilders;

public class Testcircle4 {

	public static void main(String[] args) {
		//creating two new circle object uses overloaded constructor method
		Circle4 spot = new Circle4();
		Circle4 spot1 = new Circle4(3);
		//setting first circle objects radius to new radius
		spot.setRadius(6);
		//outputting area and circumference of both circle objects
		System.out.println("Circle radius: " + spot.area());
		System.out.println("Circle circumference: " + spot.circumference());
		System.out.println("Circle radius: " + spot1.area());
		System.out.println("Circle circumference: " + spot1.circumference());
		//outputting formula for the area of circle using class method
		Circle4.displayAreaFormula();
		//comparing if two circles of same class have equal radiuses
		if (spot.equals(spot1)) {
			 System.out.println("Objects are equal.");
			 } else {
			 System.out.println("Objects are not equal.");
			 }
		//outputs radius of circle objects to user
		System.out.println(spot);
		System.out.println(spot1);
	}

}