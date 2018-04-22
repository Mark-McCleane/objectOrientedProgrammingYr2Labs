// Author 			: Mark McCleane
// Date 			: Jan-2017
// Purpose 			: The Employee abstract class for CA2
public abstract class SalariedEmployee extends Employee
{
	private float wage;	//since f is beside figure
	public SalariedEmployee(String name, String address, String phone,float wage)
	{
		super(name,address,phone);
		setWage(wage);
	}
	public float calculateWage() {
		return wage;
	}
	public void setWage(float wage) {
		this.wage = wage;
	}
}
