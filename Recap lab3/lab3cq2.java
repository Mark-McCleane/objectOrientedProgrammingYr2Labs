//Name: Mark McCleane
//Date: 12September 2016
//Purpose: To build a java file
import java.util.*;

public class lab3cq2 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	ArrayList arrayList = new ArrayList();
		
	System.out.print("Enter word:");
	String word = sc.nextLine();
	char letter;
	int Ascii;
	char newLetter;
	
	for(int i = 0;i <= word.length()-1;i++)
	{
		letter = word.charAt(i);
		Ascii = (int) letter;
	//	System.out.print(Ascii + 1);
		Ascii++;
		newLetter = (char) Ascii;
		System.out.print(newLetter);
	}
	System.out.println();
	
	
}
		
}
	
	