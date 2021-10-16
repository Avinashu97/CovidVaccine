package covidvaccination;

public class Appointment {
	Location location;
	Patient patient;
	Nurse nurse;
	public Appointment(Location location, Patient patient , Nurse nurse) {
		this.location = location;
		this.patient = patient;
		this.nurse = nurse;

	}
	public Location getLocation() {
		return location;
	}
	public Patient getPatient() {
		return patient;
	}
	public Nurse getNurse() {
		return nurse;
	}
	

}
