  package lab8a;
// Student Name 	:MArk MCCleane
// Student Id Number: 
// Date 			: Nov-2016
// Purpose 			: Implements an Employee class

public class Employee 
{ // begin class Employee
	private String firstName;
	private String lastName;
	private static int count; 
	private static int staffNumber =1; // # of objects instantiated
	private int employeeNumber;
	
	public Employee( String fName, String lName )
	{
		firstName = fName;
		lastName = lName;
		++count;  // increment static count of employees
		setEmployeeNumber(staffNumber);
		staffNumber++;
	}

	public void finalize()
	{
		--count;  // decrement static count of employees
	}
	
	public String getFirstName() 
	{ 
		return firstName; 
	}
	
	public String getLastName()
	{ 
		return lastName; 
	}
	
	public static int getCount() 
	{ 
		return count; 
	} 
	
	public int getStaffNumber()
	{
		return staffNumber; 
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	
} // end class Employee