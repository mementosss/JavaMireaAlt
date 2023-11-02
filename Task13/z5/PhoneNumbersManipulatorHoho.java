package Study_Java.Task13.z5;

public class PhoneNumbersManipulatorHoho {
    public static String formatPhoneNumber(String phoneNumber) {

        String cleanNumber = phoneNumber.replaceAll("[^0-9]", "");
        if (cleanNumber.startsWith("8") && cleanNumber.length() == 11) {
            cleanNumber = "+7" + cleanNumber.substring(1);
        }

        if (cleanNumber.matches("^\\+7\\d{10}$")) {
            String countryCode = cleanNumber.substring(0, 2);
            String areaCode = cleanNumber.substring(2, 5);
            String firstPart = cleanNumber.substring(5, 8);
            String secondPart = cleanNumber.substring(8);

            return String.format("%s%s-%s-%s", countryCode, areaCode, firstPart, secondPart);
        } else {
            return "Incorrect Number!";
        }
    }
}