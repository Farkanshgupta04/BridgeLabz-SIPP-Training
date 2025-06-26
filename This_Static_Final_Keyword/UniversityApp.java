package OOPS.This_Static_Final_Keyword;

public class UniversityApp {
    
}
class Student {
    static String universityName = "Global Institute of Technology";
    static int totalStudents = 0;

    private String name;
    private final int rollNumber;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println(name + "'s grade updated to " + grade);
        }
    }
}
public class UniversityApp {
    public static void main(String[] args) {
        Student s1 = new Student("Ishita Verma", 101, 'A');
        Student s2 = new Student("Rohan Malhotra", 102, 'B');

        s1.displayDetails();
        System.out.println("-----");
        s2.displayDetails();
        s2.updateGrade('A');
        System.out.println("-----");

        Student.displayTotalStudents();
    }
}