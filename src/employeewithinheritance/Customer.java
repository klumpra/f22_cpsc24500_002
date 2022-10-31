package employeewithinheritance;

public class Customer extends Person {
	private double annualSalary;
	private String shippingAddress;
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		if (annualSalary < 0) {
			annualSalary = 0;
		} else {
			this.annualSalary = annualSalary;
		}
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Customer() {
		// auto call to Person() constructor - firstName and lastName already init'd
		annualSalary = 0;
		shippingAddress = "";
	}
	public Customer(String first, String last, double salary, String shipTo) {
		super(first,last);
		setAnnualSalary(salary);
		setShippingAddress(shipTo);
	}
	@Override
	public String getType() {
		return "customer";
	}
	@Override
	public String toString() {
		return String.format("%s\t%.2f\t%s", super.toString(), annualSalary, shippingAddress);
	}
}
