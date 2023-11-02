package Study_Java.Task9.z1;

public class StudentSorterVstavkami {
    public static void insertionSort(Student[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getIDNumber() > key.getIDNumber()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}