package SoccerTickets;
// Student Name 	: Mark McCleane
// Student Id Number: c00191900
// Date 			: October 2016
// Purpose 			: To practice Object Oriented Java

public class SoccerTickets
{
	public static void main (String args[])
	{
		System.out.println("Tickets Sold: " + Ticket.getNumberSold() );	
		Ticket ticket1 = new Ticket();
		Ticket ticket2 = new Ticket();

		System.out.println(ticket1.getInfo() + "\n"  + ticket2.getInfo() );
	}

}
