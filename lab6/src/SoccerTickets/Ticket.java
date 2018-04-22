package SoccerTickets;
// Student Name 	: Mark McCleane
// Student Id Number: c00191900
// Date 			: Octiber 2016
// Purpose 			: To practice Object Oriented Java
public class Ticket
{
	private static int numTicketsSold = 0; // shared
	private int ticketNum; // one per object
	
	public Ticket()
	{
		numTicketsSold++;
		ticketNum = numTicketsSold;
	}
	
	public static int getNumberSold() 
	{ 
		return numTicketsSold; 
	}
	
	public int getTicketNumber() 
	{ 
		return ticketNum; 
	}
	
	public String getInfo()
	{
		return "Info: Ticket # " + ticketNum + "; " + numTicketsSold + " ticket(s) sold.";
	}
}
