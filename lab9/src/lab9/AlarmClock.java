package lab9;
//Student Name 		: Mark McCleane
//Student Id Number	: C00191900
//Date 				: Jan-2016
//Purpose 			: Defines our AlarmClock class which utilises the time class for aggregation

public class AlarmClock 
{ // begin class AlarmClock
	private Time alarmTime;		// time for the alarm
	private Time currentTime;		// the current time on the clock
	private boolean set = true;	// alarm is set (armed) by default

	public AlarmClock() 
	{ 
	   alarmTime = new Time( 0, 0 );
	   currentTime = new Time( 0, 0);
	}

	public AlarmClock(int h, int m)
	{
		alarmTime = new Time( 0, 0 );	
     currentTime = new Time( h, m );	
	}

	public void setAlarmTime(int h, int m)
	{	
	   alarmTime.setTime(h, m, 0);
	}

	public String showAlarmTime()
	{
		return ( alarmTime.getHour() + ":" + alarmTime.getMinute() );
	}

	public void setCurrentTime(int h, int m)
	{	
		currentTime.setTime(h, m, 0);
	}

	public void tick()
	{
		currentTime.tick();
	}   

	public String showCurrentTime()
	{
		return ( currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
	}

	public void enableAlarm()
	{
		set = true;
	}

	public void disableAlarm()
	{
		set = false;
	}

	public boolean alarmStatus()
	{
		return set;
	}

	public boolean checkAlarmTime()
	{
		int alarmHour = alarmTime.getHour();
		int alarmMinute = alarmTime.getMinute();

	if ( currentTime.getHour() == alarmHour && currentTime.getMinute() == alarmMinute && set == true )
	{
		set = false;  // turn off alarm
		return true;  // alarm is ringing
	}
	else
		return false;
}
} // end class AlarmClock
