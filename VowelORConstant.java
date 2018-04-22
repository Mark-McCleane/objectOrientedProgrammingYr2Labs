//Name: Mark McCleane
//Date: September 2016
//Purpose: To build a java file
import java.util.*;

public class VowelORConstant {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter letter");
		
		do 
		{
		 char letter = EasyIn.getChar();
		 int x = sc.nextInt();
		
				
		switch(letter)
			{
				case 'a':
					System.out.println("Vowel");
					break;
					
				case 'e':
					System.out.println("Vowel");
					break;
				
				case 'i':
					System.out.println("Vowel");
					break;
				
				case 'o':
					System.out.println("Vowel");
					break;
				
				case 'u':
					System.out.println("Vowel");
					break;
					
				default:
					System.out.println("Constant");
			}
		} 
		while (x != -1);
		
	}
	
	
}