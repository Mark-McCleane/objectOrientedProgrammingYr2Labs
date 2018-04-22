package lab8a;
// Student Name 	: Mark McCleane
// Student Id Number: 
// Date 			: Nov-2016
// Purpose 			: Test Employee class with static class variable,
// 					  static class method, and dynamic memory.

public class EmployeeTest  
{      
	public static void main( String args[] ) 
	{
		System.out.println( "Employees before instantiation: " + Employee.getCount() );
		Employee e1 = new Employee( "Susan", "Baker" );
		Employee e2 = new Employee( "Bobby", "Jones" );
		Employee e3 = new Employee( "Johnny", "Murphy");
		
		System.out.println( "Employees after instantiation: " + Employee.getCount() );
		System.out.println( "Employee 1: " + e1.getFirstName() + " " + e1.getLastName());
		System.out.println( "Employee 2: " + e2.getFirstName() + " " + e2.getLastName());
		System.out.println( "Employee 3: " + e3.getFirstName() + " " + e3.getLastName());
		
		e1 = null;
		e2 = null;
		e3 = null;
		
		System.gc();  // explicit call to garbage collector
		while (Employee.getCount() > 0)
		{
			
		}
		System.out.println( "Employees after garbage collection: " + Employee.getCount() );
	}
}
