package lab10a;
//Author 			: Mark McCleane
// Date 			: Jan-2016
// Purpose 			: A Circle superclass to demonstrate inheritance

public class Circle extends Point
{
	private double radius;
	
	public Circle(double x, double y,double r)
	{
		super(x,y);
		setRadius(r); 
	}

	public double getRadius()
	{ 
		return radius; 
	}
	
	public void setRadius(double r)
	{
		radius = r; 
	}

	public double area()
	{
		return Math.PI * Math.pow(radius, 2); 
	}

	public String toString()
	{		
		return ("Radius : " + radius);
	}
}
