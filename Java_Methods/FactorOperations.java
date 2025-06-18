package Java_Methods;

public class FactorOperations {
    public static int[] findFactors(int num) {
        java.util.ArrayList<Integer> factors = new java.util.ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors.add(i);
        }
        return factors.stream().mapToInt(i -> i).toArray();
    }

    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int findCubeProduct(int[] factors) {
        int product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }

    public static void main(String[] args) {
        int num = 12;
        int[] factors = findFactors(num);
        System.out.println("Factors: " + java.util.Arrays.toString(factors));
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Product of Cube of Factors: " + findCubeProduct(factors));
    }
}
