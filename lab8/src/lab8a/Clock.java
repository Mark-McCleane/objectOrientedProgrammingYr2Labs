package lab8a;
import java.util.Calendar;
/*Student: MArk McCleane
 * No: C00191900
 * Purpose: To test time class
 */

import lab8a.Time;

public class Clock {

	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		Time t = new Time (cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
		for(int i = t.getSecond(); i < 60;i++)
		{
			long secondTemp = System.currentTimeMillis();
			while(secondTemp < 1000)
			{
				
			}
			System.out.println("time = " + t);
			t.tick();
		}
		System.out.println("time = " + t);
		
	}

}