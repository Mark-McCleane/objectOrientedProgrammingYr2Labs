import java.util.Scanner;
//Name: Mark McCleane
//Date: 12September 2016
//Purpose: To practice java programming

public class lab3aq1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any Integer: ");
		int Integer = sc.nextInt();
		System.out.println("Enter any Float: ");
		float floatNum = sc.nextFloat();
		System.out.println("Enter any Long: ");
		long longNum = sc.nextLong();
		System.out.println("Enter any Double: ");
		Double doubleNum = sc.nextDouble();
		System.out.print("Enter any String: ");
		String text = sc.next();
		
		System.out.println(" --- INPUTS --- \n Integer : \t" + Integer + " \n Float: \t" + floatNum );
		System.out.println(" Long : \t" + longNum + "\n Double :\t" + doubleNum);
		System.out.println(" String : \t" + text);
		
		float intPlusFloat = Integer + floatNum;
		long intPlusLong = Integer + longNum;
		Double intPlusDouble = Integer + doubleNum;
		
		System.out.println("--- ADDITIONS ---");
		System.out.println(" Integer + Float\t :" + intPlusFloat);
		System.out.println(" Integer + Long\t\t :" + intPlusLong);
		System.out.println(" Integer + Double\t :" + intPlusDouble);
		System.out.println(" Integer + String\t :" + Integer + text);
		
		float FloatPlusLong = floatNum + longNum;
		Double FloatPlusDouble = floatNum + doubleNum;

		System.out.println(" Float + Long\t\t :" + FloatPlusLong);
		System.out.println(" Float + Double\t\t :" + FloatPlusDouble);
		System.out.println(" Float + String\t\t :" + floatNum + text);
		
		double longPlusDouble = longNum + doubleNum;
		
		System.out.println(" Long + Double\t\t :" + longPlusDouble);
		System.out.println(" Long + String\t\t :" + longNum + text);
		System.out.println(" Double + String\t :" + doubleNum + text);
		 
	}
	
}