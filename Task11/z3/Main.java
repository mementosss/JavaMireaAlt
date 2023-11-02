package Study_Java.Task11.z3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date dateOfBirthFirstS = new Date(105, 0, 4);
        Date dateOfBirthSecondS = new Date(102, 3, 14);
        Date dateOfBirthThirdS = new Date(107, 11, 31);

        Student student1 = new Student("Michael", dateOfBirthFirstS);
        Student student2 = new Student("Vladimir", dateOfBirthSecondS);
        Student student3 = new Student("Pavel", dateOfBirthThirdS);

        System.out.println(student1);
        System.out.println("\n" + student2);
        System.out.println("\n" + student3);
        System.out.println("\nПривет");
    }
}