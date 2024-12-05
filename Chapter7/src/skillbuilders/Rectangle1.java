package skillbuilders;

public class Rectangle1 {
	
	private double length, width;
	
	//Constructor method
	public Rectangle1(){
		length = 1;
		width = 1;
	}
	
	//Constructor method
	public Rectangle1(double l, double w){
		length = l;
		width = w;
	}
	
	//returns length
	public double getLength() {
		return(length);
	}
	
	//returns width
	public double getWidth() {
		return(width);
	}
	
	//setting new length for rectangle by entering a parameter for new length
	public void setLength(double l) {
		length = l;
	}
	
	//setting new width for rectangle by entering a parameter for new length
	public void setWidth(double w) {
		width = w;
	}
	
	//returns area of circle with current length and width
	public double area() {
		return(length * width);
	}
	
	//returns perimeter of rectangle with current length and width
	public double perimeter() {
		return(2 * (length + width));
	}
}