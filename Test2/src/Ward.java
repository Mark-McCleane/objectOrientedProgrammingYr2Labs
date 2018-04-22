import java.util.Arrays;

// Author 			: Mark McCleane
// Date 			: Jan-2017
// Purpose 			: The Ward class for CA2
public class Ward 
{
	Doctor[] doctors = new Doctor[2];
	Nurse[] nurses = new Nurse[3];
	Cleaner[] cleaners = new Cleaner[2];
	Receptionist receptionist;		
	public Ward(Doctor[] doctors, Nurse[] nurses,Cleaner[] cleaners,Receptionist receptionist)
	{
		setDoctors(doctors);
		setNurses(nurses);
		setCleaners(cleaners);
		setReceptionist(receptionist);
	}
	
	public Doctor[] getDoctors() {
		return doctors;
	}

	public void setDoctors(Doctor[] doctors) {
		this.doctors = doctors;
	}

	public Nurse[] getNurses() {
		return nurses;
	}

	public void setNurses(Nurse[] nurses) {
		this.nurses = nurses;
	}

	public Cleaner[] getCleaners() {
		return cleaners;
	}

	public void setCleaners(Cleaner[] cleaners) {
		this.cleaners = cleaners;
	}

	public Receptionist getReceptionist() {
		return receptionist;
	}

	public void setReceptionist(Receptionist receptionist) {
		this.receptionist = receptionist;
	}

	@Override
	public String toString() {
		return "Ward\n[Warddoctors=\n" + Arrays.toString(doctors) + "\nWardnurses=" + Arrays.toString(nurses)
				+ "\nWardcleaners=" + Arrays.toString(cleaners) + "\nWardreceptionist= " + getReceptionist() + "]";
	}
}