package practiceTest;

public abstract class Machine
{
	public static int assetNumber = 100;
	public String name;
	public Machine(String name)
	{
		setName(name);
		assetNumber++;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getAssetNumber() {
		return assetNumber;
	}

	public static void setAssetNumber(int assetNumber) {
		Machine.assetNumber = assetNumber;
	}
	public abstract String getServiced();
	
	public String toString() {
		return "Name: " + name + " assetNumber:" + assetNumber + ", " + getServiced();
	}
}
