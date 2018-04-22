import java.util.Scanner;
//Name: Mark McCleane
//Date: September 2016
//Purpose: To build a java file
public class lab1q4
{	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int num = sc.nextInt();
	
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