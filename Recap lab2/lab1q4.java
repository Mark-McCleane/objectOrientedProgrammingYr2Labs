  import java.io.*;
//Name: Mark McCleane
//Date: September 2016
//Purpose: To build a java file

public class lab1q4
{	
	public static void main(String args[]) throws IOException
	{
	
	System.out.println("Enter number");
	int num = EasyIn.getInt();
	
	for(int i = num;i > 0;i--)
	{
		if(i > 1)
		{
			System.out.print(i + ", ");
		}
		else 
		System.out.println(i);
	}
	
	}
}