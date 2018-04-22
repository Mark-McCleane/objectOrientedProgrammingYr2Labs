package lab10a;
// Author 			: Oisin Cawley
// Date 			: Jan-2016
// Purpose 			: A Circle superclass to demonstrate inheritance

public class Circle1
{
	private double radius;
	
	public Circle1(double r)
	{ setRadius(r); }

	public double getRadius()
	{ return radius; }
	
	public void setRadius(double r)
	{ radius = r; }

	public double area()
	{ return Math.PI * Math.pow(radius, 2); }

	public String toString()
	{		
		return ("Radius : " + radius);
	}
}
