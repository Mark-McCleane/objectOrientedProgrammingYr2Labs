package lab7c;

public class Rectangle {

	public double length;
	public double width;
	
	public Rectangle()
	{
		setLength(7);
		setWidth(5);
	}
	public Rectangle(double w, double l)
	{
		setLength(l);
		setWidth(w);
	}
	public void setLength(double l)
	{
		length = l ;		
	}
	
	public void setWidth(double w)
	{
		width= w ;		
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getArea()
	{
		double areaRectangle = 0;
		areaRectangle = length * width;
		return areaRectangle;
	}
	
	public double getPerimeter()
	{
		double perRectangle = 0;
		perRectangle = (length * 2) + (width * 2);
		return perRectangle;
	}
	
	public String printRectangle()
	{
		for(double i = 1;i <= getWidth();i++)
		{
			System.out.print("*");
		}
		
		System.out.print("\n");
		
		for(int i = 1; i <= getLength()-1;i++)
			{
				System.out.print("*");
				for(double j = 1;j <= getWidth()-2;j++) // -2 as * is already used
				{
					System.out.print(" ");
				}
					System.out.println("*");
			}
		
		for(double i = 1;i <= getWidth();i++)
		{
			System.out.print("*");
		}
		return "\n";
	}
	
	
	public String toString()
	{
		return "Length = " + getLength() +  ", Width = " + getWidth() + ", Area = " + getArea() + ", Perimeter = " + getPerimeter() ;
	}

}