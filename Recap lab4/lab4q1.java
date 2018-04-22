//Name: Mark McCleane
//Date: 12September 2016
//Purpose: To build a java file
import java.util.*;

public class lab4q1
{	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] myArray = new int[10];
		double myArrayAverage = 0;
		
		for(int i = 0; i < myArray.length ;i++)
		{
			System.out.print("Array[" + (i) + "] = ");
			myArray[i]=sc.nextInt();
			myArrayAverage = (myArrayAverage + myArray[i]);
		}
		myArrayAverage =  myArrayAverage / myArray.length;
		System.out.println(myArrayAverage );
		
		
}

}