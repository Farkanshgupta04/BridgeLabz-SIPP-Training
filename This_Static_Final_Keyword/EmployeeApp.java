package OOPS.This_Static_Final_Keyword;

class Employee {
    static String companyName = "TechTrail Innovations";
    static int totalEmployees = 0;

    private String name;
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rajeev Nair", 101, "Software Engineer");
        Employee emp2 = new Employee("Divya Patel", 102, "Project Manager");

        emp1.displayDetails();
        System.out.println("-----");
        emp2.displayDetails();

       
        Employee.displayTotalEmployees();
    }
}