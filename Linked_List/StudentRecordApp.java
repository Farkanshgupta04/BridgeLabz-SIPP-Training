class Student {
    int rollNo;
    String name;
    int age;
    char grade;
    Student next;

    Student(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {
    Student head;

    void addAtBeginning(Student newStudent) {
        newStudent.next = head;
        head = newStudent;
    }

    void addAtEnd(Student newStudent) {
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newStudent;
    }

    void addAtPosition(Student newStudent, int pos) {
        if (pos == 1 || head == null) {
            addAtBeginning(newStudent);
            return;
        }
        Student temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++)
            temp = temp.next;
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    void deleteByRoll(int rollNo) {
        if (head == null) return;
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    void updateGrade(int rollNo, char grade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = grade;
                return;
            }
            temp = temp.next;
        }
    }

    void searchByRoll(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Found: " + temp.name + " (" + temp.grade + ")");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    void displayAll() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " - " + temp.name + " | Age: " + temp.age + " | Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

public class StudentRecordApp {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.addAtEnd(new Student(1, "Aditi", 20, 'A'));
        list.addAtEnd(new Student(2, "Rohit", 21, 'B'));
        list.addAtPosition(new Student(3, "Meena", 22, 'C'), 2);

        System.out.println("All Students:");
        list.displayAll();

        System.out.println("\nUpdating Grade for Roll No 2...");
        list.updateGrade(2, 'A');
        list.searchByRoll(2);

        System.out.println("\nDeleting Roll No 1...");
        list.deleteByRoll(1);
        list.displayAll();
    }
}