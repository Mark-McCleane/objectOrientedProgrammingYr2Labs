//Name: Mark McCleane
//Date: 12September 2016
//Purpose: To build a java file


public class lab5aq2	//powersOfTwo
{	
	public static void main(String[] args) {
	powerOfTwo();
	
	System.out.println("************** \n Answer check \n**************");
	for(int i = 2; i < 12; i++)
	{
		System.out.println(Math.pow(2,i) );
	}
}
public static void powerOfTwo()
{
	int x = 1;
	for(int i = 1; i <= 11;i++)
	{
		x = x * 2;
		if(i > 1){
			System.out.println("Power " + (i-1) + " = " + x);
		}
	}
}

}	