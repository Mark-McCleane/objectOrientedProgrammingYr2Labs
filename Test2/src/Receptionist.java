// Author 			: Mark McCleane
// Date 			: Jan-2017
// Purpose 			: The Cleaner class for CA2
public class Receptionist extends HourlyEmployee
{
	private float numHoursOfWork;
	private String grade;
	
	public Receptionist(String name, String address, String phone,float wage,float numHoursWork,String grade)
	{
		super(name,address, phone,wage);
		setNumHoursOfWork(numHoursWork);
		setTypingGrade(grade);
	}
	
	public float getNumHoursOfWork() 
	{
		return numHoursOfWork;
	}

	public void setNumHoursOfWork(float numHoursOfWork) 
	{
		this.numHoursOfWork = numHoursOfWork;
	}
	public String getTypingGrade() 
	{
		return grade;
	}

	public void setTypingGrade(String grade) 
	{
		this.grade = grade;
	}

	public float calculateWages(float wage)
	{
		float weeklyWage = wage * numHoursOfWork;
		return weeklyWage;
	}

	@Override
	public String toString() {
		float wage = 0;
		return "Receptionist HoursOfWork= " + numHoursOfWork + ", grade= " + getTypingGrade() + ", calculateWages= "
				+ calculateWages(wage) + ", getName()= " + getName() + ", getAddress()= " + getAddress() + ", getPhone()="
				+ getPhone();
	}
	
}
