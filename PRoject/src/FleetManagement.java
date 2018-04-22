import java.util.Arrays;

//	Name:		Mark McCleane
//	Student No:	C00191900
//	Date:		20/03/2017
//	Purpose:	To create  a  GUI  based  application
//				which will allow users  to  manage fleets of  boats.

public class FleetManagement extends Fleet {

	private Fleet numberOfFleets ;
	private Boat[] numBoats = new Boat[10];
	private static Boat[] myBoats = new Boat[10];
	
	public FleetManagement(Fleet numberOfFleets, Boat[] myBoats){
		super(myBoats);
		setNumberOfFleets(numberOfFleets);
		
	}

	public Fleet getNumberOfFleets() {
		return numberOfFleets;
	}

	public void setNumberOfFleets(Fleet numberOfFleets) {
		this.numberOfFleets = numberOfFleets;
	}

	@Override
	public String toString() {
		return "FleetManagement [numberOfFleets=" + numberOfFleets + ", numBoats=" + Arrays.toString(numBoats) + "]";
	}
}