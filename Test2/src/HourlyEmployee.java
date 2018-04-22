// Author 			: Mark McCleane
// Date 			: Jan-2017
// Purpose 			: The Employee abstract class for CA2
public abstract class HourlyEmployee extends Employee
{
	public HourlyEmployee(String name, String address, String phone,float wage)
	{
		super(name,address,phone);
	}
	public abstract float calculateWages(float wage);
}