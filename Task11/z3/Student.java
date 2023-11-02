package Study_Java.Task11.z3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date dateOfBirth;

    public Student(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String formatDateOfBirth(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(dateOfBirth);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nDate of Birth (short format): " + formatDateOfBirth("dd.MM.yy")
                + "\nDate of Birth (middle format): " + formatDateOfBirth("dd.MM.yyyy")
                + "\nDate of Birth (large format): " + formatDateOfBirth("dd MMMM yyyy");
    }
}