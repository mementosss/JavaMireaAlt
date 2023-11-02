package Study_Java.Task11.z5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class ListPerformanceComparison {
    public static void main(String[] args) {
        int n = 100000;
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList();

        // Add to the end
        Date startTime = new Date();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        Date endTime = new Date();
        long arrayListInsertionTime = endTime.getTime() - startTime.getTime();

        startTime = new Date();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        endTime = new Date();
        long linkedListInsertionTime = endTime.getTime() - startTime.getTime();

        // Del from mid
        startTime = new Date();
        for (int i = n / 2; i < n / 2 + n / 10; i++) {
            arrayList.remove(i);
        }
        endTime = new Date();
        long arrayListDeletionTime = endTime.getTime() - startTime.getTime();

        startTime = new Date();
        for (int i = n / 2; i < n / 2 + n / 10; i++) {
            linkedList.remove(i);
        }
        endTime = new Date();
        long linkedListDeletionTime = endTime.getTime() - startTime.getTime();

        // add to mid
        startTime = new Date();
        for (int i = 0; i < n; i++) {
            arrayList.add(n / 2, i);
        }
        endTime = new Date();
        long arrayListAdditionTime = endTime.getTime() - startTime.getTime();

        startTime = new Date();
        for (int i = 0; i < n; i++) {
            linkedList.add(n / 2, i);
        }
        endTime = new Date();
        long linkedListAdditionTime = endTime.getTime() - startTime.getTime();

        // Search
        startTime = new Date();
        arrayList.contains(49999);
        endTime = new Date();
        long arrayListSearchTime = endTime.getTime() - startTime.getTime();

        startTime = new Date();
        linkedList.contains(49999);
        endTime = new Date();
        long linkedListSearchTime = endTime.getTime() - startTime.getTime();
        
        System.out.println("ArrayList:");
        System.out.println("Insertion Time: " + arrayListInsertionTime + " ms");
        System.out.println("Deletion Time: " + arrayListDeletionTime + " ms");
        System.out.println("Addition Time: " + arrayListAdditionTime + " ms");
        System.out.println("Search Time: " + arrayListSearchTime + " ms");

        System.out.println("\nLinkedList:");
        System.out.println("Insertion Time: " + linkedListInsertionTime + " ms");
        System.out.println("Deletion Time: " + linkedListDeletionTime + " ms");
        System.out.println("Addition Time: " + linkedListAdditionTime + " ms");
        System.out.println("Search Time: " + linkedListSearchTime + " ms");
    }
}