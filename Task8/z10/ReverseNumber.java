package Study_Java.Task8.z10;

public class ReverseNumber {
    public static int reverse(int n, int a) {
        if (n == 0) {
            return a;
        } else {
            return reverse((n / 10), (10 * a + n % 10));
        }
    }
}