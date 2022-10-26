package employeewithclasses;
import java.util.ArrayList;
import java.util.Scanner;
/* this is the controller for our application - where the model and
 * view come together and are told to do things.
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<Employee>();
		String first, last, doAgain;
		double rate, worked;
		String responsibilities;
		String[] parts;
		Employee emp;
		do {
			System.out.print("Enter first name, last name, pay rate, hours worked, and responsibilities: ");
			first = sc.next();
			last = sc.next();
			rate = sc.nextDouble();
			worked = sc.nextDouble();
			responsibilities = sc.nextLine();
			parts = responsibilities.split(";");
			emp = new Employee(first,last,worked,rate);
			for (String part : parts) {
				part = part.trim();
				emp.addResponsibility(part);
			}
			employees.add(emp);
			System.out.print("Do you have another (y or n)? ");
			doAgain = sc.next();
		} while (doAgain.equalsIgnoreCase("Y"));
		EmployeeWriter.writeEmployeesToScreen(employees);
	}
}
