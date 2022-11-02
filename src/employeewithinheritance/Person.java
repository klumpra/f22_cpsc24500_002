package employeewithinheritance;

public abstract class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Person() {
		this("","");   // calls the non-default constructor
	}
	public Person(String first, String last) {
		setFirstName(first);
		setLastName(last);
	}
	public abstract String getType();
	
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s", getType(), firstName, lastName);
	}
	@Override
	public int compareTo(Person other) {
		String myLastFirst = lastName+firstName;
		String otherLastFirst = other.lastName+other.firstName;
		return myLastFirst.compareTo(otherLastFirst);
	}
}
