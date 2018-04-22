package lab10d;

public class Cow extends Animal
{

	String name;
	public Cow(String name, String type, int age,char gender)
	{
		super(type,age,gender);
		setName(name);
				
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String eat()
	{
		return getName() + " is eating";
	}
	
	public String sleep()
	{
		return getName() + " is sleeping";
	}	
	public void cast()
	{
		System.out.println(getName() + " is casting" );
	}
}
