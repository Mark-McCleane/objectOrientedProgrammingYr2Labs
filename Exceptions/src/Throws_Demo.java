// Author 			: Oisin Cawley
// Date 			: Jan-2017
// Purpose 			: An example exception handling with throws

import java.io.IOException;  

public class Throws_Demo 
{ 
	public static void main(String args[])
	{
		int num1 = 0;
		try {
			System.out.println("First statement of try block");
			System.out.println(divide(num1));
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException handled in main(): " + e);
		}
		catch(IOException e) {
			System.out.println("IOException: " + e);
		}
		System.out.println("Finished main.");
	}
	public static int divide (int num1) throws IOException
	{
		int num2 = System.in.read();
		int ans = num2 / num1;
		System.out.println("Do I get here?");
		return ans;
	}
}