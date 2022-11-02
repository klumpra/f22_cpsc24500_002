package employeewithinheritance;
import java.util.Comparator;
public class CompareEmployeeHours implements Comparator<Employee> {
	/* returns positive if first > second in terms of hours worked, 0 if equal,
	 * negative if first < second.
	 */
	@Override
	public int compare(Employee first, Employee second) {
		double firstHours = first.getHoursWorked();
		double secondHours = second.getHoursWorked();
		if (firstHours < secondHours) {
			return -1;
		} else if (firstHours > secondHours) {
			return +1;
		} else {
			return 0;
		}
	}

}
