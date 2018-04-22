package lab10a;

public class Point {

	private double x;
	private double y;
	
	public Point() 
	{
		this(0,0);	
	}
	public Point(double x, double y) 
	{ 
		setX(x);
		setY(y);
	}
	
	protected void setX(double x) 
	{
		this.x = x;
	}
	
	protected void setY(double y) 
	{
		this.y = y;
	}
	protected double getX() 
	{
		return x;
	}
	protected double getY() 
	{
		return y;
	}
	@Override 
	public String toString() 
	{
		return "Point X: "+ x + " Point Y: " + y;
	}	
}
