//Name: Mark McCleane
//Date: September 2016
//Purpose: To break my brain 

import java.util.ArrayList;

public class OneTo100
{
	
	public static void main(String[] args) {

	ArrayList arrayListNum = new ArrayList();
	
	for(int i = 1; i <= 10;i++)
	{
		arrayListNum.add(i);		// Declaring people in the circle
	}
	for(int i = 1; i <= 10;i++)
	{
	

		for(int j = 1; j <= 100; j++)
		{
			System.out.println(arrayListNum.get(i) + ", " + arrayListNum.get(j) );
		}
	}
		
}
	
}