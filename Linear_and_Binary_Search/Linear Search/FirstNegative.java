public class FirstNegative {
    public static void main(String[] args) {
        int[] arr = {10, 15, -4, 20, 30};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println("Index of first negative: " + i);
                return;
            }
        }
        System.out.println("-1");
    }
}