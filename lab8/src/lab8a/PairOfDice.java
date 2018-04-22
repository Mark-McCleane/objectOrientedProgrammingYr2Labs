package lab8a;

public class PairOfDice
{
	public int roll1;
	public int roll2;
	Dice Dice1 = new Dice();
	Dice Dice2 = new Dice();
			
	public PairOfDice()
	{
		setRoll(0,0);
	}
	
	public PairOfDice(int roll1 , int roll2)
	{
		setRoll(roll1, roll2);
	}
	
	public void setRoll(int r1, int r2)
	{
		roll1 = r1 ;
		roll2 = r2 ;
	}
	public void rollDie()
	{
		Dice1.roll() ;
		Dice2.roll() ;
	}
	public int[] getFaceValues()
	{
		int[] tempArray ={Dice1.getFaceValue(),Dice2.getFaceValue() };
		return tempArray;
	}
	
	public String toString()
	{
		return "Dice rolls " + getFaceValues();
	}
}