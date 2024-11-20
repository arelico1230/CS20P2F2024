package skillbuilders;

public class Circle {
	private double radius;
	private static double PI = 3.14;
	
	//Constructor method
	
	public Circle() 
	{
		radius = 1;
	}
	
	//Constructor method
	public Circle(double r) 
	{
		radius = r;	
	}
	
	//changes the radius of the circle
	public void setRadius(double r)
	{
		radius = r;
	}
	
	//
	public double getRadius()
	{
		return radius;
	}
	
	//calculates the area of the circle
	public double area()
	{	
		double circArea = PI * radius * radius;
		
		return circArea;
		}
	
	//returns the circumference of the circle
	public double circumference()
	{
		double circ = 2 * PI * radius;
		
		return circ;
	}
	
	
	public boolean equals(Object c)
	{
		Circle testObj = (Circle)c;
		
		if(testObj.getRadius() == radius)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	public String toString()
	{
		
		String circ = "Circle has radius "+ radius;
		
		return(circ);
	}
	

}