//Name: MArk MCCleane
//Student No: C00191900 
//Date: 16/11/2016
//Purpose:To manage the employees details of growing number of employees in the company
import java.util.Scanner; 
public class myHRTest 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("*************************************");
		System.out.println("1.\t Create a new employee record");
		System.out.println("2.\t List all employees");
		System.out.println("3.\t List all non-managers");			//menu options
		System.out.println("4.\t List all managers");
		System.out.println("5.\t List all company cars");
		System.out.println("\n*************************************");
		Employees test = new Employees();
		Car compCar = new Car();
		
		//test.setCountEmployees(10);   	//setting count to 10 in array 
		test.setManagersCount(2);
		test.setNonManagementEmployeesCount(8);
		compCar.setCarOwnerName("Larry"); 
		System.out.print("Enter menu option:");
		int menu = sc.nextInt();
		switch(menu)
		{
		case 1:				//Create a new employee
			System.out.println(test.toString() );
			Employees test1 = new Employees();
			System.out.println(test1.toString() );
			Address test11 = new Address();
			System.out.println( test11.toString() ) ;
			Car newCar = new Car();
			System.out.println( newCar.toString() ) ;
			break;
		case 2:
			System.out.println("Total Number of Employees: " + test.getCountEmployees() ); //totla count of employees array
			break;
		case 3:
			System.out.println("Number of Staff: " + test.getNonManagementEmployeesCount() ); 		//non managers array
			break;
		case 4:
			System.out.println("Number of managers: " + test.managersCount); 	//printing managers array
			break;
		case 5:
			System.out.println(compCar.toString());			
		
		
			
		}
	}

}
