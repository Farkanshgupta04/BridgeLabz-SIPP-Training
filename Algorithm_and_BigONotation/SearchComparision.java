import java.util.*;

public class SearchComparison {
    public static void main(String[] args) {
        int N = 1000000;
        int target = N - 1;
        int[] data = new int[N];
        for (int i = 0; i < N; i++) data[i] = i;

        // Linear Search
        long startLinear = System.nanoTime();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) break;
        }
        long endLinear = System.nanoTime();

        // Binary Search (Arrays.binarySearch assumes sorted)
        long startBinary = System.nanoTime();
        Arrays.sort(data); // O(N log N)
        int index = Arrays.binarySearch(data, target);
        long endBinary = System.nanoTime();

        System.out.println("Linear Search Time: " + (endLinear - startLinear) / 1_000_000 + " ms");
        System.out.println("Binary Search Time: " + (endBinary - startBinary) / 1_000_000 + " ms");
    }
}