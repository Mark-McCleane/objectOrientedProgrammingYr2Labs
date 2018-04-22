package practiceTest;

import java.util.Arrays;

public class Farm 
{
	Animal[] myAnimal = new Animal[2];
	Machine[] myMachine= new Machine[2];
	
	@Override
	public String toString() {
		return "Farm\nMy Animal Array= " + Arrays.toString(myAnimal) + "\nMy Machine Array =" + Arrays.toString(myMachine);
	}	
}
