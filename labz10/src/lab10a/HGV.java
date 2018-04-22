package lab10a;
//Author 			: Mark MCCleane
//Date 				: Jan-2016
//Purpose 			: A Hgv class demonstrating inheritance

public class HGV extends RoadVehicle
{
	private int cargo;

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
}
