package OOPS.Class_and_Objects.Level-02;

class Student {
    String name;
    int rollNumber;
    int marks;

    String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 75) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 40) return "C";
        else return "Fail";
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Anita";
        s.rollNumber = 23;
        s.marks = 88;
        s.displayDetails();
    }
}
