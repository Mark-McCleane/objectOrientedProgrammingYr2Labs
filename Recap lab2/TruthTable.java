//Name: Mark McCleane
//Date: 12September 2016
//Purpose: To build a java file

public class TruthTable {
	
	public static void main(String[] args) {

	boolean A = false;
	boolean B = false;
	
	System.out.println("________________________________________________");
	System.out.println();
	System.out.println("  A\tB\tA&&B\tA||B\t!A\t!B\t");
	System.out.println("________________________________________________");


	System.out.println( A + "\t" + B + "\t" + (A&&B) + "\t" + (A||B) + "\t" + !A + "\t"  + !B + "\t");
	B = true;
	System.out.println( A + "\t" + B + "\t" + (A&&B) + "\t" + (A||B) + "\t" + !A + "\t"  + !B + "\t");
	A = true;
	B = false;
	System.out.println( A + "\t" + B + "\t" + (A&&B) + "\t" + (A||B) + "\t" + !A + "\t"  + !B + "\t");
	B = true;
	System.out.println( A + "\t" + B + "\t" + (A&&B) + "\t" + (A||B) + "\t" + !A + "\t"  + !B + "\t");

	System.out.println();
	System.out.println("________________________________________________");
	
	}
}