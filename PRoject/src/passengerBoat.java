//	Name:		Mark McCleane
//	Student No:	C00191900
//	Date:		20/03/2017
//	Purpose:	To create  a  GUI  based  application
//				which will allow users  to  manage fleets of  boats.
//	Class Purpose: To extend from the boat super class

public class passengerBoat extends Boat
{
	private int passCapacity;	    //max amount of passengers
	private boolean carAllowence; 	//	true if allowed and false if not

	public passengerBoat(String name,int numStaff,int passCapacity, boolean carAllowance) { 
		super(name,numStaff);
		setPassCapacity(passCapacity);
		setCarAllowence(carAllowence);
	}
		
	public int getPassCapacity() {
		return passCapacity;
	}

	public void setPassCapacity(int passCapacity) {
		this.passCapacity = passCapacity;
	}

	public boolean isCarAllowence() {
		return carAllowence;
	}

	public void setCarAllowence(boolean carAllowence) {
		this.carAllowence = carAllowence;
	}

	@Override
	public String toString() {
		return "passengerBoat passCapacity=" + passCapacity + ", carAllowence=" + carAllowence;
	}

}