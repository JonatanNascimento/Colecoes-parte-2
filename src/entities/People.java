package entities;

public class People implements Comparable<People> {

	private String name;
	private char gender;

	public People() {
	}

	public People(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return name + " " + gender;
	}

	@Override
	public int compareTo(People people) {
		return this.name.compareTo(people.getName());
	}

}
