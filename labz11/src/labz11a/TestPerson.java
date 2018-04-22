package labz11a;

public class TestPerson
{

	public static void main(String[] args) 
	{
		Person[] personArray = new Person[10];
		personArray[0] = new Employee("Mark", 100000);
		personArray[1] = new Employee("Mark", 50000);
		personArray[2] = new Employee("Mark", 80000);
		personArray[3] = new Employee("Mark", 60000);
		personArray[4] = new Employee("Mark", 90000);
		personArray[5] = new Student("Mark", "Maths");
		personArray[6] = new Student("Mark", "English");
		personArray[7] = new Student("Mark", "Culture and Heritage");
		personArray[8] = new Student("Mark", "Computer Studies");
		personArray[9] = new Student("Mark", "Software Development");
		
		for(int i = 0; i < personArray.length;i++){
			System.out.println("Person = "  + personArray[i].getName() + "\n" +  personArray[i].getDescription() + "\n");
		}
	}
}