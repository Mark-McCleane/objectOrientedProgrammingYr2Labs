// Author 			: Oisin Cawley
// Date 			: Jan-2017
// Purpose 			: An example user-defined exception

public class InvalidAgeException extends Exception
{  
	InvalidAgeException()
	{
		super();  
	}  
	InvalidAgeException(String s)
	{
		super(s);  
	}  
} 