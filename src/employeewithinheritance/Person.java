package employeewithinheritance;

public class Person {
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
	@Override
	public String toString() {
		return String.format("%s\t%s", firstName, lastName);
	}
}
