package Study_Java.Task11.z1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class MainTaskReceivingDate {
    public static void main(String[] args) {
        String developerSurname = "Reznikov";

        Date taskReceivedDate = new Date(123, 9, 14, 9, 0, 0);
        Date taskPassing = new Date(123, 9, 18, 12, 44, 0);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Developer's surname: " + developerSurname);
        System.out.println("Date of receiving the task: " + dateFormat.format(taskReceivedDate));
        System.out.println("Date of passing the task: " + dateFormat.format(taskPassing));
    }
}