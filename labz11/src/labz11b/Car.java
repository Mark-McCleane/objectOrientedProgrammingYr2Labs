package labz11b;
//Author 			: Mark MCCleane
//Date 				: Jan-2016
//Purpose 			: A Car class demonstrating inheritance

public class Car extends RoadVehicle implements ImportDuty
{
	private String carType;
	private double carValue;

	public Car() {
	 	this("", 0, 0); }

	public Car(String c, int w, int p) { 
		super(w, p);
		setType(c);
		setCarValue(carValue);
	}

	public void setType(String t)  {
		carType = t;
	}

	public String getType() {
		return carType;
	}
	public void setCarValue(double carValue){
		this.carValue = carValue;
	}
	public double getCarValue(){
		return carValue;
	}
	public void calculateDuty(){
		double answer = carValue * CARTAXRATE;
		System.out.print(answer);
	}
}