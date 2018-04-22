//Name: MArk MCCleane
//Student No: C00191900 
//Date: 16/11/2016
//Purpose:To manage the employees details of growing number of employees in the company
public class Car {
		public static int assetNumber = 100;
		String carOwnerName;
		
		public Car()
		{
			++assetNumber;			//incrementing asset numbers
			setCarOwnerName("");
		}
		public void finalize()
		{
			--assetNumber;  // decrement static count of asset number
		}

		public int getAssetNumber() {
			return assetNumber;
		}

		public String getCarOwnerName() {
			return carOwnerName;
		}

		public void setCarOwnerName(String carOwnerName) {
			this.carOwnerName = carOwnerName;
		}
		public String toString()
		{
			return "Asset Number: " + getAssetNumber() +"\nCar owner: " + getCarOwnerName() ;
		}
}
