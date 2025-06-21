package Java_Built-in_Function;

import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 5, 10); // Example input
        LocalDate result = inputDate.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

        System.out.println("Original Date: " + inputDate);
        System.out.println("Modified Date: " + result);
    }
}