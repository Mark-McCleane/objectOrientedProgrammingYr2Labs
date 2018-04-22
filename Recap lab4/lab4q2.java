//Name: Mark McCleane
//Date: 12September 2016
//Purpose: To build a java file
import java.util.*;

public class lab4q2
{	
	public static void main(String[] args) {
		
		String[] firstName = new String[10];
		String[] lastName = new String[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int numRequested = sc.nextInt();
		
		for (int i = 0; i <= 9;i++)
		{
			System.out.println("Enter First Name for position " + i + " :");
			firstName[i] = sc.next();
			System.out.println("Enter Second Name for position " + i + " :");
			lastName[i] = sc.next();
		}
		
		for(int j = 0; j <= 9; j++)
		{
			if(numRequested == j)
			{
				System.out.println(firstName[j] + " " + lastName[j]);
			}
		}
		
}

}	