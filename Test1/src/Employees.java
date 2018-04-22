//Name: MArk MCCleane
//Student No: C00191900 
//Date: 16/11/2016
//Purpose:To manage the employees details of growing number of employees in the company
public class Employees 
{
	private int numEmployees;
	public int[] countEmployees;
	public int nonManagementEmployeesCount;
	public int managersCount;
	public int carCount;
	public static int employeeNumber = 1000;
	public String employeeType;
	
	public Employees()
	{
		++employeeNumber;
	//	setCountEmployees();
		setNonManagementEmployeesCount(0);
		setManagersCount(0);
		setCarCount(0);
		setEmployeeType("UnAssigned");
	}
	/*private void finalize()
	{
		--employeeNumber;  // decrement static count of employees
	}*/

	public void setCountEmployees(int[] countEmployees) {
		this.countEmployees= countEmployees;
	}
	
	public int getCountEmployees() {
		return countEmployees[1];
	}

	public int getNonManagementEmployeesCount() {
		return nonManagementEmployeesCount;
	}

	public void setNonManagementEmployeesCount(int nonManagementEmployeesCount) {
		this.nonManagementEmployeesCount = nonManagementEmployeesCount;
	}

	public int getManagersCount() {
		return managersCount;
	}

	public void setManagersCount(int managersCount) {
		this.managersCount = managersCount;
	}

	public int getCarCount() {
		return carCount;
	}
	
	public void setCarCount(int carCount) {
		this.carCount = carCount;
	}
	
	private int getEmployeeNumber(){
		return employeeNumber;
	}
	public void setEmployeeType(String employeeType)
	{
		if(employeeType != "Staff")
		{
			employeeType = "Manager";
		}
		else
		{
			employeeType = "Staff";
		}
	}
	public String getEmployeeType()
	{
		return employeeType;
	}
	public String toString()
	{
		return "Employee Number: " + getEmployeeNumber() + " Number of Employees: " + getCountEmployees() +" Employee Type: " + getEmployeeType() + "\nNumber of Managers: " + getManagersCount() +" number of non-mangers: " + getNonManagementEmployeesCount()
		+ " Car count " + getCarCount();
	}
	
	
	
}
