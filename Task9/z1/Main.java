package Study_Java.Task9.z1;

public class Main extends StudentSorterVstavkami {
    public static void main(String[] args) {
        Student[] students = {
                new Student("James", 1),
                new Student("Michael", 3),
                new Student("Dmitriy", 4),
                new Student("Natalya", 2),
                new Student("Petya", 5)
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student.name + ": " + student.iDNumber);
        }

        insertionSort(students);

        System.out.println("\nAfter sorting by ID Number:");
        for (Student student : students) {
            System.out.println(student.name + ": " + student.iDNumber);
        }
    }
}