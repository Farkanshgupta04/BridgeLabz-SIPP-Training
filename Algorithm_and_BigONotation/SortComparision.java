import java.util.*;

public class SortComparison {
    public static void main(String[] args) {
        int N = 10000;
        int[] arr = new int[N];
        Random rand = new Random();
        for (int i = 0; i < N; i++) arr[i] = rand.nextInt(N);

        // Bubble Sort
        int[] bubbleArr = arr.clone();
        long startBubble = System.nanoTime();
        for (int i = 0; i < bubbleArr.length - 1; i++) {
            for (int j = 0; j < bubbleArr.length - i - 1; j++) {
                if (bubbleArr[j] > bubbleArr[j + 1]) {
                    int temp = bubbleArr[j];
                    bubbleArr[j] = bubbleArr[j + 1];
                    bubbleArr[j + 1] = temp;
                }
            }
        }
        long endBubble = System.nanoTime();

        // Merge Sort
        int[] mergeArr = arr.clone();
        long startMerge = System.nanoTime();
        Arrays.sort(mergeArr); 
        long endMerge = System.nanoTime();

        // Quick Sort
        List<Integer> quickList = new ArrayList<>();
        for (int val : arr) quickList.add(val);
        long startQuick = System.nanoTime();
        Collections.sort(quickList); 
        long endQuick = System.nanoTime();

        System.out.println("Bubble Sort Time: " + (endBubble - startBubble) / 1_000_000 + " ms");
        System.out.println("Merge Sort Time: " + (endMerge - startMerge) / 1_000_000 + " ms");
        System.out.println("Quick Sort Time: " + (endQuick - startQuick) / 1_000_000 + " ms");
    }
}