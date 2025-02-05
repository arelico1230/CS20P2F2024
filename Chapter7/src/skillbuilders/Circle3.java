package skillbuilders;

public class Circle3 {
	private double radius;
	private static final double PI = 3.14;
	
	//constructor method
		public Circle3() {
			radius = 1;
		}
		
		//constructor method
		public Circle3(double r) { 
			radius = r;
		}
		
		//changes radius of circle object
		public void setRadius(double newRadius) { 
			radius = newRadius;
		}
		
		//returns area of the circle object using its radius
		public double area(){
			return(radius * radius * PI);
		}
		
		//returns the radius value
		public double getRadius() {
			 return(radius);
		}
		
		//returns area of the circle object using its radius
		public double circumference(){ 
			return(radius * 2 * PI);
		}
		
		//output message that tells the formula
		public static void displayAreaFormula() {
			System.out.println("The formula for the area of a circle is a = Pi*r*r");
		}

}

