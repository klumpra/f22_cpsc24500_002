package employeesjson;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Ray","Klump",76000));
        employees.add(new Employee("Karen","Klump",81000));
        employees.add(new Employee("Conor","Klump",55000));
        employees.add(new Employee("Lauren","Klump",48000));
        employees.add(new Employee("Evan","Klump",42000));
        EmployeeWriter.writeEmployeesToScreen(employees);
    }
}
