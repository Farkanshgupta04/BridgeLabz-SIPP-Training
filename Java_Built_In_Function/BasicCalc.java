import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (op) {
            case '+': System.out.println("Result: " + add(a, b)); break;
            case '-': System.out.println("Result: " + subtract(a, b)); break;
            case '*': System.out.println("Result: " + multiply(a, b)); break;
            case '/': System.out.println("Result: " + divide(a, b)); break;
            default: System.out.println("Invalid operator.");
        }
    }

    static double add(double x, double y) { return x + y; }
    static double subtract(double x, double y) { return x - y; }
    static double multiply(double x, double y) { return x * y; }
    static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Division by zero error.");
            return 0;
        }
        return x / y;
    }
}