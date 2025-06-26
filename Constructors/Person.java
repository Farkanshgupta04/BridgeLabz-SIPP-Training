package OOPS.Constructors;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println(name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Aman", 22);
        Person p2 = new Person(p1); 
        p1.display();
        p2.display();
    }
}
