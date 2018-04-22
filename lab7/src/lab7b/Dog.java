package lab7b;
//Author 	: Mark McCleane
//Date 	: November-2016
//Purpose 	: Implements a Dog class.

public class Dog
{ // begin Dog
	public String name;
	public String colour;
	public String breed;
	public String eat;
	public int sleep;
	public String bark;// name is accessible to all methods in this class
	
	public Dog(String dogsName, String dogsColour, String dogsType, String dogEats, int numHours ,String dogBark)			// constructor method #1
	{
		name = dogsName;		
		colour = dogsColour;
		breed = dogsType;
		eat = dogEats;
		sleep= numHours;
		bark = dogBark;
		
	}
		
} // end class Dog