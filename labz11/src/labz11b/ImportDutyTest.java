package labz11b;

public class ImportDutyTest {

	public static void main(String[] args) {
		Car myRoadVehicle1 = new Car("Lambo", 4, 2);
		HGV myRoadVehicle2 = new HGV(10,8,6);
		System.out.println("_________________\n");
		myRoadVehicle1.setCarValue(1000000);
		System.out.print("Car= ");
		myRoadVehicle1.calculateDuty();
		System.out.println("\n_________________\n");
		myRoadVehicle2.setCarValue(50000);
		System.out.print("HGV = ");
		myRoadVehicle2.calculateDuty() ;
		System.out.println("\n_________________\n");
}

}
