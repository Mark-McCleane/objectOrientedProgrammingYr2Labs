	package lab10a;
	//Author 			: Mark MCCleane
	//Date 			: Jan-2016
	//Purpose 			: A driver class for our Car inheritance class

	public class RoadTest {
	
		public static void main(String args[])
		{
			
			Car car1 = new Car();
			Car car2 = new Car("People Carrier",4,7);
			HGV truck1 = new HGV(3200,18,3);		//setting all as a constructor while declaring HGV
			HGV truck2 = new HGV();
			
			car1.setWheels(4);
			car1.setPass(6);
			car1.setType("Saloon");
			
			truck2.setCargo(1200);
			truck2.setPass(3);			//individualy setting  truck2
			truck2.setWheels(6);

			System.out.println("Car1: ");
			System.out.print("Wheels: " + car1.getWheels() );
			System.out.print(" Passengers: " + car1.getPass() );
			System.out.println(" Type: " + car1.getType() );
			
			System.out.println("Car2: ");
			System.out.print("Wheels: " + car2.getWheels() );
			System.out.print(" Passengers: " + car2.getPass() );
			System.out.println(" Type: " + car2.getType() );
			
			System.out.println("Truck 1:");
			System.out.print("Wheels: " + truck1.getWheels() );
			System.out.print(" Passengers: " + truck1.getPass() );
			System.out.println(" Cargo: " + truck1.getCargo() );
			
			System.out.println("Truck 2:");
			System.out.print("Wheels: " + truck2.getWheels() );
			System.out.print(" Passengers: " + truck2.getPass() );
			System.out.println(" Cargo: " + truck2.getCargo() );
		}
	}
