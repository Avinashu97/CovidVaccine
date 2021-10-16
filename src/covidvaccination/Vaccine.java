package covidvaccination;


public abstract class Vaccine {
	String efficacy;
	String name;
	int shots;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setShots() {
		this.shots = shots;
	}
	public int getShots() {
		return shots;
	}
	public String toString() {
		return this.name;
	}


}
