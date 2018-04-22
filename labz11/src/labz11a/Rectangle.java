package labz11a;
public class Rectangle extends TwoDShape
{
	private double length;
	private double breadth;

  	public Rectangle(String name, double length, double breadth,String colour)
  	{ 
  		super(name,colour);
  		setLength(length); 
  		setBreadth(breadth); 
  	}

  	public double getLength()
  	{ 
  		return length; 
  	}

  	public void setLength(double length)
  	{ 
  		this.length = length; 
  	}

	public double getBreadth()
  	{ 
  		return breadth; 
  	}

  	public void setBreadth(double breadth)
  	{ 
  		this.breadth = breadth; 
  	}
  	
  	public double area()
  	{ 
  		return length * breadth; 
  	}
  	
  	public String toString()
  	{
  		return (super.toString() + "\nLength = " + length + "\nBreadth = " + breadth);
  	}
}
