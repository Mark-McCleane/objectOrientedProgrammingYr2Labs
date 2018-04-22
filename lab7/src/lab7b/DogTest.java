package lab7b;
//Author 	: Mark McCleane
//Date 	: Novemer-2016
//Purpose 	: Tests our Dog class.

public class DogTest
{ // begin DogTest

	public static void main(String args[]) 
	{ // being main method

		Dog myDog = new Dog("Sandy", "Brown", "Bulldog","Too much", 8 , "alot");
		Dog myOtherDog = new Dog("Fluffy", "White", "Labroador","Anything", 9, " when im asleep");
		// Create an instance of our Dog class

		System.out.println("My dog's name is " + myDog.name);
		System.out.println("My dog's colour is " + myDog.colour );
		System.out.println("My dog's breed is a " + myDog.breed );
		System.out.println("My dog eats " + myDog.eat);
		System.out.println("My dog sleeps " + myDog.sleep);
		System.out.println("My dog barks " + myDog.bark);
		System.out.println("________________________");
		System.out.println();
		System.out.println("________________________");

		
		
		System.out.println("My other dog's name is " + myOtherDog.name);
		System.out.println("My other dog's color is " + myOtherDog.colour);
		System.out.println("My other dog's breed is a " + myOtherDog.breed);
		
		System.out.println("My dog eats " + myOtherDog.eat);
		System.out.println("My dog sleeps " + myOtherDog.sleep);
		System.out.println("My dog barks " + myOtherDog.bark);
	} // end main
} // end class DogTest
