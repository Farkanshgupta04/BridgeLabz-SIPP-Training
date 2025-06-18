package Java_Methods;

public class SpecialNumbers {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeonNumber(int num) {
        int squareSum = 0, square = num * num;
        while (square > 0) {
            squareSum += square % 10;
            square /= 10;
        }
        return squareSum == num;
    }

    public static boolean isSpyNumber(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        return (num * num) % Math.pow(10, String.valueOf(num).length()) == num;
    }

    public static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println("Is " + num + " a Prime number? " + isPrime(num));
        System.out.println("Is " + num + " a Neon number? " + isNeonNumber(num));
        System.out.println("Is " + num + " a Spy number? " + isSpyNumber(num));
        System.out.println("Is " + num + " an Automorphic number? " + isAutomorphic(num));
        System.out.println("Is " + num + " a Buzz number? " + isBuzzNumber(num));
    }
}
