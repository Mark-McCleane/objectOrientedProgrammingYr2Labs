package lab10c;

public class person 
{
	String name;
	
	public person(String name)
	{
		setName(name);
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
	public String toString()
	{
		return "name = " + getName();
	}
}
