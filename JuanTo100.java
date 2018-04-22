//Name: Mark McCleane
//Date: September 2016
//Purpose: To break my brain 

import java.util.ArrayList;

public class JuanTo100 {
	
	public static void main(String[] args) {

	ArrayList arrayListNum = new ArrayList();

	for(int i = 1; i <= 10;i++)
	{
		arrayListNum.add(i);		// Declaring people in the circle
	}
		int i = 0;					//declaring i as 0 to represent the start of a circle
		
		for(int j = 1; j <= 100;j++)
		{
			System.out.println("Person " + arrayListNum.get(i) + " says " + j);	

			if(j % 7 == 0 )
			{
				i-= 2;				// divisble by 7 = switches
			}
			else if(j % 11 == 0)
			{
				i++;				//divisible by 11  = skip 1 number
			}
			else
			{
				i++;
			}
			
			if(i >= 9)
			{
				i = 0;				//resetting to 1
			}
			
			if(i <= -1)
			{
				i=9;				//incase it goes under 0
			}
			
			
		}
}

}