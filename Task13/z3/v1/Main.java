package Study_Java.Task13.z3.v1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String addressString1 = scanner.nextLine();
        String addressString2 = scanner.nextLine();

        Address address1 = new Address(addressString1);
        Address address2 = new Address(addressString2);

        System.out.println("V1 Address 1:\n" + address1);
        System.out.println("\nV1 Address 2:\n" + address2);
    }
}