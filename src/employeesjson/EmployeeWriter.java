package employeesjson;

import java.util.ArrayList;

public class EmployeeWriter {
    public static void writeEmployeesToScreen(ArrayList<Employee> employees) {
        for (Employee emp: employees) {
            System.out.println(emp);
        }
    }
}
