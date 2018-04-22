//	Name:		Mark McCleane
//	Student No:	C00191900
//	Date:		20/03/2017
//	Purpose:	To create  a  GUI  based  application
//				which will allow users  to  manage fleets of  boats.
public class Driver {

	public static void main(String[] args) {
		//create multiple fleet management companies
		Fleet Olympus = new Fleet();
		Olympus.setNameOfcompany("Olympus");							//setting names
		
		passengerBoat pass1 = new passengerBoat("Mark",10);
		passengerBoat[] passArray = {pass1};
		Olympus.addPassBoats(passArray);					//adding passenger boat to fleet
		
		freightBoat freight1 = new freightBoat("joe",9);
		freightBoat[] freightArray = {freight1};
		Olympus.addFreightBoats(freightArray);//adding freight boat to fleet
		
		
		/*Olympus.deleteBoat(pass1);		//delete a boat from a fleet
		System.out.println(Olympus);*/
		
		FleetManagement fm1 = new FleetManagement();
		fm1.setName("hello");
		Fleet[] fleetArray = {Olympus}; 
		fm1.addFleet(fleetArray);
		System.out.println(fm1.toString() );
		//fm1.deleteFleetManagementCompany("hello");	//delete a fleet from a fleetMngmtcompany*/
		
		
}

}