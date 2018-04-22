// Author 			: Oisin Cawley
// Date 			: Jan-2017
// Purpose 			: An example user-defined exception

public class CustomException_Demo
{  
	public static void validate(int age, int limit) throws InvalidAgeException
	{
		if(age < limit)
			throw new InvalidAgeException("Too young!");
		else
			System.out.println("You are welcome to vote.");  
	}  
     
	public static void main(String args[])
	{
		try{
			validate(13, 18);
		} 
		catch(InvalidAgeException m)
		{
			System.out.println("Exception occured: " + m);
		}
		
		System.out.println("...rest of the code...");  
	}  
}  

