package lab10c;

public class Musician extends person 
{
	public String instrument; 
	public Musician(String name,String instrument)
	{
		super(name);
		setInstrument(instrument);
	}
	public void setInstrument(String instrument) 
	{
		this.instrument = instrument;
	}
	
	public String getInstrument() 
	{
		return instrument;
	}
	public String toString()
	{
		return "name: " + getName() + "\nInstrument: " + getInstrument();
	}
}