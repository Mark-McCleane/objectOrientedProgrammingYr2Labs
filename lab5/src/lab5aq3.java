//Name: Mark McCleane
//Date: 12September 2016
//Purpose: To build a java file

public class lab5aq3	//sumOfNumbers1To100
{
	int ans;
	int x;
	int i;
	
	public static void main(String[] args) {
	int x = 0;
	for(int i = 1; i <= 100; i++)
	{
		sum100(x,i);
	}

}
	
public static int sum100(int x, int i)
{
	int ans = x + i;
	return ans;
}

}