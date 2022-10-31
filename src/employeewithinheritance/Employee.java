package employeewithinheritance;

public class Employee extends Person {
	private double hoursWorked;
	private double payRate;
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		if (hoursWorked < 0) {
			hoursWorked = 0;
		} else {
			this.hoursWorked = hoursWorked;
		}
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		if (payRate < 0) {
			payRate = 0;
		} else {
			this.payRate = payRate;
		}
	}
	public Employee() {
		// automatic call to the superclasses's default constructor - firstName and lastName are set to ""
		hoursWorked = 0;
		payRate = 0;
	}
	public Employee(String first, String last, double hoursWorked, double payRate) {
		super(first,last);  // super(params) calls the superclass's non-default constructor
		setHoursWorked(hoursWorked);
		setPayRate(payRate);
	}
	public double calculateGrossPay() {
		return hoursWorked * payRate;
	}
	@Override
	public String getType() {
		return "employee";
	}
	@Override
	public String toString() {
//		return String.format("%s\t%s\t%.2f\t%.2f",getFirstName(),getLastName(),hoursWorked,payRate);
		return String.format("%s\t%.2f\t%.2f", super.toString(),hoursWorked,payRate);
	}
}
