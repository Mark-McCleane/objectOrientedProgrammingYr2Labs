package lab8a;
import java.util.Random;
/*Student: MArk McCleane
 * No: C00191900
 * Purpose: To Crete a Dice class
 */
public class Dice
{
	public int roll;

	public Dice()
	{
		setRoll(0);
	}
	
	public Dice(int roll)
	{
		setRoll(roll);
	}
	
	public void setRoll(int r)
	{
		roll = r;
	}
	public void roll()
	{
		Random rand = new Random();
		roll = rand.nextInt( (6 - 1) + 1) + 1 ;		
	}
	public int getFaceValue()
	{
		return roll;
	}
	
	public String toString()
	{
		return "Dice rolls " + getFaceValue();
	}
}