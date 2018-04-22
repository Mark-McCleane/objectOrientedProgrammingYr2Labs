// Author 			: Oisin Cawley
// Date 			: Jan-2017
// Purpose 			: An example exception handling with throw

import java.io.IOException;  

public class Throw_Demo 
{ 
	public static void main (String args[]) 
	{
		int[] myArray = new int[10]; 
		try {
			myArray[100] = 1;
		}
		catch(ArrayIndexOutOfBoundsException e) 
		{
			e = new ArrayIndexOutOfBoundsException("Please ensure your array index is within bounds.");
			throw(e); 
		}
	}
} 
