package Java_Methods;

public class EuclideanDistanceCalculator {
    public static double calculateEuclideanDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        int x1 = 2, y1 = 3, x2 = 6, y2 = 7;
        System.out.println("Euclidean Distance: " + calculateEuclideanDistance(x1, y1, x2, y2));
        double[] equation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of Line: y = " + equation[0] + "x + " + equation[1]);
    }
}
