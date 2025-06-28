import java.util.*;

class Course {
    private String name;
    private Professor professor;
    private List<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showDetails() {
        System.out.println("Course: " + name);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        course.assignProfessor(this);
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void showCourses() {
        System.out.println("Courses for " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student kabir = new Student("Kabir");
        Student sania = new Student("Sania");

        Professor profSingh = new Professor("Dr. Singh");

        Course oop = new Course("OOP Concepts");
        Course dbms = new Course("DBMS");

        profSingh.assignCourse(oop);

        kabir.enrollCourse(oop);
        kabir.enrollCourse(dbms);
        sania.enrollCourse(oop);

        oop.showDetails();
        System.out.println();
        kabir.showCourses();
    }
}