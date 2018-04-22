package lab10a;
//Author 			: Mark MCCleane
//Date 			: Jan-2016
//Purpose 			: A driver class for our Car inheritance class

public class CarTest2
{
	public static void main(String args[])
	{
		
		Car car1 = new Car();
		Car car2 = new Car("People Carrier",4,7);
		
		car1.setWheels(4);
		car1.setPass(6);
		car1.setType("Saloon");

		System.out.println("Car1: ");
		System.out.print("Wheels: " + car1.getWheels() );
		System.out.print(" Passengers: " + car1.getPass() );
		System.out.println(" Type: " + car1.getType() );
		
		System.out.println("Car2: ");
		System.out.print("Wheels: " + car2.getWheels() );
		System.out.print(" Passengers: " + car2.getPass() );
		System.out.println(" Type: " + car2.getType() );
	}
}
