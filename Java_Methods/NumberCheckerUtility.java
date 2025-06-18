package Java_Methods;

public class NumberCheckerUtility {
    public static boolean isArmstrongNumber(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == num;
    }

    public static int findLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > max) max = digit;
        }
        return max;
    }

    public static int findSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < min) min = digit;
        }
        return min;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println("Is " + num + " an Armstrong number? " + isArmstrongNumber(num));

        int[] digits = {1, 5, 3, 9, 2};
        System.out.println("Largest digit: " + findLargest(digits));
        System.out.println("Smallest digit: " + findSmallest(digits));
    }
}