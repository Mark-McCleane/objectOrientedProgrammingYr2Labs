package lab7d;

public class HotelRoomTest {

	public static void main(String[] args) 
	{

		HotelRoom roomA = new HotelRoom();
		
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		roomA.setRoomOccupation(0);
		roomA.setRate(100); 
		

		
		if(roomA.getRoomOccupation() == 0)
		{
			roomA.setOccupied(false);
		}
		System.out.println("Guest 1: " + roomA.getRoomNumber() + ", " + roomA.getRoomType() + " " + roomA.getRoomOccupation()  );
		System.out.println("Rate is " + roomA.getRoomRate() );		
		
		HotelRoom roomB = new HotelRoom();
				
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		roomB.setRoomOccupation(1);
		roomB.setRate(80);

		System.out.println("\nGuest 2: " + roomB.getRoomNumber() +", " + roomB.getRoomType()  + " " + roomB.getRoomOccupation() ); 
		System.out.println("Rate is " + roomB.getRoomRate() );
		
		HotelRoom roomC = new HotelRoom(202, "Single",0, 90,true);
		System.out.println("\nGuest 3: " + roomC.getRoomNumber() +", " + roomC.getRoomType()  + " " + roomC.getRoomOccupation() ); 
		System.out.println("Rate is " + roomC.getRoomRate() );
		
		System.out.println("Room before change occupation:" + roomB.isOccupied() );
		roomB.setRoomOccupation(0);
		
		if(roomB.getRoomOccupation() == 0)
		{
			roomB.setOccupied(false);
		}
		
		System.out.println("Room after change occupation:" + roomB.isOccupied() );
	}

}
