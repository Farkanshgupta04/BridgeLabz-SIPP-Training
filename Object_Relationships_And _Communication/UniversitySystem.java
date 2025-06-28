import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Department: " + name);
    }
}

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> facultyList;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyList = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    public void showStructure() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (Department dept : departments) {
            dept.display();
        }
        System.out.println("Faculty Members:");
        for (Faculty fac : facultyList) {
            fac.display();
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Meera Sharma");
        Faculty f2 = new Faculty("Prof. Rakesh Nair");
        Faculty f3 = new Faculty("Dr. Anupama Rao");

        University delhiUni = new University("Delhi University");

        delhiUni.addDepartment("Computer Science");
        delhiUni.addDepartment("Physics");
        delhiUni.addDepartment("Economics");

        delhiUni.addFaculty(f1);
        delhiUni.addFaculty(f2);

        delhiUni.showStructure();

        delhiUni = null;

        System.out.println("\nUniversity and its departments are now deleted.");
        System.out.println("But faculty members like Dr. Anupama Rao still exist independently:");

        f3.display();
    }
}