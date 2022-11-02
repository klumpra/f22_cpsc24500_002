package employeewithinheritance;
import java.util.ArrayList;
import java.util.Collections;
public class App {
	public static void main(String[] args) {
/*		Employee emp = new Employee("Ray","Klump",17.5,15.25);
		Customer cust1 = new Customer("Karen","Klump",62500,"123 Primrose Lane");
		Customer cust2 = new Customer("Conor","Klump",57500,"One University Pkwy");
		System.out.println(emp);
		System.out.println(cust1);
		System.out.println(cust2);
*/
		/*
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Employee("Ray","Klump",17.5,15.25));
		persons.add(new Customer("Karen","Klump",62500,"123 Primrose Lane"));
		persons.add(new Customer("Conor","Klump",57500,"One University Pkwy"));
		System.out.println("Unsorted:");
		for (Person person : persons) {  // polymorphism - access specific functionality from a superclass variable
			System.out.println(person);
		}
		System.out.println("Sorted:");
		Collections.sort(persons);  // natural sort order
		for (Person person : persons) {  // polymorphism - access specific functionality from a superclass variable
			System.out.println(person);
		}
		*/
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("Ray","Klump",17.5,21.5));
		emps.add(new Employee("Karen","Klump",20.25,21));
		emps.add(new Employee("Lauren","Klump",15.75,13));
		for (Employee emp: emps) {
			System.out.println(emp);
		}
		System.out.println("Now sorted by hours worked: ");
		//CompareEmployeeHours ceh = new CompareEmployeeHours();
		Collections.sort(emps,new CompareEmployeeHours());  // anonymous object
		Collections.reverse(emps);
		for (Employee emp: emps) {
			System.out.println(emp);
		}		
	}
}
