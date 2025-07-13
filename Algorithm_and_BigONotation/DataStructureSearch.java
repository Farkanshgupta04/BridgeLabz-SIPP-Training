import java.util.*;

public class DataStructureSearch {
    public static void main(String[] args) {
        int N = 1000000;
        int target = N - 1;

        int[] array = new int[N];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Array
        long startArr = System.nanoTime();
        for (int i = 0; i < N; i++) {
            if (array[i] == target) break;
        }
        long endArr = System.nanoTime();

        // HashSet
        long startHS = System.nanoTime();
        hashSet.contains(target);
        long endHS = System.nanoTime();

        // TreeSet
        long startTS = System.nanoTime();
        treeSet.contains(target);
        long endTS = System.nanoTime();

        System.out.println("Array Search Time: " + (endArr - startArr) / 1_000_000 + " ms");
        System.out.println("HashSet Search Time: " + (endHS - startHS) / 1_000_000 + " ms");
        System.out.println("TreeSet Search Time: " + (endTS - startTS) / 1_000_000 + " ms");
    }
}