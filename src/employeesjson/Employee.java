package employeesjson;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
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
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }
    public Employee() {
        firstName = "";
        lastName = "";
        salary = 0;
    }
    public Employee(String firstName, String lastName, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setSalary(salary);
    }
    @Override
    public String toString() {
        return String.format("%s, %s\t$%.2f", firstName,lastName,salary);
    }
}

