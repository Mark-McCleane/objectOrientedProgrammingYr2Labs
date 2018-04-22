// Author 			: Mark McCleane
// Date 			: Jan-2017
// Purpose 			: The Driver class for CA2

public class Hospital
{
	public static void main(String args[])
	{
		Doctor empDocHoliday = new Doctor("Doc Holiday", "The Ossie", "04 44455555", 200000f, "Paediatrics");		
		Nurse empNora = new Nurse("Nora", "The Ward", "05 5551111", 25000f, false);
		Cleaner empDusty = new Cleaner("Dusty", "The Bin", "06 6666666", 10f, 45f, "Noonans");
		Receptionist empMoneyPenny = new Receptionist("Mary", "The Office", "07 7777777", 20f, 50f, "IV");

		Doctor[] doctors = new Doctor[2];
		doctors[0] = empDocHoliday;
		Nurse[] nurses = new Nurse[3];
		nurses[0] = empNora;
		Cleaner[] cleaners = new Cleaner[2];
		cleaners[0] = empDusty;
		
		Ward wardOne = new Ward(doctors, nurses, cleaners, empMoneyPenny);
		System.out.println(wardOne);

		System.out.println("\nDusty's wage is " + empDusty.calculateWages(41));
		System.out.println("\nMonney Wage is " + empMoneyPenny.calculateWages(39));
	
	}

}
