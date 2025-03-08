import java.util.ArrayList;

class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Amala", 50000);
        Employee emp2 = new Employee(102, "Kiran", 60000);
        Employee emp3 = new Employee(103, "Vedanshi", 55000);
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
