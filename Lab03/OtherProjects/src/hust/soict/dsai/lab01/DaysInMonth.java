package hust.soict.dsai.lab01;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaysInMonth {

    private static final Map<String, Integer> monthDays = new HashMap<>();

    static {
        monthDays.put("January", 31);
        monthDays.put("February", 28);
        monthDays.put("March", 31);
        monthDays.put("April", 30);
        monthDays.put("May", 31);
        monthDays.put("June", 30);
        monthDays.put("July", 31);
        monthDays.put("August", 31);
        monthDays.put("September", 30);
        monthDays.put("October", 31);
        monthDays.put("November", 30);
        monthDays.put("December", 31);
        monthDays.put("Jan", 31);
        monthDays.put("Jan.", 31);
        monthDays.put("Feb", 28);
        monthDays.put("Feb.", 28);
        monthDays.put("Mar", 31);
        monthDays.put("Mar.", 31);
        monthDays.put("Apr", 30);
        monthDays.put("Apr.", 30);
        monthDays.put("May", 31);
        monthDays.put("Jun", 30);
        monthDays.put("Jun.", 30);
        monthDays.put("Jul", 31);
        monthDays.put("Jul.", 31);
        monthDays.put("Aug", 31);
        monthDays.put("Aug.", 31);
        monthDays.put("Sep", 30);
        monthDays.put("Sep.", 30);
        monthDays.put("Oct", 31);
        monthDays.put("Oct.", 31);
        monthDays.put("Nov", 30);
        monthDays.put("Nov.", 30);
        monthDays.put("Dec", 31);
        monthDays.put("Dec.", 31);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;

        while (true) {
            System.out.print("Enter the month (full name, abbreviation, or number): ");
            monthInput = scanner.nextLine().trim();
            if (monthInput.matches("\\d+") && Integer.parseInt(monthInput) >= 1 && Integer.parseInt(monthInput) <= 12) {
                monthInput = getMonthFromNumber(Integer.parseInt(monthInput));
            }

            System.out.print("Enter the year (non-negative integer): ");
            String yearInput = scanner.nextLine().trim();
            if (!yearInput.matches("\\d+")) {
                System.out.println("Invalid year. Please enter a non-negative integer.");
                continue;
            }
            year = Integer.parseInt(yearInput);

            if (!monthDays.containsKey(monthInput)) {
                System.out.println("Invalid month. Please enter a valid month.");
                continue;
            }

            int days = monthDays.get(monthInput);
            if (monthInput.equals("February") && isLeapYear(year)) {
                days = 29;
            }

            System.out.printf("Number of days in %s %d: %d days%n", monthInput, year, days);
            break;
        }

        scanner.close();
    }

    private static String getMonthFromNumber(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return null;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
