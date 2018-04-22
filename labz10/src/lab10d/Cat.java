package lab10d;

public class Cat extends Animal
{
	public String name;
	
	public Cat(String name, String type, int age,char gender)
	{
		super(type,age,gender);
		setName(name);
	}
	public   String getName() {
		return name;
	}
	
	public  void setName(String newName) {
		newName = name;
	}
	
	public String eat()
	{
		return getName() + " is eating";
	}
	
	public String sleep()
	{
		return getName() + " is sleeping";
	}
	
	public String makeSound()
	{
		return "prrrr";
	}
	public static void scratch()
	{
	     System.out.println("Having a good scratch");
	}
	@Override
	public String toString() {
		return "Cat name = " + name + ", type= " + type + ", age= " + age + ", gender= " + gender + " !";
	}

}
