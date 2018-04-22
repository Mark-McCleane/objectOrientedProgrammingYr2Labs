//	Name:		Mark McCleane
//	Student No:	C00191900
//	Date:		20/03/2017
//	Purpose:	To create  a  GUI  based  application
//				which will allow users  to  manage fleets of  boats.

public class Fleet
{
	private int numBoats;
	private Boat[] myBoats;
	
	public Fleet(Boat[] myBoats)
	{
		setNumBoats(numBoats);
		setMyBoats(myBoats);
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
	
	public void deleteBoat(Boat boatToDelete){
		for( int i = 0; i <= getMyBoats().length-1 ;i++){
			if(boatToDelete == getMyBoats()[i]){
				getMyBoats()[i] = null;
			}
		}
	}
	
}