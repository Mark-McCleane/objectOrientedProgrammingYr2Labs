//	Name:		Mark McCleane
//	Student No:	C00191900
//	Date:		20/03/2017
//	Purpose:	To create  a  GUI  based  application
//				which will allow users  to  manage fleets of  boats.
//	Class Purpose: To create a boat super class

public class Boat
{
	private String name;	    //name of the boat
	private int numStaff;

	public Boat(String name, int numStaff) { 
		setName(name);
		setNumStaff(numStaff);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumStaff() {
		return numStaff;
	}

	public void setNumStaff(int numStaff) {
		this.numStaff = numStaff;
	}

	@Override
	public String toString() {
		return "Boat Name=" + name + ", number of Staff= " + numStaff;
	}
	
}
