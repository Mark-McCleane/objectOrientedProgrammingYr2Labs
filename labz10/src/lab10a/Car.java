package lab10a;
//Author 			: Mark MCCleane
//Date 			: Jan-2016
//Purpose 			: A Car class demonstrating inheritance

public class Car extends RoadVehicle
{
	private String carType;

	public Car() {
	 	this("", 0, 0); }

	public Car(String c, int w, int p) { 
		super(w, p);
		setType(c);
	}

	public void setType(String t)  {
		carType = t;
	}

	public String getType() {
		return carType;
	}
}
