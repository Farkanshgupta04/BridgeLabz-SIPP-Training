import java.util.*;

public class PairWithSum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(target - num)) {
                System.out.println("Pair found: " + num + " + " + (target - num));
                return;
            }
            seen.add(num);
        }

        System.out.println("No pair found.");
    }
}