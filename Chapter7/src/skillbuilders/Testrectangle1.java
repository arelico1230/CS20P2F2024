package skillbuilders;

public class Testrectangle1 {
	public static void main(String[] args) {
		//creating 2 boxes using rectangle class with first method and overloaded method
		Rectangle1 box = new Rectangle1();
		Rectangle1 box2 = new Rectangle1(5, 7);
		//set new length and width for first box
		box.setLength(8);
		box.setWidth(9);
		//outputs length, width, area, and perimeter for both boxes
		System.out.println("box length is " + box.getLength());
		System.out.println("box width is " + box.getWidth());
		System.out.println("box2 length is " + box2.getLength());
		System.out.println("box2 width is " + box2.getWidth());
		System.out.println("box area is " + box.area());
		System.out.println("box perimeter is " + box.perimeter());
		System.out.println("box2 area is " + box2.area());
		System.out.println("box2 perimeter is " + box2.perimeter());
	}

}
