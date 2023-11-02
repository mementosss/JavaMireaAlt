package Study_Java.Task9.z3;

import java.util.ArrayList;
import java.util.List;

public class Main extends MergeSortStudents {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Dmitriy", 3.8));
        list1.add(new Student("Kseniya", 3.5));
        list1.add(new Student("Vladimir", 4.0));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Pavel", 3.9));
        list2.add(new Student("Daniil", 3.7));

        List<Student> mergedList = mergeSort(list1, list2);

        for (Student student : mergedList) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGpa());
        }
    }
}