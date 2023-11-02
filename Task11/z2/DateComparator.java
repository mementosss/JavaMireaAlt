package Study_Java.Task11.z2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateComparator {
    public static void main(String[] args) {

        Date currentDate = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input some date in format dd.MM.yyyy: ");
        String userDateStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        try {
            Date userDate = dateFormat.parse(userDateStr);
            if (userDate.before(currentDate)) {
                System.out.println("The input (your) date is less then current date.");
            } else if (userDate.after(currentDate)) {
                System.out.println("The input (your) date is more then current date.");
            } else if (userDate.equals(currentDate)){
                System.out.println("The input (your) date equals to the current date.");
            }

        } catch (Exception e) {
            System.err.println("Wrong format of date! Make sure you used this format: (dd.MM.yyyy).");
        }

        scanner.close();
    }
}