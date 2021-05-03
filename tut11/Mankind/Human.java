package tut11.Mankind;

public class Human {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return this.firstName;
	}

	protected void setFirstName(String firstName) throws IllegalArgumentException {
		if (firstName != null || firstName.length() < 4) {
			throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
		} else if (firstName.charAt(0) >= 'a' && firstName.charAt(0) <= 'z') {
			throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
		} else if (firstName.contains(" ")) {
			throw new IllegalArgumentException("Expected a word!Argument: firstName");
		} else {
			this.firstName = firstName;
		}
	}

	public String getLastName() {
		return this.lastName;
	}

	protected void setLastName(String lastName) {
		if (lastName != null || lastName.length() < 3) {
			throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
		} else if (lastName.charAt(0) >= 'a' && lastName.charAt(0) <= 'z') {
			throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
		} else if (lastName.contains(" ")) {
			throw new IllegalArgumentException("Expected a word!Argument: lastName");
		} else {
			this.lastName = lastName;
		}
	}

	public Human(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Type: ").append(this.getClass().getSimpleName()).append(System.lineSeparator())
				.append("First name: ").append(this.getFirstName()).append(System.lineSeparator()).append("Last name: ")
				.append(this.getLastName()).append(System.lineSeparator());

		return sb.toString();
	}
}