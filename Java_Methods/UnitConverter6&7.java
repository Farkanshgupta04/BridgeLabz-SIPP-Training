package Java_Methods;

public class UnitConverter6and7 {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static void main(String[] args) {
        System.out.println("Conversion Examples:");
        System.out.println("100°F to Celsius: " + convertFahrenheitToCelsius(100));
        System.out.println("10 km to miles: " + convertKmToMiles(10));
    }
}
