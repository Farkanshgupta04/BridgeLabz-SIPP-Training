package Java_Methods;

public class FactorCalculator {
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int findSum(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static int findProduct(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double findSumOfSquares(int[] factors) {
        double sumSquares = 0;
        for (int f : factors) sumSquares += Math.pow(f, 2);
        return sumSquares;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int[] factors = findFactors(num);
        System.out.println("Factors: " + java.util.Arrays.toString(factors));
        System.out.println("Sum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSumOfSquares(factors));
    }
}