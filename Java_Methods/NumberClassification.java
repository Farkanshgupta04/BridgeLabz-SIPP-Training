package Java_Methods;

public class NumberClassification {
    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isPerfectNumber(int num) {
        return sumOfProperDivisors(num) == num;
    }

    public static boolean isAbundantNumber(int num) {
        return sumOfProperDivisors(num) > num;
    }

    public static boolean isDeficientNumber(int num) {
        return sumOfProperDivisors(num) < num;
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println(num + " is a Perfect number? " + isPerfectNumber(num));
        System.out.println(num + " is an Abundant number? " + isAbundantNumber(num));
        System.out.println(num + " is a Deficient number? " + isDeficientNumber(num));
    }
}