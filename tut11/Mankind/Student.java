package tut11.Mankind;

public class Student extends Human {
	private String facultyNo;

	public Student(String firstName, String lastName, String facultyNo) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub

		this.facultyNo = facultyNo;
	}

	// GETTER and SETTER
	public String getFacultyNo() {
		return facultyNo;
	}

	protected void setFacultyNo(String facultyNo) throws IllegalArgumentException {
		if (facultyNo.length() < 5 && facultyNo.length() > 10) {
			throw new IllegalArgumentException("Invalid faculty number!");
		} else if (!(facultyNo.matches(".*[^0-9].*"))) {
			throw new IllegalArgumentException("Invalid faculty number!");
		} else {
			this.facultyNo = facultyNo;
		}
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		// super.toString();

		sb.append("Type: ").append(this.getClass().getSimpleName()).append(System.lineSeparator())
				.append("First name: ").append(this.getFirstName()).append(System.lineSeparator()).append("Last name: ")
				.append(this.getLastName()).append(System.lineSeparator()).append("Faculty number: ")
				.append(this.getFacultyNo()).append(System.lineSeparator());

		return sb.toString();
	}

}
