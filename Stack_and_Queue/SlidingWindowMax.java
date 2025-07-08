import java.util.*;

class SlidingWindowMax {
    static List<Integer> maxInWindows(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            
            while (!dq.isEmpty() && dq.peek() <= i - k)
                dq.poll();

            
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
                dq.pollLast();

            dq.offer(i);
            if (i >= k - 1)
                result.add(arr[dq.peek()]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        List<Integer> result = maxInWindows(arr, k);
        result.forEach(r -> System.out.print(r + " "));
    }
}