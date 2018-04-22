package lab8a;

public class DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice newDice = new Dice();
		System.out.println("******************");
		newDice.roll();
		System.out.println("Number One: " + newDice.getFaceValue() );
		System.out.println("******************");
		PairOfDice newerDice = new PairOfDice();
		newerDice.rollDie();
		int[] facevalues = newerDice.getFaceValues();
		System.out.print("Number One: "+ facevalues[0] + " and Number Two: ");
		System.out.println(facevalues[1]);
		System.out.println("******************");
	}
		

	}