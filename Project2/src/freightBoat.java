//	Name:		Mark McCleane
//	Student No:	C00191900
//	Date:		20/03/2017
//	Purpose:	To create  a  GUI  based  application
//				which will allow users  to  manage fleets of  boats.
//	Class Purpose: To extend from the boat super class

public class freightBoat extends Boat
{
	private int containerCapacity;	    //max amount containers

	public freightBoat(String name,int numStaff){ 
		super(name,numStaff);
		setContainerCapacity(containerCapacity);
	}

	public int getContainerCapacity() {
		return containerCapacity;
	}

	public void setContainerCapacity(int containerCapacity) {
		this.containerCapacity = containerCapacity;
	}

	@Override
	public String toString() {
		return "freightBoat containerCapacity=" + containerCapacity;
	}

}