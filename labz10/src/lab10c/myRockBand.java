package lab10c;
import java.util.Scanner;
import java.util.Arrays;

public class myRockBand 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		person myPerson = new person("Mark");
		
		Musician myMusician = new Musician("Mark","Guitar");
		Musician[] myBandMembers = {myMusician};
		
		System.out.println("Enter Record Company Name:");
		String RecordCompanyInput = sc.nextLine();
		
		RockBand TheBeatles = new RockBand("Band1","label1", myBandMembers);
		TheBeatles.setRecordCompany(RecordCompanyInput);
		
		System.out.println("**************BEFORE CHANGE BAND**********");
		TheBeatles.displayBandDetails();
		
		System.out.println("**************AFTER CHANGE BAND**********");
		String newRecordCompany = sc.nextLine();
		
		if(TheBeatles.changeRecordCompany(newRecordCompany) == false )
		{
			System.out.println("Record company is the same as previous record company");
		}
		else
		{
			TheBeatles.setRecordCompany(newRecordCompany);
		}
	
		TheBeatles.displayBandDetails();		//redisplayed to show change in record company
	}

}
