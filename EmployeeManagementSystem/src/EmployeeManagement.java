import java.util.ArrayList;
import java.util.List;

// Employee class with attributes and methods
class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize employee details
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + salary);
    }
}

// Main class to execute the program
public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(101, "Vikas", 50000);
        Employee emp2 = new Employee(102, "Sai", 60000);
        Employee emp3 = new Employee(103, "Naveen", 55000);

        // Storing employees in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Displaying all employee details
        System.out.println("Employee Details:");
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
