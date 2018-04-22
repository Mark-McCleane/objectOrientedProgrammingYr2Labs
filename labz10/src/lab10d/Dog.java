package lab10d;

public class Dog extends Animal
{
	public  String name;
	
	//animal Dog = new animal();
	public Dog(String name, String type, int age,char gender)
	{
		super(type, age,gender);
		setName(name);
	}
	public  String getName() {
		return name;
	}
	
	public  void setName(String newName) {
		name = newName;
	}
	@Override
	public String eat()
	{
		return getName() + " is eating";
	}
	@Override
	public String sleep()
	{
		return getName() + " is sleeping";
	}
	
	public String makeSound()
	{
		return "woof woof" ;
	}
	public void wagTail()
	{
	     System.out.println("Tail is wagging");
	}

	@Override
	public String toString() {
		return "Dog name = " + name + ", type= " + type + ", age= " + age + ", gender= " + gender + " !";
	}
	
	
	
}
