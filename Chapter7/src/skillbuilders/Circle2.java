package skillbuilders;

public class Circle2 {
	private double radius;
	private static final double PI = 3.14;
	
	//constructor method
		public Circle2() {
			radius = 1;
		}
		
		//constructor method
		public Circle2(double r) { 
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

}