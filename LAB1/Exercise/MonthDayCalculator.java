package Exercise;
//EX6.4
import java.util.Scanner;

public class MonthDayCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;
        String inputMonth;
        int month;

        do {
            System.out.print("Enter a non-negative year: ");
            year = scanner.nextInt();
        } while (year < 0);

        System.out.print("Enter a month (full name, abbreviation, 3 letters, or number): ");
        inputMonth = scanner.next();

        month = convertMonthToNumber(inputMonth);

        if (month == -1) {
            System.out.println("Invalid month input. Please enter a valid month.");
        } else {
            int daysInMonth = getDaysInMonth(month, year);
            System.out.println("The number of days in the specified month is: " + daysInMonth + " days.");
        }

        scanner.close();
    }

    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year) && month == 2) {
            return 29;
        }

        return daysInMonth[month];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int convertMonthToNumber(String inputMonth) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"
        };

        // Try to parse the input as a number
        try {
            int monthNumber = Integer.parseInt(inputMonth);
            if (monthNumber >= 1 && monthNumber <= 12) {
                return monthNumber;
            }
        } catch (NumberFormatException e) {
            // Input was not a number
        }

        // Try to find a matching month by name or abbreviation
        for (int i = 1; i <= 12; i++) {
            if (months[i - 1].equalsIgnoreCase(inputMonth) ||
                months[i - 1].startsWith(inputMonth) ||
                (months[i - 1].length() >= 3 && months[i - 1].substring(0, 3).equalsIgnoreCase(inputMonth)) ||
                (months[i - 1].length() >= 3 && months[i - 1].substring(0, 3).equals(inputMonth))
            ) {
                return i;
            }
        }

        // If no match is found, return -1 (invalid)
        return -1;
    }
}
