package tut11.Person;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		// do validation first
		if (name.length() <= 3) {
			throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
		} else {
			// set name later
			this.name = name;
		}
	}

	public int getAge() {
		return this.age;
	}

	protected void setAge(int age) throws IllegalArgumentException {
		// do validation first
		if (age < 1 || age > 200) {
			throw new IllegalArgumentException("Invalid age");
		} else {
			// set age later
			this.age = age;
		}
	}

//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}

	public Person(String name, int age) {
		this.setAge(age);
		this.setName(name);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(String.format("Name: %s, Age: %d", this.getName(), this.getAge()));

		return sb.toString();
	}
}
