package lab7a;
//Author 	: Mark McCleane
//Date 	: Novemer-2016
//Purpose 	: Tests our Dog class.

public class DogTest
{ // begin DogTest

	public static void main(String args[]) 
	{ // being main method

		Dog myDog = new Dog("Sandy", "Brown", "Bulldog");
		Dog myOtherDog = new Dog("Fluffy", "White", "Labroador");
		// Create an instance of our Dog class

		System.out.println("My dog's name is " + myDog.name);
		System.out.println("My dog's colour is " + myDog.colour );
		System.out.println("My dog's breed is a " + myDog.breed );
		
		
		System.out.println("My other dog's name is " + myOtherDog.name);
		System.out.println("My other dog's color is " + myOtherDog.colour);
		System.out.println("My other dog's color is " + myOtherDog.breed);
	} // end main
} // end class DogTest
