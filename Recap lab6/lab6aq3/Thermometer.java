// Implements a Thermometer class.
// Stores the current temperature in Celcius
public class Thermometer
{ // begin Thermometer
	private double celsius;	// more about private later
							// celsius is accessible to all methods in this class
	
	public Thermometer()			// constructor method #1
	{
		setCelsius(0);		
	}
		
	public Thermometer(double cel)	// constructor method #2
	{
		setCelsius(cel);
	}

	public void setCelsius(double cel)
	{
		celsius = cel;		
	}

	public double getCelsius()
	{
		return celsius;
	}

//Fahrenheit
	
/*	public Thermometer()
	{
		setFahrenheit(0);
	}
	public Thermometer(double fahr)
	{
		setFahrenheit(fahr);
	}*/
	
	public void setFahrenheit(double fahr)
	{
		celsius = ((fahr - 32) * 5) / 9;
	}
	public double getFahrenheit()
	{
		double fahr = 0;
		fahr = (celsius * (9 / 5)) + 32;
		return fahr;
	}
	
	
	int map(int x, int in_min, int in_max, int out_min, int out_max)
	{
	  return (x - in_min)*(out_max - out_min)/(in_max - in_min)+ out_min;
	}

	public void display()
	{
		System.out.println("0                       50                       100");
		System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooooooo");
		int t = map((int) getCelsius(), 0, 100, 0, 50);
		for (int i = 0; i < t; i++)
		{
			System.out.print("-");			
		}
		System.out.print(">");			
		System.out.println();
		System.out.println("ooooooooooooooooooooooooooooooooooooooooooooooooooo");
	}

	
} // end class Thermometer
