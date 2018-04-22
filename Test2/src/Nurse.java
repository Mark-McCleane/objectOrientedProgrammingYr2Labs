// Author 			: Mark McCleane
// Date 			: Jan-2017
// Purpose 			: The Employee abstract class for CA2
public class Nurse extends SalariedEmployee 
{
	private boolean type;
	public Nurse(String name, String address, String phone,float wage, boolean type)
	{
		super(name,address,phone, wage);
		
	}
	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "\nNurse\nName: " + name+ "\nAddress: " + address + "\nPhone: " + phone +"\nwage: " + calculateWage()
				+ "\nNurse Matron: " + isType();
	}
	
	
}