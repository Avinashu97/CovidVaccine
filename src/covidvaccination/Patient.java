package covidvaccination;
import java.time.*;
public class Patient extends Person {
	Vaccine vaccine;
	LocalDateTime vaccinationDate;
	Appointment appointment;
	public Patient(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public void setVaccine(Vaccine vaccine) {
		this.vaccine = vaccine;
	}
	public Vaccine getVaccine() {
		return vaccine;
	}
	public void setAppointmentDate() {
		this.vaccinationDate = LocalDateTime.now();
	}
	public LocalDateTime getAppointmentDate() {
		return vaccinationDate;
	}

}
