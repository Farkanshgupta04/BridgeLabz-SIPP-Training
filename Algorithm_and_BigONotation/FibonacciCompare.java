public class FibonacciCompare {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int N = 30;

        long startRec = System.nanoTime();
        System.out.println("Recursive: " + fibonacciRecursive(N));
        long endRec = System.nanoTime();

        long startIter = System.nanoTime();
        System.out.println("Iterative: " + fibonacciIterative(N));
        long endIter = System.nanoTime();

        System.out.println("Recursive Time: " + (endRec - startRec) / 1_000_000 + " ms");
        System.out.println("Iterative Time: " + (endIter - startIter) / 1_000_000 + " ms");
    }
}