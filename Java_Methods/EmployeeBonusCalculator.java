package Java_Methods;

public class EmployeeBonusCalculator {
    public static double[][] calculateSalariesAndBonus(int numEmployees) {
        double[][] employeeData = new double[numEmployees][3]; 
        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + Math.random() * 90000; 
            employeeData[i][1] = Math.random() * 10; 
            employeeData[i][2] = employeeData[i][1] > 5 ? employeeData[i][0] * 0.05 : employeeData[i][0] * 0.02;
        }
        return employeeData;
    }

    public static void main(String[] args) {
        double[][] employees = calculateSalariesAndBonus(10);
        System.out.printf("%-10s %-15s %-15s %-10s%n", "ID", "Old Salary", "Years of Service", "Bonus");
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-10d %-15.2f %-15.2f %-10.2f%n", i + 1, employees[i][0], employees[i][1], employees[i][2]);
        }
    }
}
