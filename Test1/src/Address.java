//Name: MArk MCCleane
//Student No: C00191900 
//Date: 16/11/2016
//Purpose:To manage the employees details of growing number of employees in the company
public class Address {
	String street;
	String cityOrTown;
	String county;
	
	public Address()
	{
		setStreet("");
		setCityOrTown("");
		setCounty("");
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCityOrTown() {
		return cityOrTown;
	}

	public void setCityOrTown(String cityOrTown) {
		this.cityOrTown = cityOrTown;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}
	public String toString()
	{
		return getStreet() + "\n" + getCityOrTown() + "\n" + getCounty(); // done in street layout
	}
}
