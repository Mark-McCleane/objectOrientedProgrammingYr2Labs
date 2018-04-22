//Name: Mark McCleane
//Date: 12September 2016
//Purpose: To build a java file
import java.util.*;

public class lab3cq1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter word:");
		String word = sc.next();
		String wordPart2 = sc.next();
		
		for(int i = word.length()-1 ; i >= 0; i--)
		{
			System.out.print(word.charAt(i));
		}
		System.out.print(" ");
		
		for(int i = word.length()-1 ; i >= 0; i--)
		{
			System.out.print(wordPart2.charAt(i));
			
			if (i == 0)
			{
				System.out.println();
			}
		}
	
	}
}