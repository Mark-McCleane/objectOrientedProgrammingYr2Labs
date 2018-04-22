package practiceTest;

public class Tractor extends Machine
{
	public Tractor(String name)
	{
		super(name);
	}
	public String getServiced()
	{
		return "Tractor is servicing";
	}
	@Override
	public String toString()
	{
		return "this is wrong";
	}
	
}
