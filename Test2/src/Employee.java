// Author 			: Mark McCleane
// Date 			: Jan-2017
// Purpose 			: The Employee superclass for CA2

public class Employee{
	protected String name;
	protected String address;
	protected String phone;

	public Employee(String name, String address, String phone)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;	
	}

	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	public String getPhone()
	{
		return phone;
	}

	public String toString()
	{
		return("\nName : " + name + "\nAddress : " + address + "\nPhone : " + phone);
	}	
}