abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Base Salary: ₹" + baseSalary);
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public double calculateSalary() {
        return 1.2 * 30000; // Example logic
    }

    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        Employee e = new FullTimeEmployee(101, "Aryan", 30000);
        ((Department) e).assignDepartment("IT");
        e.displayDetails();
        System.out.println(((Department) e).getDepartmentDetails());
        System.out.println("Final Salary: ₹" + e.calculateSalary());
    }
}