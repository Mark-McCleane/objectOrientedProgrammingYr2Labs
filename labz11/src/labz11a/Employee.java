package labz11a;

public class Employee extends Person 
{
	
	private double annSalary;
	
	public Employee(String name, double annSalary)
	{
		super(name);
		setSalaryPerAnnum(annSalary);
	}
	
	public double getAnnSalary() {
		return annSalary;
	}

	public void setSalaryPerAnnum(double annSalary) {
		this.annSalary = annSalary;
	}

	public String getDescription()
	{
		return "An employee with a salary of " + getAnnSalary() ;
	}
}
