import java.util.Arrays;

//	Name:		Mark McCleane
//	Student No:	C00191900
//	Date:		20/03/2017
//	Purpose:	To create  a  GUI  based  application
//				which will allow users  to  manage fleets of  boats.

public class Fleet
{
	private int numBoats;
	private Boat[] myBoats;
	public static int fleetIDNumber=0;
	//private String nameOfcompany;
	private passengerBoat[] boat1;
	private freightBoat[] boat2;

	public Fleet()
	{
		setNumBoats(numBoats);
		setMyBoats(myBoats);
	//	setNameOfcompany(nameOfcompany);
		fleetIDNumber++;
	}
	public int getNumBoats() {
		return numBoats;
	}
	public void setNumBoats(int numBoats) {
		this.numBoats = numBoats;
	}
	public Boat[] getMyBoats() {	//RETURN BOATS
		return myBoats;
	}
	public void setMyBoats(Boat[] myBoats) {	//set boats as array
		this.myBoats = myBoats;
	}
	public static int getFleetIDNumber() {
		return fleetIDNumber;
	}
	public static void setFleetIDNumber(int fleetIDNumber) {
		Fleet.fleetIDNumber = fleetIDNumber;
	}
	public void deleteBoat(Boat boatToDelete){
		for(int i = 0; i <= getMyBoats().length-1 ;i++){
			if(boatToDelete == getMyBoats()[i]){
				getMyBoats()[i] = null;
			}
		}
	}
	/*public String getNameOfCompany() {
		return nameOfcompany;
	}
	public void setNameOfcompany(String nameOfcompany) {
		this.nameOfcompany = nameOfcompany;
	}*/
	public void addPassBoats(passengerBoat[] boat1){
		this.boat1 = boat1;
	}
	public void addFreightBoats(freightBoat[] boat2){
		this.boat2= boat2;
	}
	public Boat[] viewAllPassBoats(){
		return boat1;
	}
	public Boat[] viewAllFreightBoats(){
		return boat2;
	}
	@Override
	public String toString() {
		return "Fleet [numBoats=" + numBoats + ", myBoats=" + Arrays.toString(myBoats) + ", nameOfcompany="
				+ ", boat1=" + Arrays.toString(boat1) + ", boat2=" + Arrays.toString(boat2) + "]";
	}
	
}