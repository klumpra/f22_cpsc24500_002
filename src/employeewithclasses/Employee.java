package employeewithclasses;
import java.util.ArrayList;
public class Employee {
	private String firstName;
	private String lastName;
	private double payRate;
	private double hoursWorked;
	private ArrayList<String> responsibilities;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String first) {
		firstName = first;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String last) {
		lastName = last;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double rate) {
		if (rate < 0) {
			payRate = 0;
		} else {
			payRate = rate;
		}
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double worked) {
		if (worked < 0) {
			hoursWorked = 0;
		} else {
			hoursWorked = worked;
		}
	}
	public ArrayList<String> getResponsibilities() {
		return responsibilities;
	}
	public void addResponsibility(String resp) {
		responsibilities.add(resp);
	}
	public Employee() {
		this("","",0,0);  // non-default constructor call
	}
	public Employee(String first, String last, double worked, double rate) {
		setFirstName(first);
		setLastName(last);
		setHoursWorked(worked);
		setPayRate(rate);
		responsibilities = new ArrayList<String>();
	}
	public String getResponsibilitiesAsString() {
		String result = "";
		if (responsibilities.size() == 0) {
			return "None";
		} else {
			for (String resp : responsibilities) {
				if (!result.isBlank()) {
					result = result + "; ";
				}
				result = result + resp;
			}
			return result;
		}
	}
	@Override
	public String toString() {
		return String.format("%-15s%-15s%10.2f%10.2f %s", lastName, firstName, 
				hoursWorked, payRate, getResponsibilitiesAsString());
	}
}










