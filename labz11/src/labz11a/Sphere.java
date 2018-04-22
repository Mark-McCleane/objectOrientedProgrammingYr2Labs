package labz11a;
public class Sphere extends ThreeDShape
{
  	private double radius;

  	public Sphere(String name, double radius,String colour)
  	{ 
    	super(name,colour); 
    	setRadius(radius);    	
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
  		return 4 * Math.PI *  Math.pow(radius, 2); 
  	}
  	
	public double volume()
	{
		return 4.0/3.0 * Math.PI *  Math.pow(radius, 3);
	}
	
	public String toString()
  	{
  		return (super.toString() + "\nRadius = " + radius);
  	}

}
