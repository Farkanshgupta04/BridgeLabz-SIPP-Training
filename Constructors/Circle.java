package OOPS.Constructors;

class Circle {
    double radius;

    Circle() {
        this(1.0);  
    }

    Circle(double r) {
        radius = r;
    }

    void show() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);
        c1.show();
        c2.show();
    }
}
