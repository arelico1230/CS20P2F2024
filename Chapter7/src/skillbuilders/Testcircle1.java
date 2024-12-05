package skillbuilders;

public class Testcircle1 {
	
	public static void main(String[] args) {
		//creating circle object
		Circle1 spot = new Circle1();
		//changing radius of circle object and outputting its area and circumference
		spot.setRadius(6);
		System.out.println("Circle radius: " + spot.area());
		System.out.println("Circle circumference: " + spot.circumference());
	}

}