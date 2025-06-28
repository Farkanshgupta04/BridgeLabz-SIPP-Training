import java.util.*;

class Course {
    private String name;
    private List<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + name + " has the following students:");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
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

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void showCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getName());
        }
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students in " + name + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("Bright Future Academy");

        Student riya = new Student("Riya");
        Student arjun = new Student("Arjun");
        Student meena = new Student("Meena");

        school.addStudent(riya);
        school.addStudent(arjun);
        school.addStudent(meena);

        Course math = new Course("Mathematics");
        Course english = new Course("English Literature");
        Course physics = new Course("Physics");

        riya.enrollInCourse(math);
        riya.enrollInCourse(english);
        arjun.enrollInCourse(physics);
        meena.enrollInCourse(math);
        meena.enrollInCourse(physics);

        school.showStudents();
        System.out.println();
        riya.showCourses();
        System.out.println();
        physics.showEnrolledStudents();
    }
}