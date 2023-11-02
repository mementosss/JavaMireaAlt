package Study_Java.Task9.z2;

import java.util.Comparator;

public class SortingStudentsByGPAWithFastSort implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGpa() > student2.getGpa()) {
            return -1; // -1 => student1 before student2
        } else if (student1.getGpa() < student2.getGpa()) {
            return 1; // 1 => student2 before student1
        } else {
            return 0; // 0 => порядок не важен
        }
    }
}