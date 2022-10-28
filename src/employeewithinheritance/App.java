package employeewithinheritance;
import java.util.ArrayList;
public class App {
	public static void main(String[] args) {
/*		Employee emp = new Employee("Ray","Klump",17.5,15.25);
		Customer cust1 = new Customer("Karen","Klump",62500,"123 Primrose Lane");
		Customer cust2 = new Customer("Conor","Klump",57500,"One University Pkwy");
		System.out.println(emp);
		System.out.println(cust1);
		System.out.println(cust2);
*/
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Employee("Ray","Klump",17.5,15.25));
		persons.add(new Customer("Karen","Klump",62500,"123 Primrose Lane"));
		persons.add(new Customer("Conor","Klump",57500,"One University Pkwy"));
		
		for (Person person : persons) {  // polymorphism - access specific functionality from a superclass variable
			System.out.println(person);
		}
	}
}
