// Author 			: Oisin Cawley
// Date 			: Jan-2017
// Purpose 			: An example try/catch exception

public class Exception_Demo 
{ 
	public static void main(String args[]) 
	{
		try 
		{
			int num[] = {1, 2, 3, 4};
			System.out.println(num[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Exception thrown: " + e);
		}
		System.out.println("Continuing here...");
	}
}


