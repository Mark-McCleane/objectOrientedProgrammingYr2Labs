  import java.io.*;
//Name: Mark McCleane
//Date: September 2016
//Purpose: To build a java file

public class EvenOddTest
{	
	public static void main(String args[])
	{
	
	System.out.println("Enter number");
	int num = EasyIn.getInt();
	
	if(num % 2 == 0)
	{
		System.out.println("Even");
	}
	else 
	{
		System.out.println("Odd");
	
	}
	
	}
}