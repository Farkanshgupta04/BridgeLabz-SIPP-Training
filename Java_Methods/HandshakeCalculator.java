package Java_Methods;

public class HandshakeCalculator {
    public static int calculateHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();

        System.out.println("Maximum handshakes: " + calculateHandshakes(students));
    }
}
