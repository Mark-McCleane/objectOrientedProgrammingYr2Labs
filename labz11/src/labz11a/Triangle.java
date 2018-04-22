package labz11a;
public class Triangle extends TwoDShape
{
	private double base;
	private double height;

  	public Triangle(String name, double base,double height,String colour)
  	{ 
  		super(name,colour);
  		setBase(base);
  		setHeight(height);
  	}

  	public void setBase(double base){
  		this.base = base;
  	}
  	public double getBase(){
  		return base;
  	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double area(){
		return 0.5 * base * height;
	}
	
	public String toString()
  	{
  		return (super.toString() + "\nbase = " + base + "\nheight = " + height);
  	}
  	


}
