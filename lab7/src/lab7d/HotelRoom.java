package lab7d;

public class HotelRoom 
{
	private int roomNumber;
	private String roomType;
	private int Occupation;		// 0 = vacant, 1 = Occupied
	private double rate;
	private boolean OccupationStatus;

	public HotelRoom()
	{
		setRoomNumber(0);
		setRoomType("Single");
		setRoomOccupation(0);
		setRate(0);
		setOccupied(true);
	}
	public HotelRoom(int rNum, String rType,int Occ, double r, boolean isOcc)
	{
		setRoomNumber(rNum);
		setRoomType(rType);
		setRoomOccupation(Occ);
		setRate(r);
		setOccupied(isOcc);
	}
	public void setRoomNumber(int rNum)
	{
		roomNumber = rNum;
	}
	public void setRoomType(String rType)
	{
		roomType = rType;
	}
	
	public void setRoomOccupation(int Occ)
	{
		Occupation = Occ;
	}
	public void setRate(double r)
	{
		rate = r;
	}
	public void setOccupied(boolean isOcc)
	{
		OccupationStatus = isOcc;
	}
	public int getRoomNumber()
	{
		return roomNumber;
	}
	public String getRoomType()
	{
		return roomType;
	}
	public int getRoomOccupation()
	{
		return Occupation;
	}
	public double getRoomRate()
	{
		return rate;
	}
	
	public boolean isOccupied()
	{
		return OccupationStatus;
	}
	
}
