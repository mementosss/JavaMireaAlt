package Study_Java.Task11.z4;

import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class DateTimeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inpute year (example, 2023): ");
        int year = scanner.nextInt();

        System.out.print("\nInput month (1-12): ");
        int month = scanner.nextInt() - 1;

        System.out.print("\nInput day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("\nInput hours (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("\nInput minutes (0-59): ");
        int minutes = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);
        Date date = calendar.getTime();

        System.out.println("Object Date: " + date);

        System.out.println("Object Calendar: " + calendar.getTime());

        scanner.close();
    }
}