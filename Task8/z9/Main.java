package Study_Java.Task8.z9;

public class Main extends MyClass {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        if (a > b) {
            a = b;
        }

        int result = countSequences(a, b);
        System.out.println("Count of Sequences: " + result);
    }
}
