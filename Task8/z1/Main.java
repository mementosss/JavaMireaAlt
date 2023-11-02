package Study_Java.Task8.z1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Count(printable) of the first symbols (n): ");
        int n = scanner.nextInt();
        scanner.close();

        int tekushyiSymvol = 1;
        int vyvedennyeSymvoly = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= tekushyiSymvol; j++) {
                if (vyvedennyeSymvoly < n) {
                    System.out.print(tekushyiSymvol + " ");
                    vyvedennyeSymvoly++;
                } else {
                    break;
                }
            }
            tekushyiSymvol++;
        }
    }
}