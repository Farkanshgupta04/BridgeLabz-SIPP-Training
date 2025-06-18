package Java_Methods;

public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) 
               + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter wind speed in mph: ");
        double windSpeed = scanner.nextDouble();

        System.out.println("Wind Chill Temperature: " + calculateWindChill(temperature, windSpeed));
    }
}
