package labz11a;
public abstract class ThreeDShape extends Shape
{
	public ThreeDShape(String name,String colour)
  	{ 
  		super(name,colour); 
  	}
 
  	public abstract double volume();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}