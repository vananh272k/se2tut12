package tut11.Mankind;

public class Worker extends Human{
	private double weekSalary;
	private double workHoursPerDay;
	
	public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
		super(firstName, lastName);
		
		this.weekSalary = weekSalary;
		this.workHoursPerDay = workHoursPerDay;
	}

	//GETTER and SETTER
	@Override
	protected void setLastName(String lastName) throws IllegalArgumentException {
		if(lastName.length() <= 3) {
			throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
		}else {
			//set last name later
			super.setLastName(lastName);;
		}
	}
	
	public double getWeekSalary() {
		return this.weekSalary;
	}

	protected void setWeekSalary(double weekSalary) throws IllegalArgumentException {
		if(weekSalary <= 10) {
			throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
		}else {
			this.weekSalary = weekSalary;
		}
	}

	public double getWorkHoursPerDay() {
		return this.workHoursPerDay;
	}

	protected void setWorkHoursPerDay(double workHoursPerDay) throws IllegalArgumentException {
		if(workHoursPerDay < 1 && workHoursPerDay > 12) {
			throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
		}else {
			this.workHoursPerDay = workHoursPerDay;
		}
	}
	
	private double getSalaryPerHour() {
		return (this.weekSalary/(5*this.workHoursPerDay));
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		//super.toString();
		
		sb.append("Type: ").append(this.getClass().getSimpleName()).append(System.lineSeparator())
		.append("First name: ").append(this.getFirstName()).append(System.lineSeparator())
		.append("Last name: ").append(this.getLastName()).append(System.lineSeparator())
		.append("Week salary: ").append(this.getWeekSalary()).append(System.lineSeparator())
		.append("Hours per day: ").append(this.getWorkHoursPerDay()).append(System.lineSeparator())
		.append("Salary per hour: ").append(this.getSalaryPerHour()).append(System.lineSeparator());
		
		return sb.toString();
	}
}
