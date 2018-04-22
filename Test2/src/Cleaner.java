// Author 			: Mark McCleane
// Date 			: Jan-2017
// Purpose 			: The Cleaner class for CA2
public class Cleaner extends HourlyEmployee 
{
	private float numHoursOfWork;
	private String company;
	public Cleaner(String name, String address, String phone,float wage,float numHoursWork,String company)
	{
		super(name,address, phone,wage);
		setNumHoursOfWork(numHoursWork);
	}
	
	public float getNumHoursOfWork() 
	{
		return numHoursOfWork;
	}

	public void setNumHoursOfWork(float numHoursOfWork) 
	{
		this.numHoursOfWork = numHoursOfWork;
	}

	public String getCompany() 
	{
		return company;
	}

	public void setCompany(String company) 
	{
		this.company = company;
	}

	public float calculateWages(float wage)
	{
		float weeklyWage = wage * numHoursOfWork;
		return weeklyWage;
	}
}