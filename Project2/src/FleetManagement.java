import java.util.Arrays;

//	Name:		Mark McCleane
//	Student No:	C00191900
//	Date:		20/03/2017
//	Purpose:	To create  a  GUI  based  application
//				which will allow users  to  manage fleets of  boats.

public class FleetManagement extends Fleet {
	private Fleet numberOfFleets ;
	private Fleet[] fleet = new Fleet[5];
	private String name;

	public FleetManagement(){
		addFleet(fleet);
		setName(name);
	}

	public Fleet[] getFleet() {
		return fleet;
	}

	public void addFleet(Fleet[] fleet) {
		this.fleet = fleet;
	}

	public Fleet getNumberOfFleets() {
		return numberOfFleets;
	}

	public void setNumberOfFleets(Fleet numberOfFleets) {
		this.numberOfFleets = numberOfFleets;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void deleteFleetManagementCompany(String fleetCompanyToDelete){
		for(int i = 0;i < fleet.length;i++){
			if(getName() == fleetCompanyToDelete){
				fleet[i] = null;
			}
		}
	}
	@Override
	public String toString() {
		return "FleetManagement:\nFleets:" + Arrays.toString(getFleet()) + "\nNumberOfFleets:"
				+ getNumberOfFleets() + "\n Number Of Boats:" + getNumBoats()
				+ "\n Boats:" + Arrays.toString(getMyBoats()) + "\n getNameOfCompany()=" + getName()
				+ "\n viewAllPassBoats()=" + Arrays.toString(viewAllPassBoats()) + "\nviewAllFreightBoats()="
				+ Arrays.toString(viewAllFreightBoats()) + "]";
	}	
}