package ANimations;
import java.io.*;
/*
 * Author: Mark McCleane
 * Date:26/04/2017
 * Purpose:	build a text editor
 * 
 */

public class MouseDraw {

public static void main(String[] args) throws IOException	
{
	try (
			// Create an output stream to the file
			FileOutputStream output = new FileOutputStream("text.dat");)
		{
			// Output values to the file
			System.out.println("Writing.");
			for (int i = 1; i <= 10; i++)
				output.write(i);
		}
	
	try (
			// Create an input stream for the file
			FileInputStream input = new FileInputStream("text.dat");)
		{
			// Read values from the file
			System.out.println("Reading.");
			int value;
			while ((value = input.read()) != -1)
				System.out.print(value + " ");
		}
}
}