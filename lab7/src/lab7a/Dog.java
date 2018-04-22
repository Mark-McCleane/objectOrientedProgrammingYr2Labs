package lab7a;
//Author 	: Mark McCleane
//Date 	: November-2016
//Purpose 	: Implements a Dog class.

public class Dog
{ // begin Dog
	public String name;
	public String colour;
	public String breed;// name is accessible to all methods in this class
	
	public Dog(String dogsName, String dogsColour, String dogsType)			// constructor method #1
	{
		name = dogsName;		
		colour = dogsColour;
		breed = dogsType;
	}
		
} // end class Dog