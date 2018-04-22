package lab10a;

public class Sphere extends Circle1
{

	public Sphere(double radius)
	{
		super(radius);
	}

	public double getAreaSphere() {
		return ( (4 * super.area() ) ) ;	// 4 PI R(to power 2)
	}
	
	public double getVolumeSphere() 
	{
		//return (4 / 3) * Math.PI * (Math.pow(radius, 3) ;
		return ( (4/3) * super.area() * super.getRadius() );
	}
	@Override
	public String toString() {
		return "Sphere area: " + getAreaSphere() + ",\nSphere Volume: " + getVolumeSphere();
	}
	
	
	
	
}
	

