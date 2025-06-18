package Java_Methods;

public class ChocolateDistributor {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int quotient = chocolates / children;
        int remainder = chocolates % children;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();
        
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);
    }
}