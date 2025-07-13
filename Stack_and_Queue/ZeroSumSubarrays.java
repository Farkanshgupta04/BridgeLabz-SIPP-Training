import java.util.*;

public class ZeroSumSubarrays {
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4};
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        map.put(0, new ArrayList<>(Arrays.asList(-1))); 

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println("Subarray: " + Arrays.toString(Arrays.copyOfRange(arr, start + 1, i + 1)));
                }
            }
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }
}