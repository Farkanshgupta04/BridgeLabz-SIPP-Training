import java.util.*;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("   Employee: " + name);
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    public void display() {
        System.out.println(" Department: " + name);
        for (Employee emp : employees) {
            emp.display();
        }
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName, List<String> employeeNames) {
        Department dept = new Department(deptName);
        for (String emp : employeeNames) {
            dept.addEmployee(emp);
        }
        departments.add(dept);
    }

    public void showStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.display();
        }
    }
}

public class CompanyDepartmentsComposition {
    public static void main(String[] args) {
        Company microsoft = new Company("Microsoft India");

        microsoft.addDepartment("Engineering", Arrays.asList("Ravi", "Priya"));
        microsoft.addDepartment("HR", Arrays.asList("Anjali"));
        microsoft.addDepartment("Sales", Arrays.asList("Imran", "Kritika"));

        microsoft.showStructure();

        microsoft = null;

        System.out.println("\nCompany and all its departments and employees are now removed from memory.");
    }
}