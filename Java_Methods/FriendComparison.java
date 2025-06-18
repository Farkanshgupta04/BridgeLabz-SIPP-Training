package Java_Methods;

public class FriendComparison {
    public static int findYoungest(int[] ages) {
        int youngest = ages[0];
        for (int age : ages) {
            if (age < youngest) youngest = age;
        }
        return youngest;
    }

    public static double findTallest(double[] heights) {
        double tallest = heights[0];
        for (double height : heights) {
            if (height > tallest) tallest = height;
        }
        return tallest;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];

        System.out.println("Enter ages and heights of Amar, Akbar, Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Age of friend " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Height of friend " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        System.out.println("Youngest friend is " + findYoungest(ages) + " years old.");
        System.out.println("Tallest friend is " + findTallest(heights) + " meters tall.");
    }
}