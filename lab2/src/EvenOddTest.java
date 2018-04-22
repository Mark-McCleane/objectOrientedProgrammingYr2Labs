  import java.util.Scanner;
//Name: Mark McCleane
//Date: September 2016
//Purpose: To build a java file

public class EvenOddTest
{	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int num = sc.nextInt();
	
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