package labz11b;
//Author 			: Mark MCCleane
//Date 				: Jan-2016
//Purpose 			: A Hgv class demonstrating inheritance

public class HGV extends RoadVehicle implements ImportDuty
{
	private int cargo;
	private double HGVValue;

	public HGV()
	{ 	this(0,0,0);	}

	public HGV(int c, int w, int p)
	{ 
		super(w, p);
		setCargo(c);
	}

	public void setCargo(int size)
	{
		cargo = size;
	}

	public int getCargo()
	{
		return cargo;
	}
	public void setCarValue(double HGVValue){
		this.HGVValue = HGVValue;
	}
	public double getCarValue(){
		return HGVValue ;
	}
	public void calculateDuty(){
		double answer = HGVValue * HGVTAXRATE;
		System.out.print(answer);
	}
}
