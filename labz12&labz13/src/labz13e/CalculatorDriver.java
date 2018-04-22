package labz13e;

import java.util.Scanner;

public class CalculatorDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number 1: ");
		double num1 = sc.nextDouble();
		System.out.print("Number 2:");
		double num2 = sc.nextDouble();
		
		System.out.println("--------Choose one--------------");
		System.out.println("Multiplication:\tType *");
		System.out.println("Addition:\tType +");
		System.out.println("Division:\tType /");
		System.out.println("Subtraction:\tType -");
		System.out.println("----------------------");
		
		String answerType = sc.next();
		
		Calculator myCalc = new Calculator(num1,num2);
		System.out.println(myCalc.getAnswer(answerType));

	}

}
