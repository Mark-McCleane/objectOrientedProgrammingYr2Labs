package lab10c;

import java.util.Arrays;

public class RockBand 
{
	String bandName;
	String recordCompany;
	Musician members[];	
	
	RockBand(String bandName, String label, Musician[] members)
	{
		setRecordCompany(recordCompany);
		setBandName(bandName);
		setMembers(members);
	}

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public String getRecordCompany() {
		return recordCompany;
	}

	public void setRecordCompany(String recordCompany) {
		this.recordCompany = recordCompany;
	}

	public Musician[] getMembers() {
		return members;
	}

	public void setMembers(Musician[] members) {
		this.members = members;
	}
	/*public void newRecordCompany(String newRecComp)
	{
		this.newRecComp = newRecComp;
	}*/
	public boolean changeRecordCompany(String newRecComp) {
		if(getRecordCompany() == newRecComp )
		{
			return false;
		}
		else 
		{
			return true;
		}
	}

	public void displayBandDetails()
	{
		System.out.println(("RockBand:\n" + "Record Company= "
		+ recordCompany + ", "+ Arrays.toString(members) + ", Band Name: "
		+ getBandName() + ", Record Company: " + getRecordCompany()
		+ ", Members: " + Arrays.toString(getMembers() ) ) );
	}
	
}
