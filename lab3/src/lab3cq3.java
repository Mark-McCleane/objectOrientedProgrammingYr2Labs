//Name: Mark McCleane
//Date: 12September 2016
//Purpose: To build a java file
import java.util.*;

public class lab3cq3 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	ArrayList arrayList = new ArrayList();
	
	System.out.print("Enter word:");
	String word = sc.nextLine();
	
	char letter;
	int Ascii;
	char newLetter;
		
	System.out.println("Enter Menu Option : 1 or 2");
	int menu = sc.nextInt();
	
	switch(menu)
	{
		
		case 1:	
			for(int i = 0;i <= word.length()-1;i++)
			{
				letter = word.charAt(i);
				Ascii = (int) letter;
				Ascii++;
				newLetter = (char) Ascii;
				System.out.print(newLetter);
			}
			System.out.println();
			break;
		
		case 2:
			for(int i = 0;i <= word.length()-1 ;i++)
			{
				letter = word.charAt(i);
				Ascii = (int) letter;
				Ascii--;
				newLetter = (char) Ascii;
				System.out.print(newLetter);
			}
			System.out.println();
			break;
	
	
	}

}

}	