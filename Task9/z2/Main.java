package Study_Java.Task9.z2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("James", 4.8),
                new Student("Michael", 3.1),
                new Student("Dmitriy", 5.0),
                new Student("Natalya", 3.7),
                new Student("Petya", 4.0)
        };

        Arrays.sort(students, new SortingStudentsByGPAWithFastSort());

        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGpa());
        }
    }
}
