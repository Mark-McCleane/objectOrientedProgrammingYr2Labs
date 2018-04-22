// Author 			: Mark McCleane
// Date 			: Jan-2017
// Purpose 			: The Employee superclass for CA2
public class Doctor extends SalariedEmployee 
{
	private String MedicalSpecification;
	public Doctor(String name, String address, String phone,float wage, String medSpec)
	{
		super(name,address,phone, wage);
		setMedicalSpecification(medSpec);
	}
	public String getMedicalSpecification() {
		return MedicalSpecification;
	}
	public void setMedicalSpecification(String medicalSpecification) {
		MedicalSpecification = medicalSpecification;
	}
	@Override
	public String toString() {
		return "\nDoctor Name: " + name+ "\nAddress: " + address + "\nPhone: " + phone +"\nwage: " + calculateWage()
				+ "\nMedSpecification: " + getMedicalSpecification();
	}
	
	
}
