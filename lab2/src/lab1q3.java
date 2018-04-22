import java.util.Scanner;
//Name: Mark McCleane
//Date: 12September 2016
//Purpose: To build a java file of a circle

public class lab1q3 {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double circumference = 0;
		double area = 0;
		double pie = 3.14;
		
		System.out.println("Enter radius of circle" );
		double radius = sc.nextDouble();
		
		circumference = (2 * pie) * radius ;// formuala for circumference of a circle is 2[pie]R
		area = pie * (radius * radius); // formula for area of a circle
		
		System.out.println("Area of a circle is; " + area + " and the circumference of a circle is: " + circumference);
	}
}