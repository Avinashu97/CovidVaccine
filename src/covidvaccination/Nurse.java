package covidvaccination;

public class Nurse extends Person{

	public Nurse(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public void administerVaccine() {
		System.out.println("Administering Vaccine");
	}

}
