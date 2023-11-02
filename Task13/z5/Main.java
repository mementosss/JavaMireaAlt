package Study_Java.Task13.z5;

import static Study_Java.Task13.z5.PhoneNumbersManipulatorHoho.formatPhoneNumber;

public class Main {
    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        System.out.println(formatPhoneNumber(phoneNumber1));
        System.out.println(formatPhoneNumber(phoneNumber2));
        System.out.println(formatPhoneNumber(phoneNumber3));
    }
}
