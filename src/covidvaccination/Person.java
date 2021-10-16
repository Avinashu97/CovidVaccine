package covidvaccination;

public abstract class Person {

	String name;
	String gender;
	int age;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setGender(String gender) {
		this.gender = name;
	}
	public String getGender() {
		return this.gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}

}
