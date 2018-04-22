package practiceTest;

public class Farmer {

	public static void main(String[] args) {
		Machine tractor1 = new Tractor("Tractor1");
		Machine jeep1 = new Jeep("Jeep1");
		
		Animal cow1 = new Cow("Mr Moo");
		Animal sheep = new Sheep("Baaabara");
		
		Farm myFarm1 = new Farm();
		myFarm1.myAnimal[0] = cow1;
		myFarm1.myAnimal[1] = sheep;
		myFarm1.myMachine[0] = tractor1;
		myFarm1.myMachine[1] = jeep1;
		System.out.println(myFarm1);
	}

}
