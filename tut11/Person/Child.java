package tut11.Person;

public class Child extends Person{
	public Child(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void setAge(int age) throws IllegalArgumentException {
	//TODO: Validate the age
		if (age > 15) {
			throw new IllegalArgumentException("Children should not be able to have age greater than 15");
		} else {
			super.setAge(age);
		}
	}
}
