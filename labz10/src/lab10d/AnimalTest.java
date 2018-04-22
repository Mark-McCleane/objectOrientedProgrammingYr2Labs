package lab10d;
// Author 			: Mark McCleane
// Date 			: December -2016
// Purpose 			: A test driver program for our Animal class

public class AnimalTest
{
	public static void main (String args[])
	{
		Animal dog = new Dog("Fluffy", "Poodle", 4, 'M');
		System.out.println(dog);
		
		System.out.println(dog.eat() );
		System.out.println(dog.sleep());
		System.out.println(dog.makeSound() );
		Dog d = (Dog) dog;		
		d.wagTail();
		System.out.println();
		
		Animal cat = new Cat("Timmy", "Tom", 2, 'F');
		System.out.println(cat);
		
		System.out.println(cat.eat() );
		System.out.println(cat.sleep() );
		System.out.println(cat.makeSound() );

		System.out.println();
		
		Animal myCow = new Cow("Daisy","Limousine", 3,'F');
		System.out.println(myCow);
		Cow c = (Cow) myCow;		
		c.cast();
		
		System.out.print("\n\n\n\n");
		System.out.println("________________________");
		
		Vet myVet = new Vet("Mark");
		myVet.vaccinate(dog);
		
		System.out.println("________________________");

		Vet myCatsVet = new Vet("John");
		myCatsVet.vaccinate(cat);
		
		
		
		
		}
}
